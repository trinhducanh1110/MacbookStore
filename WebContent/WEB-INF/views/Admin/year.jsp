<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<div class="">
    <div style="text-align: center">
        <a style="text-align: center" href="/MacbookStore/admin/home" style="text-decoration: none; color: black;float: left">
            <div class="btn btn-outline-danger">
                Back
            </div>
        </a>

        <a style="text-align: center" href="/MacbookStore/admin/insertYearForm" style="text-decoration: none; color: black">
            <div class="btn btn-outline-success">
                Add Year
            </div>
        </a>
    </div>
    <table class="table">
        <tr>
            <th>
                ID
            </th>
            <th>
                Year ID
            </th>
            <th>
                Year Name
            </th>

            <th>

            </th>
        </tr>

        <c:forEach var="item" items="${year}">
            <tr>
                <td>
                        ${item.id}
                </td>
                <td>
                        ${item.yearID}
                </td>
                <td>
                        ${item.yearName}
                </td>

                <td>
                    <a href="/MacbookStore/admin/year/edit/${item.id}">
                        <input type="button" value="Edit" class="btn btn-warning">
                    </a>
                    <a href="/MacbookStore/admin/year/delete/${item.id}">
                        <input type="button" value="Delete" class="btn btn-outline-danger">
                    </a>
                </td>
            </tr>
        </c:forEach>

    </table>
</div>

