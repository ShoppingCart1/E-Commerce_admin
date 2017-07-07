var app = angular.module('mivimMain', [ 'ngRoute', 'mivimNonSecured','mivimRegister','mivimHome' ]);

// configure our routes
app.config(function($routeProvider) {
	$routeProvider

	.when('/', {
		templateUrl : 'admin_module/home/home.html',
		controller : 'HomeCtrl'
	})
	// route for the login page
	.when('/login', {
		templateUrl : 'admin_module/login/login.html',
		controller : 'LoginCtrl'
	})

	// route for the SignUp page
	.when('/Register', {
		templateUrl : 'admin_module/register/Register.html',
		controller : 'RegisterCtrl'
	})
	// route for the home page
	.when('/home', {
		templateUrl : 'admin_module/home/home.html',
		controller : 'HomeCtrl'
	})
});
app.controller("HomeCtrl", function($scope, $http) {
	
	$http.get("item.json").then(function(response) {
		$scope.myData = response.data.records;
	});
});