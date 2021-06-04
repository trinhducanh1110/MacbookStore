
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
                    <input class="col-md-12" type="text" id="description" name="description" value="${product.description}">
                    <br/>

                    <label>Price</label>
                    <input class="col-md-12" type="text" id="price" name="price" value="${product.price}">
                    <br/>

                    <label>Sold</label>
                    <input class="col-md-12" type="text" id="sold" name="sold" value="${product.sold}" >
                    <br/>

                    <label>Status</label>
                    <input class="col-md-12" type="text" id="status" name="status" value="${product.status}">
                    <br/>

                    <label>Stock</label>
                    <input class="col-md-12" type="text" id="stock" name="stock" value="${product.stock}" >
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

                    <label>Image Main</label>
                    <input class="col-md-12" type="text" id="image" name="image" value="${product.image}">
                    <br/>

                    <label>Image 1</label>
                    <input class="col-md-12" type="text" id="image1" name="image1" value="${product.image1}">
                    <br/>

                    <label>Image 2</label>
                    <input class="col-md-12" type="text" id="image2" name="image2" value="${product.image2}">
                    <br/>

                    <label>Image 3</label>
                    <input class="col-md-12" type="text" id="image3" name="image3" value="${product.image3}">
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
