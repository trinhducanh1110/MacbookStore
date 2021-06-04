
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div style="padding-top: 60px; padding-bottom: 60px">
    <div class="container">
        <div class="row">
            <div class="col-md-4">
            </div>
            <form class="col-md-4" method="post" action="/MacbookStore/admin/insertCustomerSubmit">
                <div class="row">
                    <h3 class="col-md-12" style="text-align: center">
                        Insert Customer
                    </h3>
                    <br>
                    <span style="color: #ff0000"></span>

                    <label>Username</label>
                    <input class="col-md-12" type="text" id="username" name="Username">
                    <br/>
                    <label>Password</label>
                    <input class="col-md-12" type="password" id="password" name="Password">
                    <br/>
                    <label>Full name</label>
                    <input class="col-md-12" type="text" id="customerName" name="customerName">
                    <br/>
                    <label>Phone number</label>
                    <input class="col-md-12" type="number" id="phoneNumber" name="phoneNumber">
                    <br/>
                    <label>Address</label>
                    <input class="col-md-12" type="text" id="address" name="Address">
                    <br/>
                    <label>Birth</label>
                    <input class="col-md-12" type="date" id="birth" name="Birth" >
                    <br/>
                    <label>Email</label>
                    <input class="col-md-12" type="email" id="email" name="Email">
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