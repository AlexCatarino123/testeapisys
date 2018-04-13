angular.module("myApp",['ui.router', 'myApp.controllers'])

.config(function ($stateProvider, $urlRouterProvider) {
	
	$urlRouterProvider.otherwise("home")
	
	$stateProvider
	
	.state('home',{
		url: "/home",
		templateUrl: "home.html"
	})
	
	.state('curso',{
		url: "/curso",
		templateUrl: "curso.html",
		controller: "CursoController"
	})
	
	.state('aluno',{
		url: "/aluno",
		templateUrl: "aluno.html",
		controller: "AlunoController"
	})
	
})