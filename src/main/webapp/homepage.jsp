<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Homepage</title>
</head>

<body>

<c:choose>
    <c:when test="${cookie.acceptanceCookie == null}">
        <p>Informujemy, że ta strona korzysta z plików cookies.</p>
        </br>
        <a href="http://localhost:8080/jee_exam_3_war_exploded/homepage">Akceptuj</a>
    </c:when>
    <c:otherwise>
        <p>Witamy</p>
    </c:otherwise>
</c:choose>

</body>
</html>