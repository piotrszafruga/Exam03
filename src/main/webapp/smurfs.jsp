<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta charset="UTF-8">
</head>

<body>

<table style="width:100%">
    <tr>
        <th>Name</th>
        <th>Attribute</th>
        <th>Description</th>
    </tr>

    <c:forEach items="${list}" var="smurf">
        <tr>
            <td>${smurf.name}</td>
            <td>${smurf.attribute}</td>
            <td>${smurf.description}</td>
        </tr>
    </c:forEach>

</table>


</body>
</html>