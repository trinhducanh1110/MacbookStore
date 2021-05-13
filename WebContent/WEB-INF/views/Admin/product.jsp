<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<div class="">
    <div style="text-align: center">
    <a style="text-align: center" href="#" style="text-decoration: none; color: black;float: left">
        <div class="btn btn-outline-danger">
            Back
        </div>
    </a>

    <a style="text-align: center" href="#" style="text-decoration: none; color: black">
        <div class="btn btn-outline-success">
            Add Macbook
        </div>
    </a>
    </div>
    <table class="table">
        <tr>
            <th>
                Name
            </th>
            <th>
                Description
            </th>
            <th>
                Price Sold
            </th>
            <th>
                Sold
            </th>
            <th>
                Status
            </th>
            <th>
                Stock
            </th>
            <th>
                Color
            </th>
            <th>
                Cpu
            </th>
            <th>
                DisplayCard
            </th>
            <th>
                Display
            </th>
            <th>
                Group
            </th>
            <th>
                HardDrive
            </th>
            <th>
                Product
            </th>
            <th>
                Ram
            </th>
            <th>
                Year
            </th>
            <th>

            </th>
        </tr>

        <c:forEach var="item" items="${product}">
        <tr>
            <td>
                ${item.productName}
            </td>
            <td>

            </td>
            <td>
                ${item.price}
            </td>
            <td>
                ${item.sold}
            </td>
            <td>
                ${item.status}
            </td>
            <td>
                ${item.stock}
            </td>
            <td>
                ${item.colorID}
            </td>
            <td>
                ${item.cpuID}
            </td>
            <td>
                ${item.displayCardID}
            </td>
            <td>
                ${item.displayID}
            </td>
            <td>
                ${item.groupID}
            </td>
            <td>
                ${item.hardDriveID}
            </td>
            <td>
                ${item.productID}
            </td>
            <td>
                ${item.ramID}
            </td>
            <td>
                ${item.yearID}
            </td>
            <td>
                <input type="button" value="Edit" class="btn btn-warning">
                <input type="button" value="Delete" class="btn btn-outline-danger">
            </td>
        </tr>
        </c:forEach>

    </table>
</div>

