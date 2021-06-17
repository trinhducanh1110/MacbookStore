<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,200,300,400,500,600,700,800,900&display=swap" rel="stylesheet">

    <title>MacbookStore</title>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"
          integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
    <link href="<c:url value="/resources/vendor/bootstrap/css/bootstrap.min.css"/> " rel="stylesheet" type="text/css">
    <link href="<c:url value="/resources/assets/css/fontawesome.css"/> " rel="stylesheet" type="text/css">
    <link href="<c:url value="/resources/assets/css/templatemo-finance-business.css"/> " rel="stylesheet" type="text/css">
    <link href="<c:url value="/resources/assets/css/owl.css"/> " rel="stylesheet" type="text/css">
</head>

<body>

<div>
    <nav class="navbar navbar-expand-lg" style="background-color: black; text-align: center">
        <div class="container-fluid">
        <a class="navbar-brand" href="/MacbookStore/home" >
            <i class="fab fa-apple" style="color:white; padding-left: 20px"></i>
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div style="padding-left: 2%; padding-right: 2%">
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a style="color: white" class="nav-link" href="/MacbookStore/home">HOME
                            <span class="sr-only">(current)</span>
                        </a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color: white">
                            NEW MACBOOK
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="/MacbookStore/category/New/MP/2020">MACBOOK PRO 2020</a>
                            <a class="dropdown-item" href="/MacbookStore/category/New/MP/2019">MACBOOK PRO 2019</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="/MacbookStore/category/New/MA/2020">MACBOOK AIR 2020</a>
                            <a class="dropdown-item" href="/MacbookStore/category/New/MA/2019">MACBOOK AIR 2019</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown2" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color: white">
                            OLD MACBOOK
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="/MacbookStore/category/Old/MP/2020">MACBOOK PRO 2020</a>
                            <a class="dropdown-item" href="/MacbookStore/category/Old/MP/2019">MACBOOK PRO 2019</a>
                            <a class="dropdown-item" href="/MacbookStore/category/Old/MP/2018">MACBOOK PRO 2018</a>
                            <a class="dropdown-item" href="/MacbookStore/category/Old/MP/2017">MACBOOK PRO 2017</a>
                            <a class="dropdown-item" href="/MacbookStore/category/Old/MP/2016">MACBOOK PRO 2016</a>
                            <a class="dropdown-item" href="/MacbookStore/category/Old/MP/2015">MACBOOK PRO 2015</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="/MacbookStore/category/Old/MA/2020">MACBOOK AIR 2020</a>
                            <a class="dropdown-item" href="/MacbookStore/category/Old/MA/2019">MACBOOK AIR 2019</a>
                            <a class="dropdown-item" href="/MacbookStore/category/Old/MA/2018">MACBOOK AIR 2018</a>
                            <a class="dropdown-item" href="/MacbookStore/category/Old/MA/2017">MACBOOK AIR 2017</a>
                            <a class="dropdown-item" href="/MacbookStore/category/Old/MA/2016">MACBOOK AIR 2016</a>
                            <a class="dropdown-item" href="/MacbookStore/category/Old/MA/2015">MACBOOK AIR 2015</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown3" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color: white">
                            ACCESSORIES
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="/MacbookStore/category/MK">KEYBOARD</a>
                            <a class="dropdown-item" href="/MacbookStore/category/MM">MOUSE</a>
                            <a class="dropdown-item" href="/MacbookStore/category/TP">TRACKPAD</a>
                            <a class="dropdown-item" href="/MacbookStore/category/CAP">CHARGER</a>
                            <a class="dropdown-item" href="/MacbookStore/category/TUI">SHOCKPROOF BAG</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a style="color: white" class="nav-link" href="/MacbookStore/about">ABOUT US</a>
                    </li>
                    <!--
                    <li class="nav-item">
                        <a style="color: black" class="nav-link" href="/MacbookStore/service">SERVICE</a>
                    </li>
                    -->
                    <li class="nav-item">
                        <a style="color: white" class="nav-link" href="/MacbookStore/contact">CONTACT US</a>
                    </li>
