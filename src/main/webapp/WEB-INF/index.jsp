<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<body>
<h2>Employee Form</h2>

<form:form action="sendData" method="post" modelAttribute="employee">
    Employee Id: <form:input path="empId" /><br/><br/>
    Employee Name: <form:input path="empName" /><br/><br/>
    Employee Salary: <form:input path="empSal" /><br/><br/>
    Employee Dept: <form:input path="empDept" /><br/><br/>
    <input type="submit" value="Submit"/>
</form:form>

</body>
</html>