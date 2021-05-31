
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div style="padding-top: 60px; padding-bottom: 60px">
    <div class="container">
        <div class="row">
            <div class="col-md-4">
            </div>
            <form class="col-md-4" method="post" action="/MacbookStore/admin/editProductSubmit">
                <div class="row">
                    <h3 class="col-md-12" style="text-align: center">
                        Update Product
                    </h3>
                    <br>
                    <span style="color: red"></span>
                    <input class="col-md-12" type="text" id="id" name="id" value="${product.id}" hidden>
                    <label>productName</label>
                    <input class="col-md-12" type="text" id="productName" name="productName" value="${product.productName}">
                    <br/>

                    <label>Description</label>
                    <input class="col-md-12" type="text" id="Description" name="Description">
                    <br/>

                    <label>Price</label>
                    <input class="col-md-12" type="text" id="Price" name="Price">
                    <br/>

                    <label>Sold</label>
                    <input class="col-md-12" type="text" id="Sold" name="Sold" >
                    <br/>

                    <label>Status</label>
                    <input class="col-md-12" type="text" id="Status" name="Status" >
                    <br/>

                    <label>Stock</label>
                    <input class="col-md-12" type="text" id="Stock" name="Stock" >
                    <br/>

                    <label>colorID</label>
                    <input class="col-md-12" type="text" id="colorID" name="colorID" value="${product.colorID}">
                    <br/>

                    <label>cpuID</label>
                    <input class="col-md-12" type="text" id="cpuID" name="cpuID" value="${product.cpuID}">
                    <br/>

                    <label>displayCardID</label>
                    <input class="col-md-12" type="text" id="displayCardID" name="displayCardID" value="${product.displayCardID}">
                    <br/>

                    <label>displayID</label>
                    <input class="col-md-12" type="text" id="displayID" name="displayID" value="${product.displayID}">
                    <br/>

                    <label>groupID</label>
                    <input class="col-md-12" type="text" id="groupID" name="groupID" value="${product.groupID}">
                    <br/>

                    <label>hardDriveID</label>
                    <input class="col-md-12" type="text" id="hardDriveID" name="hardDriveID" value="${product.hardDriveID}">
                    <br/>

                    <label>productID</label>
                    <input class="col-md-12" type="text" id="productID" name="productID" value="${product.productID}">
                    <br/>

                    <label>yearID</label>
                    <input class="col-md-12" type="text" id="yearID" name="yearID" value="${product.yearID}">
                    <br/>

                    <label>ramID</label>
                    <input class="col-md-12" type="text" id="ramID" name="ramID" value="${product.ramID}">
                    <br/>

                    <div class="col-md-12" style="text-align: center">
                        <button type="submit" class="btn btn-dark">Submit</button>
                    </div>
                </div>
            </form>
            <div class="col-md-4">

            </div>
        </div>
    </div>
</div>
