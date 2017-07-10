var app = angular.module('mivimMain', [ 'ngRoute','addItemApp', 'mivimNonSecured','mivimHome' ]);

// configure our routes
app.config(function($routeProvider) {
	$routeProvider

	.when('/', {
		templateUrl : 'adminModule/home/home.html',
		controller : 'HomeCtrl'
	})
	// route for the login page
	.when('/login', {
		templateUrl : 'adminModule/login/login.html',
		controller : 'LoginCtrl'
	})
	// route for the home page
	.when('/home', {
		templateUrl : 'adminModule/home/home.html',
		controller : 'HomeCtrl'
	})
	.when('/addItem', {
		templateUrl : 'adminModule/addItem/addItem.html',
		controller : 'addItemCtrl'
	})
});