
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div style="padding-top: 60px; padding-bottom: 60px">
    <div class="container">
        <div class="row">
            <div class="col-md-4">
            </div>
            <form class="col-md-4" method="post" action="/MacbookStore/admin/insertProductSubmit">
                <div class="row">
                    <h3 class="col-md-12" style="text-align: center">
                        Insert New Product
                    </h3>
                    <br>
                    <span style="color: #ff0000"></span>

                    <label>productName</label>
                    <input class="col-md-12" type="text" id="productName" name="productName">
                    <br/>

                    <label>Description</label>
                    <input class="col-md-12" type="text" id="Description" name="Description">
                    <br/>

                    <label>Price</label>
                    <input class="col-md-12" type="text" id="Price" name="Price">
                    <br/>

                    <label>Sold</label>
                    <input class="col-md-12" type="text" id="Sold" name="Sold">
                    <br/>

                    <label>Status</label>
                    <input class="col-md-12" type="text" id="Status" name="Status">
                    <br/>

                    <label>Stock</label>
                    <input class="col-md-12" type="text" id="Stock" name="Stock">
                    <br/>

                    <label>colorID</label>
                    <input class="col-md-12" type="text" id="colorID" name="colorID">
                    <br/>

                    <label>cpuID</label>
                    <input class="col-md-12" type="text" id="cpuID" name="cpuID">
                    <br/>

                    <label>displayCardID</label>
                    <input class="col-md-12" type="text" id="displayCardID" name="displayCardID">
                    <br/>

                    <label>displayID</label>
                    <input class="col-md-12" type="text" id="displayID" name="displayID">
                    <br/>

                    <label>groupID</label>
                    <input class="col-md-12" type="text" id="groupID" name="groupID">
                    <br/>

                    <label>hardDriveID</label>
                    <input class="col-md-12" type="text" id="hardDriveID" name="hardDriveID">
                    <br/>

                    <label>productID</label>
                    <input class="col-md-12" type="text" id="productID" name="productID">
                    <br/>

                    <label>yearID</label>
                    <input class="col-md-12" type="text" id="yearID" name="yearID">
                    <br/>

                    <label>ramID</label>
                    <input class="col-md-12" type="text" id="ramID" name="ramID">
                    <br/>

                    <label>Image Main</label>
                    <input class="col-md-12" type="text" id="image" name="image" >
                    <br/>

                    <label>Image 1</label>
                    <input class="col-md-12" type="text" id="image1" name="image1">
                    <br/>

                    <label>Image 2</label>
                    <input class="col-md-12" type="text" id="image2" name="image2">
                    <br/>

                    <label>Image 3</label>
                    <input class="col-md-12" type="text" id="image3" name="image3">
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