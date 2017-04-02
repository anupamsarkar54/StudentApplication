<html>
<head>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

${student.name} Enroll Successful click <a href="/StudentApplication/getAllStudent">here</a> for full student List 

<table>
<c:forEach items="${studentList}" var="student">
    <tr>
        

            <td>${student.name}</td>
            <td>${student.age}</td>

        
    </tr>
</c:forEach>
</table>
</body>



</html>