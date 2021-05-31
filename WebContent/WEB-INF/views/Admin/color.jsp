<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<div class="">
    <div style="text-align: center">
        <a style="text-align: center" href="/MacbookStore/admin/home" style="text-decoration: none; color: black;float: left">
            <div class="btn btn-outline-danger">
                Back
            </div>
        </a>

        <a style="text-align: center" href="/MacbookStore/admin/insertColorForm" style="text-decoration: none; color: black">
            <div class="btn btn-outline-success">
                Add Color
            </div>
        </a>
    </div>
    <table class="table">
        <tr>
            <th>
                ID
            </th>
            <th>
                Color ID
            </th>
            <th>
                Color Name
            </th>

            <th>

            </th>
        </tr>

        <c:forEach var="item" items="${color}">
            <tr>
                <td>
                        ${item.id}
                </td>
                <td>
                        ${item.colorID}
                </td>
                <td>
                        ${item.colorName}
                </td>

                <td>
                    <a href="/MacbookStore/admin/color/edit/${item.id}">
                        <input type="button" value="Edit" class="btn btn-warning">
                    </a>
                    <a href="/MacbookStore/admin/color/delete/${item.id}">
                        <input type="button" value="Delete" class="btn btn-outline-danger">
                    </a>
                </td>
            </tr>
        </c:forEach>

    </table>
</div>

