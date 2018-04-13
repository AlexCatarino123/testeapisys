var cursoApp = angular.module("AlunoControllers", []);

var urlBase = "http://localhost:8080";

cursoApp.controller("AlunoController", function($scope, $http) {

	$scope.listar = function() {
		$http.get(urlBase + "/alunos").then(function(response) {
			$scope.alunos = response.data;
		}, function(response) {
			window.alert("Erro na requisição!")
		});
	}
	
	$scope.listar();
	
	$scope.listarCursos = function() {
		$http.get(urlBase + "/cursos").then(function(response) {
			$scope.cursos = response.data;
		}, function(response) {
			window.alert("Erro na requisição!")
		});
	}
	
	
	$scope.listarCursos();
	
	$scope.salvar = function() {
		if (!$scope.aluno.id) {
			$http.post(urlBase + "/alunos", $scope.aluno).then(function(response) {
				$scope.listar();
				$scope.aluno = "";
			}, function(response) {
				window.alert("Erro na requisição!")
			});
		}else{
			$http.put(urlBase + "/alunos", $scope.aluno).then(function(response) {
				$scope.listar();
				$scope.aluno = "";
			}, function(response) {
				window.alert("Erro na requisição!")
			});
		}
		}
	
	$scope.editar = function (alunoSelecionado) {
		$scope.aluno = angular.copy(alunoSelecionado)
	}
	
	$scope.deletar = function (alunoSelecionado) {
		if (window.confirm("Deseja realmente deletar este aluno?")) {
			$http.delete(urlBase + "/alunos/" + alunoSelecionado.id).then(function(response) {
				$scope.listar();
				$scope.aluno = "";
			}, function(response) {
				window.alert("Erro na requisição!")
			});
		}
	}
	
});
