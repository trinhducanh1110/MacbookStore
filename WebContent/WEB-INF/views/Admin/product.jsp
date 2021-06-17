<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<div class="">
    <div style="text-align: center">
    <a style="text-align: center" href="/MacbookStore/admin/home" style="text-decoration: none; color: black;float: left">
        <div class="btn btn-outline-danger">
            Back
        </div>
    </a>

    <a style="text-align: center" href="/MacbookStore/admin/insertProductForm" style="text-decoration: none; color: black">
        <div class="btn btn-outline-success">
            Add Macbook
        </div>
    </a>
    </div>
    <table class="table">
        <tr>
            <th>

            </th>
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
                Image Main
            </th>
            <th>
                Image 1
            </th>
            <th>
                Image 2
            </th>
            <th>
                Image 3
            </th>
        </tr>

        <c:forEach var="item" items="${product}">
        <tr>
            <td>
                <a href="/MacbookStore/admin/product/editproduct/${item.id}">
                    <input type="button" value="Edit" class="btn btn-warning">
                </a>
                <a href="/MacbookStore/admin/product/delete/${item.id}">
                    <input type="button" value="Delete" class="btn btn-outline-danger">
                </a>
            </td>
            <td>
                ${item.productName}
            </td>
            <td>
                ${item.description}
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
                <img src="${item.image}" alt="" class="img-fluid">
            </td>
            <td>
                <img src="${item.image1}" alt="" class="img-fluid">
            </td>
            <td>
                <img src="${item.image2}" alt="" class="img-fluid">
            </td>
            <td>
                <img src="${item.image3}" alt="" class="img-fluid">
            </td>
        </tr>
        </c:forEach>

    </table>
</div>

