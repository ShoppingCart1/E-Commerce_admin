var app = angular.module('mivimNonSecured', []);

app.controller("LoginCtrl", function($scope, $http, $location) {
			
		$scope.sendPost = function() {
				var dto = {
					email : $scope.email,
					password : $scope.password
				};
				var req = {
					method : 'POST',
					url : 'ecommerce_admin/authentication',
					data : {

					},
					headers : {
						'Content-Type' : 'application/json'
					},
					params : dto
				}
				$http(req).then(function(response) {
					console.log(response.data);
					console.log(response.data.status);

					if(response.data.status=="200"){
						window.location.reload();
						$location.path("/");
					}
					else{
						//alert("username or password mismatches")
					//	window.location.reload();

						var errorMessage="Username or password error";
						$scope.errorMessage = errorMessage;

						//$location.path("/login");

					}
					
//					window.location.reload();
//					$location.path("/");
				}, function(response) {

					console.log(response.data);

				});

			};

		} );