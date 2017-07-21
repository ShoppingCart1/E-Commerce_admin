var app = angular.module('mivimItemView', []);

app.controller("itemviewctrl", [ "$scope", '$routeParams', '$http',
		'$location', function($scope, $routeParams, $http, $location) {

			if (!$routeParams.item || $routeParams.item === "[object Object]" ) {
				$location.path("/home");
				return;
			}
			$scope.item = $routeParams.item;

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
					// $scope.item = response.data;
					
					
//					$location.path("/updateItem");
					$location.path("/updateItem").search({
						item : response.data[0]
					});
					if (!$scope.$$phase) {
						$scope.$apply();
					}

				}, function(response) {

					console.log(response);

				});

			};
			$scope.removeItem = function(itemId) {
				var dto = {
					id : itemId
				};
				var req1 = {
					method : 'GET',
					url : 'ecommerce_admin/removeItem',
					data : {

					},
					headers : {
						'Content-Type' : 'application/json'
					},
					params : dto

				}
				$http(req1).then(function(response) {
			
					alert(response.data)
					$location.path("/");
					if (!$scope.$$phase) {
						$scope.$apply();
					}

				}, function(response) {

					console.log(response);

				});

			};
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

		} ]);

app.directive('ngConfirmClick', [ function() {
	return {
		link : function(scope, element, attr) {
			var msg = attr.ngConfirmClick || "Are you sure?";
			var clickAction = attr.confirmedClick;
			element.bind('click', function(event) {
				if (window.confirm(msg)) {
					scope.$eval(clickAction)
				}
			});
		}
	};
} ])
