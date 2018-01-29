angular.module('ASD',[])
.mainControlador('Activos', function ($scope,$http) {
    $http.get('http://rest-service.guides.spring.io/todos')
    then(function (response) {
        $scope.todos=response.data;
    });
});