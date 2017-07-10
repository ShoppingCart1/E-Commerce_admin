var app= angular.module('mivimHome',[]);
 
   app.controller("HomeCtrl",["$scope","$http", function($scope, $http) {
	   
	   var items= null;
	   $scope.getData = function() {
		  
		   var req = {
    			   method: 'POST',
    			   url: 'ecommerce_admin/getItemsData',
    			   data:{
    				   
    			   },headers: {
    			     'Content-Type': 'application/json'
    			   },
    			   params: null
    			   
    			}
	        $http(req).then(function(response) {
	        	$scope.items = response.data;
	           
	        }, function(response) {
	            
	            console.log(response);
	          
	        });
	 
	    };
	  	  
   }]);
//   var app= angular.module('mivimHome',[]);
//   
//   app.controller("HomeCtrl", function($scope, $http) {
//	   $http.get("item.json").then(function(response) {
//			$scope.myData = response.data.records;
//		});	  
//   });