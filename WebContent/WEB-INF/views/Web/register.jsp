<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div style="padding-top: 60px; padding-bottom: 60px">
    <br>
    <div class="container">
        <div class="row">
            <div class="col-md-4">
            </div>
            <form class="col-md-4" method="post" action="/MacbookStore/user/register-submit">
                <div class="row">
                    <h3 class="col-md-12" style="text-align: center">
                        Register
                    </h3>
                    <br>
                    <span style="color: red"></span>
                    <label>Full name</label>
                    <input class="col-md-12" type="text" id="customerName" name="customerName">
                    <br/>
                    <label>Username</label>
                    <input class="col-md-12" type="text" id="Username" name="Username">
                    <br/>
                    <label>Password</label>
                    <input class="col-md-12" type="password" id="Password" name="Password">
                    <br/>
                    <label>Email</label>
                    <input class="col-md-12" type="email" id="Email" name="Email">
                    <br/>
                    <label>Phone number</label>
                    <input class="col-md-12" type="number" id="phoneNumber" name="phoneNumber">
                    <br/>
                    <label>Birth</label>
                    <input class="col-md-12" type="date" id="Birth" name="Birth" >
                    <br/>
                    <label>Address</label>
                    <input class="col-md-12" type="text" id="Address" name="Address">
                    <br/>

                    <br/>
                    <div class="col-md-12" style="...">
                        <button style="padding-top: 10px; margin: 5px" type="submit" class="btn btn-dark">Submit</button>
                    </div>
                </div>
            </form>
            <div class="col-md-4">

            </div>
        </div>
    </div>
</div>
