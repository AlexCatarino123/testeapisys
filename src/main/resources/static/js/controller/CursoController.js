var cursoApp = angular.module("CursoControllers", []);

var urlBase = "http://localhost:8080";

cursoApp.controller("CursoController", function($scope, $http) {

	$scope.listar = function() {
		$http.get(urlBase + "/cursos").then(function(response) {
			$scope.cursos = response.data;
		}, function(response) {
			window.alert("Erro na requisição!")
		});
	}
	
	$scope.listar();
	
	$scope.salvar = function() {
		console.log("Entrou no método")
		if (!$scope.curso.id) {
			$http.post(urlBase + "/cursos", $scope.curso).then(function(response) {
				$scope.listar();
				$scope.curso = "";
			}, function(response) {
				window.alert("Erro na requisição!")
			});
		}else{
			$http.put(urlBase + "/cursos", $scope.curso).then(function(response) {
				$scope.listar();
				$scope.curso = "";
			}, function(response) {
				window.alert("Erro na requisição!")
			});
		}
		}
	
	$scope.editar = function (cursoSelecionado) {
		$scope.curso = angular.copy(cursoSelecionado)
	}
	
	$scope.deletar = function (cursoSelecionado) {
		if (window.confirm("Deseja realmente deletar este curso?")) {
			$http.delete(urlBase + "/cursos/" + cursoSelecionado.id).then(function(response) {
				$scope.listar();
				$scope.curso = "";
			}, function(response) {
				window.alert("Erro na requisição!")
			});
		}
	}
	
});