<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Bank Card</title>

    </head>
    <body>
        <table>
            <tr valign='top'><td><%@include file='/templates/sidebar.jsp'%></td>
                <td>
                    <form action="${pageContext.request.contextPath}/typeDeleteServlet" method="post">
                        <table>
                            <tr>
                                <td><select name="typeListVal" id="typeList">
                                        <c:forEach items="${typeList}" var="typeValue">
                                            <option value="${typeValue}">
                                                ${typeValue}
                                            </option>
                                        </c:forEach>
                                        <option value="${clearType}" selected="selected">
                                            ${clearType}
                                        </option>
                                    </select> </td>
                            </tr>

                            <tr>
                                <td><input type="submit" name = "submit" value="Delete" /></td>
                            </tr>
                            <tr>
                                <td><a href="${pageContext.request.contextPath}/typeAddServlet"> Add New Type </a></td>

                            </tr>
                        </table>
                    </form>
                </td>
            </tr>
        </table>

    </body>
</html>