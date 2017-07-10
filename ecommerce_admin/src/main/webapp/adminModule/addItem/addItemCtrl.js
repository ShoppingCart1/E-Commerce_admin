var app= angular.module('addItemApp',[]);
 
   app.controller("addItemCtrl",["$scope","$http", function($scope, $http) {
	   
	   var categories= null;
	   var subCategories=null;
	   
	   $scope.getCategory = function() {
		  
		   var req = {
    			   method: 'POST',
    			   url: 'ecommerce_admin/getCategories',
    			   data:{
    				   
    			   },headers: {
    			     'Content-Type': 'application/json'
    			   },
    			   params: null
    			   
    			}
	        $http(req).then(function(response) {
	        	$scope.categories = response.data;
	           
	        }, function(response) {
	            
	            console.log(response);
	          
	        });
	 
	    };
	    $scope.getSubCategory = function() {
	    	
	    	var dto={id:$scope.category};
			   var req = {
	    			   method: 'POST',
	    			   url: 'ecommerce_admin/getSubCategories',
	    			   data:{
	    				   
	    			   },headers: {
	    			     'Content-Type': 'application/json'
	    			   },
	    			   params: dto
	    			   
	    			}
		        $http(req).then(function(response) {
		        	$scope.subCategories = response.data;
		           
		        }, function(response) {
		            
		            console.log(response);
		          
		        });
		 
		    };
		    $scope.doSubmit= function() {
				  
				  var dto = { itemName: $scope.itemName, itemPrice:$scope.itemPrice, itemInventry:$scope.itemInventry, itemDescription:$scope.itemDescription, category:$scope.category, subCategory:$scope.subCategory}; 
				  
				  var req = {
		    			   method: 'GET',
		    			   url: 'ecommerce_admin/addItem',
		    			   data:{
		    				   
		    			   },headers: {
		    			     'Content-Type': 'application/json'
		    			   }, 
		    			   params: dto
		    			  }
				  $http(req).then(function(response) {
			            console.log(response.data);
			            $scope.message = response.data;
			        }, function(response) {
			            //fail case
			            console.log(response);
			            $scope.message = response;
			        });
			 
			    };
	  	  
   }]);