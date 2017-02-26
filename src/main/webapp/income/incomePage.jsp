<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Add Income</title>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <link rel="stylesheet" href="/resources/demos/style.css">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script>
            $(function () {
                $("#datepicker").datepicker();
            });
        </script>
    </head>
    <body>
        <table>
            <tr valign='top'><td><%@include file='/templates/sidebar.jsp'%></td>
                <td>
            <center>
                <p><h2>Insert new income:</h2></p>
            </center>
            <form action="${pageContext.request.contextPath}/incomeServlet" method="post">
                <table>
                    <tr>
                        <td><p>Income Type:</p></td>
                        <td><select name="incomeType" id="incomeType">
                                <c:forEach items="${incomeTypeList}" var="incomeTypeValue">
                                    <option value="${incomeTypeValue}">
                                        ${incomeTypeValue}
                                    </option>
                                </c:forEach>
                            </select> </td>
                        <td><a href="${pageContext.request.contextPath}/typeAddServlet"> Add New Type </a></td>
                    </tr>
                    <tr>
                        <td><p>Value: </p></td> 
                        <td><input type="text" id="value" name="value" required="required"/></td>
                    </tr>
                    <tr>
                        <td><p>Date: </p></td>
                        <td><input type="text" id="datepicker" name="date" required="required"/></td>
                    </tr>
                    <tr>
                        <td><p>Description: </p></td> 
                        <td><input type="text" id="description" name="description"/> </br></td>
                    </tr>
                    <tr>
                        <td><p>From:</p></td>
                        <td><select name="fromListVal" id="fromList">
                                <c:forEach items="${fromList}" var="fromValue">
                                    <option value="${fromValue}">
                                        ${fromValue}
                                    </option>
                                </c:forEach>
                            </select> </td>
                            
                        <td><a href="templates/sidebar.jsp"> Add New</a></td>
                    </tr>
                    <tr>
                        <td><p>To:</p></td>
                        <td><select name="toListVal" id="toList">
                                <c:forEach items="${toList}" var="toValue">
                                    <option value="${toValue}">
                                        ${toValue}
                                    </option>
                                </c:forEach>
                            </select> </td>
                            
                        <td><a href="templates/sidebar.jsp"> Add New</a></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name = "submit" value="Submit" /></td>
                    </tr>

                </table>
            </form>
        </td>
    </tr>
</table>

</body>
</html>