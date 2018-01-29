package Prueba;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.Id;
import java.util.Date;

@Controller
@RequestMapping(path = "ActivosPruebaAsd")


public class mainControlador {

    @Autowired
    private ActivosRepository activosRepository;

    @GetMapping(path = "/eliminar")
    public @ResponseBody
    Activos RemActivo(@RequestParam Integer Id){

        Activos eliminar = new Activos();
        eliminar.setId(Id);
        return eliminar;

    }
    @GetMapping(path = " /add")
    public @ResponseBody String addActivo(@RequestParam Integer Id, @RequestParam String nombre, @RequestParam String descripcion,
                                          @RequestParam String tipo, @RequestParam Integer serial, @RequestParam Integer numeroInterno,
                                          @RequestParam double peso, @RequestParam double alto, @RequestParam double ancho,
                                          @RequestParam double largo, double valorCompra, @RequestParam Date fechaCompra,
                                          @RequestParam Date fechabaja, @RequestParam String color){

        Activos nuevo = new Activos();
        nuevo.setId(Id);
        nuevo.setNombre(nombre);
        nuevo.setDescripcion(descripcion);
        nuevo.setTipo(tipo);
        nuevo.setSerial(serial);
        nuevo.setNumeroInterno(numeroInterno);
        nuevo.setPeso(peso);
        nuevo.setAlto(alto);
        nuevo.setAncho(ancho);
        nuevo.setLargo(largo);
        nuevo.setValorCompra(valorCompra);
        nuevo.setFechaCompra(fechaCompra);
        nuevo.setFechabaja(fechabaja);
        nuevo.setColor(color);
        return "Saved";
    }
@GetMapping(path = "/todos")
    public @ResponseBody
Class<ActivosRepository> getAllActivos(){

        return ActivosRepository.class;
}

}
