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
                    <form action="${pageContext.request.contextPath}/agentAddServlet" method="post">
                        <table>
                            <tr>
                                <td><p>Account Number: </p></td> 
                                <td><input type="text" id="agentNumber" name="agentNumber"/></td>
                            </tr>
                            <tr>
                                <td><p>Agent Name: </p></td>
                                <td><input type="text" id="agentName" name="agentName" required="required"/></td>
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