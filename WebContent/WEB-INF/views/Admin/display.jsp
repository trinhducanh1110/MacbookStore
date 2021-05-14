<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<div class="">
    <div style="text-align: center">
        <a style="text-align: center" href="/MacbookStore/admin/home" style="text-decoration: none; color: black;float: left">
            <div class="btn btn-outline-danger">
                Back
            </div>
        </a>

        <a style="text-align: center" href="/MacbookStore/admin/insertDisplayForm" style="text-decoration: none; color: black">
            <div class="btn btn-outline-success">
                Add Display
            </div>
        </a>
    </div>
    <table class="table">
        <tr>
            <th>
                ID
            </th>
            <th>
                Display ID
            </th>
            <th>
                Display Name
            </th>

            <th>

            </th>
        </tr>

        <c:forEach var="item" items="${display}">
            <tr>
                <td>
                        ${item._id}
                </td>
                <td>
                        ${item.displayID}
                </td>
                <td>
                        ${item.displayName}
                </td>

                <td>
                    <input type="button" value="Edit" class="btn btn-warning">
                    <input type="button" value="Delete" class="btn btn-outline-danger">
                </td>
            </tr>
        </c:forEach>

    </table>
</div>

