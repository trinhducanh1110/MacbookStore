<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div style="padding-top: 60px; padding-bottom: 60px">
    <br>
    <div class="container">
        <div class="row">
            <div class="col-md-4">
            </div>
            <form class="col-md-4" method="post" action="/MacbookStore/user/login-submit">
                <div class="row">
                    <h3 class="col-md-12" style="text-align: center">
                        Login
                    </h3>
                    <br>
                    <span style="color: red"></span>
                    <label>Username</label>
                        <input class="col-md-12" type="text" id="Username" name="Username">
                    <br/>
                    <label>Password</label>
                        <input class="col-md-12" type="password" id="Password" name="Password">
                    <br/>
                    <a href="/MacbookStore/register">Don't have an account? Sign up now</a>
                    <br/>
                    <br/>
                    <c:forEach var="item" items="${error}" >
                        <label class="col-md-12" style="color: #b00a0a">${item}</label>
                    </c:forEach>
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
