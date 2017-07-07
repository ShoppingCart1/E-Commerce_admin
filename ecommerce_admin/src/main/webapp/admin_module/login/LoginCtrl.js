 var app= angular.module('mivimNonSecured',[]);
 
   app.controller("LoginCtrl", function($scope,$http) {
	   $scope.sendPost = function() {
		   var dto = { email: $scope.email, password:$scope.password };
		   var req = {
    			   method: 'POST',
    			   url: 'ecommerce_admin/authentication',
    			   data:{
    				   
    			   },headers: {
    			     'Content-Type': 'application/json'
    			   }, 
    			   params: dto
    			  }
	        $http(req).then(function(response) {
	            console.log(response.data);
	           
	        }, function(response) {
	            //fail case
	            console.log(response);
	          
	        });
	 
	    };
	   
   });