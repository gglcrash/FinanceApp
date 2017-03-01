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
                    <form action="${pageContext.request.contextPath}/bankCardDeleteServlet" method="post">
                        <table>
                            <tr>
                                <td><select name="cardListVal" id="cardList">
                                        <c:forEach items="${cardList}" var="cardValue">
                                            <option value="${cardValue}">
                                                ${cardValue}
                                            </option>
                                        </c:forEach>
                                        <option value="${clearCard}" selected="selected">
                                            ${clearCard}
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