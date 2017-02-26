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
                                <td><p>To:</p></td>
                                <td><select name="cardListVal" id="cardList"
                                            onchange="${pageContext.request.contextPath}/bankCardServlet"
                                            method="get">
                                        <c:forEach items="${cardList}" var="cardValue">
                                            <option value="${cardValue}">
                                                ${cardValue}
                                            </option>
                                        </c:forEach>
                                    </select> </td>
                                <td> <a href="${pageContext.request.contextPath}/bankCardAddServlet"> Add New Card </a></td>
                                <td><input type="submit" name = "submit" value="Delete" /></td>
                            </tr>

                            <tr>
                                <td><p>Card Number: </p></td> 
                                <td><p>${cardNumber} </p></td>
                            </tr>
                            <tr>
                                <td><p>Owner Name: </p></td> 
                                <td><p>${ownerName} </p></td>
                            </tr>
                            <tr>
                                <td><p>Owner Surname: </p></td>
                                <td><p>${ownerSurname} </p></td>
                            </tr>
                            <tr>
                                <td><p>Expire Month: </p></td> 
                                <td><p>${expireMonth} </p></td>
                            </tr>
                            <tr>
                                <td><p>Expire Year: </p></td> 
                                <td><p>${expireYear} </p></td>
                            </tr>
                            <tr>
                                <td><p>CVV: </p></td>
                                <td><p>${cvv} </p></td>
                            </tr>
                            <tr>
                                <td><p>Current Amount: </p></td>
                                <td><p>${currentAmount} </p></td>
                            </tr>
                        </table>
                    </form>
                </td>
            </tr>
        </table>

    </body>
</html>