<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%--   <jsp:useBean id="dataController" 
                     class="com.netcracker.financeapp.controller.DataController" scope="session"/>
        --%>
        <select name="database1">
            <c:forEach items="${incomeTypeList}" var="incomeTypeValue">
                <option value="${incomeTypeValue}">
                    ${incomeTypeValue}
                </option>
            </c:forEach>
        </select>
    </body>
</html>