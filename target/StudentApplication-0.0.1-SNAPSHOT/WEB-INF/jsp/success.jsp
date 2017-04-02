<html>
<head>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

${student.name} Enroll Successful click <a href="/StudentApplication/getAllStudent">here</a> for full student List 


<c:forEach items="${studentList}" var="student">
    <tr>
        <c:forEach items="${student}" var="entry">

            <td>${entry.name}</td>

        </c:forEach>
    </tr>
</c:forEach>
</body>



</html>