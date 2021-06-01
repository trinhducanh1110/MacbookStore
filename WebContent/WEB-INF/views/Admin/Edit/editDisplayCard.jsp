
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div style="padding-top: 60px; padding-bottom: 60px">
    <div class="container">
        <div class="row">
            <div class="col-md-4">
            </div>
            <form class="col-md-4" method="post" action="/MacbookStore/admin/editDisplayCardSubmit">
                <div class="row">
                    <h3 class="col-md-12" style="text-align: center">
                        Update DisplayCard
                    </h3>
                    <br>
                    <span style="color: red"></span>
                    <input class="col-md-12" type="text" id="id" name="id" value="${displaycard.id}" hidden>
                    <label>DisplayCard ID</label>
                    <input class="col-md-12" type="text" id="displayCardID" name="displayCardID" value="${displaycard.displayCardID}">
                    <br/>

                    <label>DisplayCard Name</label>
                    <input class="col-md-12" type="text" id="displayCardName" name="displayCardName" value="${displaycard.displayCardName}">
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
