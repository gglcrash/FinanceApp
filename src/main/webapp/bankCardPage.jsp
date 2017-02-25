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
                    <form action="${pageContext.request.contextPath}/bankCardServlet" method="post">
                        <table>
                            <tr>
                                <td><p>Card Number: </p></td> 
                                <td><input type="text" id="cardNumber" name="cardNumber" required="required"/></td>
                            </tr>
                            <tr>
                                <td><p>Owner Name: </p></td> 
                                <td><input type="text" id="ownerName" name="ownerName" required="required"/></td>
                            </tr>
                            <tr>
                                <td><p>Owner Surname: </p></td>
                                <td><input type="text" id="ownerSurname" name="ownerSurname" required="required"/></td>
                            </tr>
                            <tr>
                                <td><p>Expire Month: </p></td> 
                                <td><input type="text" id="expireMonth" name="expireMonth" required="required"/></td>
                            </tr>
                            <tr>
                                <td><p>Expire Year: </p></td> 
                                <td><input type="text" id="expireYear" name="expireYear" required="required"/></td>
                            </tr>
                            <tr>
                                <td><p>CVV: </p></td>
                                <td><input type="text" id="cvv" name="cvv" required="required"/></td>
                            </tr>
                            <tr>
                                <td><p>Current Amount: </p></td>
                                <td><input type="text" id="currentAmount" name="currentAmount" required="required"/></td>
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