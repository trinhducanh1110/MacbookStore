<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<div class="">
    <div style="text-align: center">
        <a style="text-align: center" href="/MacbookStore/admin/home" style="text-decoration: none; color: black;float: left">
            <div class="btn btn-outline-danger">
                Back
            </div>
        </a>

        <a style="text-align: center" href="/MacbookStore/admin/insertGroupForm" style="text-decoration: none; color: black">
            <div class="btn btn-outline-success">
                Add Group
            </div>
        </a>
    </div>
    <table class="table">
        <tr>
            <th>
                ID
            </th>
            <th>
                Group ID
            </th>
            <th>
                Group Name
            </th>

            <th>

            </th>
        </tr>

        <c:forEach var="item" items="${group}">
            <tr>
                <td>
                        ${item._id}
                </td>
                <td>
                        ${item.groupID}
                </td>
                <td>
                        ${item.groupName}
                </td>

                <td>
                    <input type="button" value="Edit" class="btn btn-warning">
                    <input type="button" value="Delete" class="btn btn-outline-danger">
                </td>
            </tr>
        </c:forEach>

    </table>
</div>

