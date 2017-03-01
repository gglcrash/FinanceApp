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
                    <form action="${pageContext.request.contextPath}/agentServlet" 
                          method="get">
                        <table>
                            <tr>
                                <td><p>Agent:</p></td>
                                <td><select name="agentListVal" id="agentList"
                                            onchange="this.form.submit();">
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
                                <td><p>Agent Name: </p></td> 
                                <td><p>${agentName} </p></td>
                            </tr>
                            <tr>
                                <td><p>Agent Number: </p></td> 
                                <td><p>${agentNumber} </p></td>
                            </tr>
                            <tr> 
                                <td><a href="${pageContext.request.contextPath}/agentAddServlet"> Add New Agent </a></td>
                                <td><a href="${pageContext.request.contextPath}/agentDeleteServlet"> Delete Agent </a></td>
                            </tr>
                        </table>
                    </form>
                </td>
            </tr>
        </table>

    </body>
</html>