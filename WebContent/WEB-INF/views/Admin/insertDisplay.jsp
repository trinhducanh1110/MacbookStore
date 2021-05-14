
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div style="padding-top: 60px; padding-bottom: 60px">
    <div class="container">
        <div class="row">
            <div class="col-md-4">
            </div>
            <form class="col-md-4" method="post" action="/MacbookStore/admin/insertDisplaySubmit">
                <div class="row">
                    <h3 class="col-md-12" style="text-align: center">
                        Insert New Display
                    </h3>
                    <br>
                    <span style="color: red"></span>

                    <label>Display ID</label>
                    <input class="col-md-12" type="text" id="displayID" name="displayID">
                    <br/>

                    <label>Display Name</label>
                    <input class="col-md-12" type="text" id="displayName" name="displayName">
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
