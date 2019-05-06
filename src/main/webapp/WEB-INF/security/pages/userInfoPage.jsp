<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>User Info</title>
</head>
<body>
<!-- Include _menu.jsp -->
<th:block th:include="/_menu"></th:block>


<h2>User Info Page</h2>
<h3>Welcome : <span th:utext="${#request.userPrincipal.name}"></span></h3>
<b>This is protected page!</b>

<br/><br/>

<div th:if="${userInfo != null}" th:utext="${userInfo}"></div>

</body>

</html>