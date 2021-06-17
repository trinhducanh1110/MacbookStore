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
    <title>Checkout</title>
</head>
<body style="padding-bottom: 100px">
<div class="container">
    <form method="post" action="/MacbookStore/cart/confirmOrder" style="margin-top: 20px">
        <table border="1" style="margin-left: auto; margin-right: auto; padding-bottom: 20px; text-align: center">
            <tr>
                <th>Product name</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Amount</th>
            </tr>
            <c:forEach var="item" items="${cart}">
                <tr>
                    <td>${item.getProductName()}</td>
                    <td>${item.getPrice()}</td>
                    <td>${item.getQuantity()}</td>
                    <td>${item.total()}</td>
                </tr>
            </c:forEach>
        </table>

        <h2 style="text-align: center">Delivery Information</h2>
        <div class="row">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <div class="row" style="margin-top: 10px">
                    <div class="col-md-4">Name</div>
                    <div class="col-md-8">
                        <input type="text" name="CustomerName" value="${customer.getCustomerName()}">
                    </div>
                </div>
                <div class="row" style="margin-top: 10px">
                    <div class="col-md-4">Phone number</div>
                    <div class="col-md-8">
                        <input type="text" name="PhoneNumber" value="${customer.getPhoneNumber()}">
                    </div>
                </div>
                <div class="row" style="margin-top: 10px">
                    <div class="col-md-4">Address</div>
                    <div class="col-md-8">
                        <input type="text" name="Address" value="${customer.getAddress()}">
                    </div>
                </div>
            </div>
            <div class="col-md-3"></div>
        </div>

        <div style="text-align: center; margin-top: 10px">
            <input type="submit" value="Confirm" style="margin-left: auto; margin-right: auto">
        </div>
    </form>
</div>
</body>
</html>
