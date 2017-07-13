//var app= angular.module('updateItemApp',[]);
// 
//   app.controller("updateItemCtrl",["$scope","$routeParams","$location","$http", function($scope,$routeParams,$location,$http) {
//	   
//	   var categories= null;
//	   var subCategories=null;
//	   
//	   $scope.item=$routeParams.item;
//
//	   $scope.getCategory = function() {
//		  
//		   var req = {
//    			   method: 'POST',
//    			   url: 'ecommerce_admin/getCategories',
//    			   data:{
//    				   
//    			   },headers: {
//    			     'Content-Type': 'application/json'
//    			   },
//    			   params: null
//    			   
//    			}
//	        $http(req).then(function(response) {
//	        	$scope.categories = response.data;
//	           
//	        }, function(response) {
//	            
//	            console.log(response);
//	          
//	        });
//	 
//	    };
//	    $scope.getSubCategory = function() {
//	    	
//	    	var dto={id:$scope.category};
//			   var req = {
//	    			   method: 'POST',
//	    			   url: 'ecommerce_admin/getSubCategories',
//	    			   data:{
//	    				   
//	    			   },headers: {
//	    			     'Content-Type': 'application/json'
//	    			   },
//	    			   params: dto
//	    			   
//	    			}
//		        $http(req).then(function(response) {
//		        	$scope.subCategories = response.data;
//		           
//		        }, function(response) {
//		            
//		            console.log(response);
//		          
//		        });
//		 
//		    };
//		    $scope.doSubmit= function() {
//				  
//				  var dto = { itemName: $scope.itemName, itemPrice:$scope.itemPrice, itemInventry:$scope.itemInventry, itemDescription:$scope.itemDescription, category:$scope.category, subCategory:$scope.subCategory}; 
//				  
//				  var req = {
//		    			   method: 'GET',
//		    			   url: 'ecommerce_admin/updateItem',
//		    			   data:{
//		    				   
//		    			   },headers: {
//		    			     'Content-Type': 'application/json'
//		    			   }, 
//		    			   params: dto
//		    			  }
//				  $http(req).then(function(response) {
//			            console.log(response.data);
//			            $scope.message = response.data;
//			        }, function(response) {
//			            //fail case
//			            console.log(response);
//			            $scope.message = response;
//			        });
//			 
//			    };
//	  	  
//   }]);
var app= angular.module('updateItemApp',[]);
 
   app.controller("updateItemCtrl",["$scope","$routeParams","$http",'$location', function($scope,$routeParams, $http, $location) {
	   
	   
	   $scope.item=$routeParams.item;
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
				  
				  var dto = {itemName: $scope.itemName, unitPrice:$scope.unitPrice, itemInventry:$scope.itemInventry, itemDescription:$scope.itemDescription, category:$scope.category, subCategory:$scope.subCategory}; 
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
			            $scope.message = response.data;
			        }, function(response) {
			            //fail case
			            console.log(response);
			            $scope.message = response;
			        });
			 
			    };
	  	  
   }]);