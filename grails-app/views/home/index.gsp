<%--
  Created by IntelliJ IDEA.
  User: thandomafela
  Date: 14/07/15
  Time: 22:37
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Home page</title>
</head>

<body>
    <div ng-controller="GreetController">
        <button ng-click="sayHello()">Hello You</button>

        <input type="text" ng-model="user"/>
        <button ng-click="saveUser()">Add</button>
    </div>

    <div ng-controller="ServiceController">
        <br/>
        <label for="username">Type in a github username</label><br/>
        <input type="text" ng-model="username" placeholder="Enter a gitHub username"/>
        {{username}}
        <ul>
            <li ng-repeat="event in events">
                {{event.actor.login}} {{event.repo.name}}
            </li>
        </ul>
    </div>
</body>
</html>