var app = angular.module('mivimMain', [ 'ngRoute','addItemApp','mivimItemView','updateItemApp' ,'mivimNonSecured','mivimHome' ]);

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
	.when('/updateItem', {
		templateUrl : 'adminModule/updateItem/updateItem.html',
		controller : 'updateItemCtrl'
	})
	.when('/itemview', {
		templateUrl : 'itemview.html',
		controller : 'itemviewctrl'
	})
});
app.controller("MainCtrl", [ "$scope", "$http", function($scope, $http) {

	var userData = null;

	$scope.getUserData = function() {

		var req = {
			method : 'POST',
			url : 'ecommerce_admin/getUserData',
			data : {

			},
			headers : {
				'Content-Type' : 'application/json'
			},
			params : null

		}
		$http(req).then(function(response) {
			console.log(response.data);
			$scope.userData = response.data;
			
				

		}, function(response) {

			console.log(response);

		});

	};

	$scope.doLogout = function() {

		var req = {
			method : 'POST',
			url : 'ecommerce_admin/logout',
			data : {

			},
			headers : {
				'Content-Type' : 'application/json'
			},
			params : null

		}
		$http(req).then(function(response) {
			console.log(response.data);
			$scope.userData = response.data;
            window.location.reload();
            $location.path("/");

		}, function(response) {

			console.log(response);

		});

	};
} ]);
