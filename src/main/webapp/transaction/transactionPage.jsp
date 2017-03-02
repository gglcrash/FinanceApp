<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Transaction Page</title>
        <style type="text/css">
            table.gridtable {
                font-family: verdana,arial,sans-serif;
                font-size:11px;
                color:#333333;
                border-width: 1px;
                border-color: #666666;
                border-collapse: collapse;
            }
            table.gridtable th {
                border-width: 1px;
                padding: 8px;
                border-style: solid;
                border-color: #666666;
                background-color: #dedede;
            }
            table.gridtable td {
                border-width: 1px;
                padding: 8px;
                border-style: solid;
                border-color: #666666;
                background-color: #ffffff;
            }
        </style>
    </head>
    <body>
        <table>
            <tr valign='top'>
                <td><%@include file='/templates/sidebar.jsp'%></td>
                <td>
                    <form action="${pageContext.request.contextPath}/transactionServlet" 
                          method="get">
                        <select name="optionListVal" id="optionList"
                                onchange="this.form.submit();">
                            <c:forEach items="${optionList}" var="optionValue">
                                <option value="${optionValue}">
                                    ${optionValue}
                                </option>
                            </c:forEach>
                            <option value="${clearOption}" selected="selected">
                                ${clearOption}
                            </option>
                        </select> <br/><br/>
                        <table class = "gridtable">
                            <tr>
                                <td><c:out value="Transaction Type" /></td>
                                <td><c:out value="Finance Type" /></td>
                                <td><c:out value="Value" /></td>
                                <td><c:out value="Agent" /></td>
                                <td><c:out value="Bank Card" /></td>
                                <td><c:out value="Date" /></td>
                            </tr>
                            <c:forEach items="${transList}" var="transaction">
                                <tr>
                                    <td><c:out value="${transaction.transactionTypeName}" /></td>
                                    <td><c:out value="${transaction.financeTypeName}" /></td>
                                    <td><c:out value="${transaction.financeValue}" /></td>
                                    <td><c:out value="${transaction.agentName}" /></td>
                                    <td><c:out value="${transaction.bankCardNumber}" /></td>
                                    <td><c:out value="${transaction.financeDate}" /></td>
                                </tr>
                            </c:forEach>
                        </table> 
                    </form>
                </td>
            </tr>
        </table>


    </body>
</html>


<%-- <tr>
                   <td><p>Select Option:</p></td>
                   <td><select name="optionListVal" id="optionList"
                               onchange="this.form.submit();">
                           <c:forEach items="${optionList}" var="optionValue">
                               <option value="${optionValue}">
                                   ${optionValue}
                               </option>
                           </c:forEach>
                           <option value="${clearOption}" selected="selected">
                               ${clearOption}
                           </option>
                       </select> </td>
               </tr>
--%>