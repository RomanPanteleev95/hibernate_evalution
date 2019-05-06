<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Access Denied</title>
</head>

<body>
<!-- Include _menu.jsp -->
<th:block th:include="/_menu"></th:block>

<h3 th:if="${message != null}" th:utext="${message}" style="color: red;"></h3>

<div th:if="${userInfo != null}" th:utext="${userInfo}"></div>

</body>

</html>