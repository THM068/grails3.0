// This is a manifest file that'll be compiled into application.js.
//
// Any JavaScript file within this directory can be referenced here using a relative path.
//
// You're free to add application-wide JavaScript to this file, but it's generally better 
// to create separate JavaScript files as needed.
//
//= require jquery-2.1.3.js
//= require_tree .
//= require_self

var app = angular.module("tutorial", []).
    factory('greeter', function(){
        return {
            greet: function(msg) { alert(msg); }
        }
    });



app.factory('UserService', function($http){
   var currentUser;

    return {
        getCurrentUser: function() {
            return currentUser;
        },

        setCurrentUser: function(user) {
            currentUser = user;
        }
    }
});

app.factory('githubService', function($http){
    var  githubUrl = 'http://api.github.com';

    var runUserRequest = function(username, path){

        return $http({
            method: 'JSONP',
            url: githubUrl + '/users/' + username +'/' + path + '?callback=JSON_CALLBACK'
        });
    }

    return {
        events: function(username) {
            return runUserRequest(username, 'events');
        }
    }

});

app.controller('GreetController', function($scope, greeter,UserService){
    $scope.sayHello = function() {
        greeter.greet("Hello Dolly");
    }

    $scope.saveUser = function() {
        UserService.setCurrentUser($scope.user)
        console.log(UserService.getCurrentUser());
    }
});

app.controller('ServiceController', function($scope, $timeout, githubService) {
    var timeout;
    $scope.$watch('username', function(username) {
        if(username) {
            if(timeout) {
                $timeout.cancel(timeout);
            }
                timeout = $timeout(function(){
                    githubService.events($scope.username).success(function(data, status, headers){
                        //success function wraps response in a data object
                        $scope.events = data.data
                    });
                }, 350);
            }

    });
});