<%--                    <li class="nav-item">--%>
<%--                        <a style="color: white" class="nav-link" href="/MacbookStore/contact"><i class="fas fa-search"></i></a>--%>
<%--                    </li>--%>
                    <c:if test="${sessionScope.user.length() == null}">
                        <li class="nav-item">
                            <a style="color: white" class="nav-link" href="/MacbookStore/user/login"><i class="fas fa-shopping-cart"></i></a>
                        </li>
                        <li class="nav-item">
                            <a style="..." class="nav-link" href="/MacbookStore/user/login">Login</a>
                        </li>
                    </c:if>
                    <c:if test="${sessionScope.user.length() != null}">
                        <li class="nav-item">
                            <a style="color: white" class="nav-link" href="/MacbookStore/cart/"><i class="fas fa-shopping-cart"></i></a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownUser" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color: white">
                                Hello ${sessionScope.user}
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="/MacbookStore/user/manage/${sessionScope.user}">Manage</a>
                                <a class="dropdown-item" href="#">Orders</a>
                                <a class="dropdown-item" href="/MacbookStore/user/logout">Log out</a>
                            </div>
                        </li>
                    </c:if>

                </ul>
            </div>
        </div>
        </div>
    </nav>
</div>

    <div id="root">
        <tiles:insertAttribute name="body"/>
    </div>

<footer style="margin-top: 20px">
    <div class="container">
        <div class="row">
            <div class="col-md-4 footer-item">
                <h4>MACBOOK STORE</h4>
                <br>
                Showroom 1: 214 Le Van Viet Street, District 9, HCMC
                <br>
                <br>
                Showroom 2: 214 Nguyen Trai Street, District 1, HCMC
                <br>
                <br>
                Tax code: 010999999
                <br>
                <br>
                Working time: 9.00 to 21.00 (Sunday and Saturday included)
                <br>
                <br>
                Hotline:
                <br>
                Showroom 1: 0977 728 880
                Showroom 2: 0931 728 880
                <br>
                <br>
                Service quality feedback:
                <br>
                097 640 0401
                <ul class="social-icons">
                    <li><a rel="nofollow" href="https://fb.com/apple" target="_blank"><i class="fa fa-facebook"></i></a></li>
                    <li><a href="https://twitter.com/apple"><i class="fa fa-twitter"></i></a></li>
                    <li><a href="https://www.apple.com/"><i class="fa fa-apple"></i></a></li>
                </ul>
            </div>
            <div class="col-md-4 footer-item">
                <h4>MACBOOK REPAIR SERVICE</h4>
                MBService (Warranty - Service)
                <br>
                <br>
                Address: D8 Nguyen Trai Street, District 1, HCMC
                <br>
                <br>
                Working time: 08.30 to 17.30 (Sunday and holidays excepted)
                <br>
                <br>
                Hotline: 0923575777
                <br>
                <br>
                <ul class="fa">
                    <i class="fa fa-credit-card" style="font-size:36px"></i>
                    <i class="fa fa-cc-visa" style="font-size:36px"></i>
                    <i class="fa fa-cc-mastercard" style="font-size:36px"></i>
                    <i class="fa fa-cc-paypal" style="font-size:36px"></i>
                </ul>
            </div>
            <div class="col-md-4 footer-item">
                <h4>ADDITIONALS PAGES</h4>
                <ul class="menu-list">
                    <li><a href="/MacbookStore/about">About Us</a></li>
                    <li><a href="/MacbookStore/service">How We Work</a></li>
                    <li><a href="/MacbookStore/contact">Contact Us</a></li>
                    <li><a href="/MacbookStore/newest">Newest</a></li>
                </ul>
            </div>
        </div>
    </div>
</footer>

<div class="sub-footer">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <p>Copyright &copy; 2021 MACBOOKSTORE

                    - Design: 18DTHJB1</p>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap core JavaScript -->
<script src="http://localhost:8080/MacbookStore/resources/vendor/jquery/jquery.min.js"></script>
<script src="http://localhost:8080/MacbookStore/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Additional Scripts -->
<script src="http://localhost:8080/MacbookStore/resources/assets/js/custom.js"></script>
<script src="http://localhost:8080/MacbookStore/resources/assets/js/owl.js"></script>
<script src="http://localhost:8080/MacbookStore/resources/assets/js/slick.js"></script>
<script src="http://localhost:8080/MacbookStore/resources/assets/js/accordions.js"></script>

<script language = "text/Javascript">
    cleared[0] = cleared[1] = cleared[2] = 0; //set a cleared flag for each field
    function clearField(t){                   //declaring the array outside of the
        if(! cleared[t.id]){                      // function makes it static and global
            cleared[t.id] = 1;  // you could use true and false, but that's more typing
            t.value='';         // with more chance of typos
            t.style.color='#fff';
        }
    }
</script>
</body>

</html>
