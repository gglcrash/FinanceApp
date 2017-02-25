<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Income</title>
       
    </head>
    <body>
        <table>
            <tr valign='top'><td><%@include file='/templates/sidebar.jsp'%></td>
                <td>
                    <form action="${pageContext.request.contextPath}/bankCardServlet" method="post">
                        <table>
                            <tr>
                                <td><p>Card Number: </p></td> 
                                <td><input type="text" id="cardNumber" name="cardNumber"/></td>
                            </tr>
                            <tr>
                                <td><p>Owner Name: </p></td> 
                                <td><input type="text" id="ownerName" name="ownerName"/></td>
                            </tr>
                            <tr>
                                <td><p>Owner Surname: </p></td>
                                <td><input type="text" id="ownerSurname" name="ownerSurname"/></td>
                            </tr>
                            <tr>
                                <td><p>Expire Date: </p></td> 
                                <td><input type="text" id="expireMonth" name="expireMonth"/></td>
                            </tr>
                            <tr>
                                <td><p>Expire Year: </p></td> 
                                <td><input type="text" id="expireYear" name="expireYear"/></td>
                            </tr>
                            <tr>
                                <td><p>CVV: </p></td>
                                <td><input type="text" id="cvv" name="cvv"/></td>
                            </tr>
                            <tr>
                                <td><p>Current Amount: </p></td>
                                <td><input type="text" id="currentAmount" name="currentAmount"/></td>
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