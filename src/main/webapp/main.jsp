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
                    <form action="main" method="post">
                        <table>
                            <tr>
                                <td><p>Income Type:</p></td>
                                <td><select name="incomeType">
                                        <c:forEach items="${incomeTypeList}" var="incomeTypeValue">
                                            <option value="${incomeTypeValue}">
                                                ${incomeTypeValue}
                                            </option>
                                        </c:forEach>
                                    </select> </td>
                                <td><a href="templates/sidebar.jsp"> Add New Type </a></td>
                            </tr>
                            <tr>
                                <td><p>Value: </p></td> 
                                <td><input type="text" name="value"></td>
                            </tr>
                            <tr>
                                <td><p>Date: </p></td>
                                <td><input type="text" id="datepicker" name="date"></td>
                            </tr>
                            <tr>
                                <td><p>Description: </p></td> 
                                <td><input type="text" name="description"> </br></td>
                            </tr>
                            <tr>
                                <td><input type="submit" value="Submit" /></td>
                            </tr>

                        </table>
                    </form>
                </td>
            </tr>
        </table>

    </body>
</html>