<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
        <table>
            <tr valign='top'><td><%@include file='/templates/sidebar.jsp'%></td>
                <td>
                    <form action="${pageContext.request.contextPath}/typeAddServlet" method="post">
                        <INPUT TYPE="radio" NAME="radios" VALUE="INCOME" CHECKED>
                        Income Type
                        <INPUT TYPE="radio" NAME="radios" VALUE="SPENDING">
                        Spending Type
                        <BR>
                        <input type="text" id="typeName" name="typeName" required="required"/>
                        <input type="submit" name = "submit" value="Add" />   
                    </form>
                </td>
            </tr>
    </body>
</html>
