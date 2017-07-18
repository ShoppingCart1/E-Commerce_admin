var app = angular.module('mivimHome', []);

app.controller("HomeCtrl", [ "$scope", "$http", '$location', '$window',
		function($scope, $http, $location, $window) {

			var items ;
			var item ;

			$scope.getData = function() {

				var req = {
					method : 'POST',
					url : 'ecommerce_admin/getItemsData',
					data : {

					},
					headers : {
						'Content-Type' : 'application/json'
					},
					params : null

				}
				$http(req).then(function(response) {
					$scope.items = response.data;

				}, function(response) {

					console.log(response);

				});

			};
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
					$scope.item = response.data;

					$location.path("/itemview").search({item:  response.data[0]});
					if (!$scope.$$phase) {
						$scope.$apply();
					}

				}, function(response) {

					console.log(response);

				});

			};

		} ]);