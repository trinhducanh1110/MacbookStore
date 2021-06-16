<%--
  Created by IntelliJ IDEA.
  User: hiept
  Date: 6/4/2021
  Time: 10:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="padding-bottom: 100px; padding-top: 20px">
<form method="post" action="/MacbookStore/cart/checkout" style="margin-top: 20px">
        <table border="1" style="margin-left: auto; margin-right: auto; padding-bottom: 20px; text-align: center">
            <tr>
                <th>Product name</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Amount</th>
                <th></th>
            </tr>
            <c:forEach var="item" items="${cart}">
            <tr>
                <td>${item.getProductName()}</td>
                <td>${item.getPrice()}</td>
                <td>${item.getQuantity()}</td>
                <td>${item.total()}</td>
                <td>
                    <a href="/MacbookStore/cart/delete/${item.get_id()}">
                        <input class="btn btn-danger" type="button" value="Delete">
                    </a>
                </td>
            </tr>
            </c:forEach>
        </table>
        <div style="margin-top: 20px; text-align: center">
            <input style="margin-left: auto; margin-right: auto" type="submit" value="Check Out"/>
        </div>
</form>
</body>
</html>
