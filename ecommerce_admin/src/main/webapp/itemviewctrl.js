var app= angular.module('mivimItemView',[]);
 
   app.controller("itemviewctrl",["$scope", '$routeParams', function($scope, $routeParams) {
	   
	   
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
				$scope.item = response.data;

				$location.path("/updateItem").search({item:  response.data[0]});
				if (!$scope.$$phase) {
					$scope.$apply();
				}

			}, function(response) {

				console.log(response);

			});

		};
  	  
   }]);