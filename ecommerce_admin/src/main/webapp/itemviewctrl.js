//var app= angular.module('mivimItemView',[]);
// 
//   app.controller("itemviewctrl",["$scope", "http","$location", function($scope, $http, $location) {
//	   
//	   
//	   $scope.item=$routeParams.item;
//	
//	   $scope.getItemDataById = function(itemId) {
//
//			var dto = {
//				id : itemId
//			};
//			var req = {
//				method : 'POST',
//				url : 'ecommerce_admin/getItemDataById',
//				data : {
//
//				},
//				headers : {
//					'Content-Type' : 'application/json'
//				},
//				params : dto
//
//			}
//			$http(req).then(function(response) {
//				$scope.item = response.data;
//
//				$location.path("/updateItem").search({item:  response.data[0]});
//				if (!$scope.$$phase) {
//					$scope.$apply();
//				}
//
//			}, function(response) {
//
//				console.log(response);
//
//			});
//
//		};
//  	  
//   }]);
var app= angular.module('mivimItemView',[]);
 
   app.controller("itemviewctrl",["$scope", '$routeParams','$http','$location', function($scope, $routeParams, $http, $location) {
	   
	   
	   $scope.item=$routeParams.item;
	
	   $scope.getItemDataById = function(itemId) {

			var dto = {
				id : itemId
			};
			var req = {
				method : 'POST',
				url : 'ecommerce_admin/getItemDataById',
				data : {

				},
				headers : {
					'Content-Type' : 'application/json'
				},
				params : dto

			}
			$http(req).then(function(response) {
//				$scope.item = response.data;

				$location.path("/updateItem").search({item:  response.data[0]});
				if (!$scope.$$phase) {
					$scope.$apply();
				}

			}, function(response) {

				console.log(response);

			});

		};
		$scope.getRemoveItem = function(itemId) {

			var dto = {
				id : itemId
			};
			var req = {
				method : 'POST',
				url : 'ecommerce_admin/removeItem',
				data : {

				},
				headers : {
					'Content-Type' : 'application/json'
				},
				params : dto

			}
			$http(req).then(function(response) {
//				$scope.item = response.data;

				$location.path("/");
				if (!$scope.$$phase) {
					$scope.$apply();
				}

			}, function(response) {

				console.log(response);

			});

		};
  	  
   }]);