<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<div class="">
    <div style="text-align: center">
        <a style="text-align: center" href="/MacbookStore/admin/home" style="text-decoration: none; color: black;float: left">
            <div class="btn btn-outline-danger">
                Back
            </div>
        </a>

        <a style="text-align: center" href="/MacbookStore/admin/insertCustomerForm" style="text-decoration: none; color: black">
            <div class="btn btn-outline-success">
                Add Customer
            </div>
        </a>
    </div>
    <table class="table">
        <tr>
            <th>
                Username
            </th>
            <th>
                Password
            </th>
            <th>
                Full Name
            </th>
            <th>
                Phone Number
            </th>
            <th>
                Address
            </th>
            <th>
                Birth
            </th>
            <th>
                Email
            </th>
            <th>

            </th>
        </tr>

        <c:forEach var="item" items="${customer}">
            <tr>
                <td>
                        ${item.username}
                </td>
                <td>
                        ${item.password}
                </td>
                <td>
                        ${item.customerName}
                </td>
                <td>
                        ${item.phoneNumber}
                </td>
                <td>
                        ${item.address}
                </td>
                <td>
                        ${item.birth}
                </td>
                <td>
                        ${item.email}
                </td>
                <td>
                    <a href="/MacbookStore/admin/customer/edit/${item.id}">
                        <input type="button" value="Edit" class="btn btn-warning">
                    </a>
                    <a href="/MacbookStore/admin/customer/delete/${item.id}">
                        <input type="button" value="Delete" class="btn btn-outline-danger">
                    </a>
                </td>
            </tr>
        </c:forEach>

    </table>
</div>

