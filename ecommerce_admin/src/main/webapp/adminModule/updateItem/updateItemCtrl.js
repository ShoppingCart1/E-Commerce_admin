var app= angular.module('updateItemApp',[]);
 
   app.controller("updateItemCtrl",["$scope","$routeParams","$http",'$location', function($scope,$routeParams, $http, $location) {
	   
	   if (!$routeParams.item || $routeParams.item === "[object Object]" ) {
			$location.path("/home");
			return;
		}
	   
	   $scope.item=$routeParams.item;
	   $scope.category = $scope.item.categoryId;
	   $scope.subCategory = $scope.item.subCategoryId;
	   
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
	        	$scope.getSubCategory($scope.item.categoryId);
	           
	        }, function(response) {
	            
	            console.log(response);
	          
	        });
	 
	    };
	    $scope.getSubCategory = function(categoryId) {
	    	
	    	if(!categoryId){
	    		return;
	    	}
	    	var dto={id:categoryId};
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
				  
				  var dto = {id: $scope.id, itemName: $scope.itemName, unitPrice:$scope.unitPrice, inventary:$scope.inventary, itemDescription:$scope.itemDescription, category:$scope.category, subCategory:$scope.subCategory}; 
				  var req = {
		    			   method: 'GET',
		    			   url: 'ecommerce_admin/updateItem',
		    			   data:{
		    				   
		    			   },headers: {
		    			     'Content-Type': 'application/json'
		    			   }, 
		    			   params: dto
		    			  }
				  $http(req).then(function(response) {
			            console.log(response.data);
			            alert(response.data);
			            $location.path("/");
			            $scope.message = response.data;
			        }, function(response) {
			            //fail case
			            console.log(response);
//			            alert("Failed..!!!Its not urs. Its ours");
			           
			            $scope.message = response;
			        });
			 
			    };
			    
			    $scope.getCategory();
	  	  
   }]);