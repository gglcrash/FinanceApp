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
                    <form action="${pageContext.request.contextPath}/agentDeleteServlet" method="post">
                        <table>
                            <tr>
                                <td><select name="agentListVal" id="agentList">
                                        <c:forEach items="${agentList}" var="agentValue">
                                            <option value="${agentValue}">
                                                ${agentValue}
                                            </option>
                                        </c:forEach>
                                        <option value="${clearAgent}" selected="selected">
                                            ${clearAgent}
                                        </option>
                                    </select> </td>
                            </tr>

                            <tr>
                                <td><input type="submit" name = "submit" value="Delete" /></td>
                            </tr>

                        </table>
                    </form>
                </td>
            </tr>
        </table>

    </body>
</html>