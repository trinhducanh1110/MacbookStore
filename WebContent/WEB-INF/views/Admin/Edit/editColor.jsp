
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div style="padding-top: 60px; padding-bottom: 60px">
    <div class="container">
        <div class="row">
            <div class="col-md-4">
            </div>
            <form class="col-md-4" method="post" action="/MacbookStore/admin/editColorSubmit">
                <div class="row">
                    <h3 class="col-md-12" style="text-align: center">
                        Update Color
                    </h3>
                    <br>
                    <span style="color: red"></span>
                    <input class="col-md-12" type="text" id="id" name="id" value="${color.id}" hidden>
                    <label>Color ID</label>
                    <input class="col-md-12" type="text" id="colorID" name="colorID" value="${color.colorID}">
                    <br/>

                    <label>Color Name</label>
                    <input class="col-md-12" type="text" id="colorName" name="colorName" value="${color.colorName}">
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
