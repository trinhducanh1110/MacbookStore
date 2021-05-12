<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="TemplateMo">
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,200,300,400,500,600,700,800,900&display=swap" rel="stylesheet">

    <title>Home</title>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"
          integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
    <link href="<c:url value="/resources/vendor/bootstrap/css/bootstrap.min.css"/> " rel="stylesheet" type="text/css">
    <link href="<c:url value="/resources/assets/css/fontawesome.css"/> " rel="stylesheet" type="text/css">
    <link href="<c:url value="/resources/assets/css/templatemo-finance-business.css"/> " rel="stylesheet" type="text/css">
    <link href="<c:url value="/resources/assets/css/owl.css"/> " rel="stylesheet" type="text/css">
</head>

<body>

<div class="">
    <nav class="navbar navbar-expand-lg" style="background-color: black">
        <div class="container">
            <a class="navbar-brand" href="/MacbookStore/admin/home"></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item active">
                        <a style="color: white" class="nav-link" href="/MacbookStore/admin/home">HOME
                            <span class="sr-only">(current)</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a style="color: white" class="nav-link" href="/MacbookStore/admin/product">PRODUCT</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color: white">
                            ACCESSORIES
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="/MacbookStore/admin/keyboard">KEYBOARD</a>
                            <a class="dropdown-item" href="/MacbookStore/admin/mouse">MOUSE</a>
                            <a class="dropdown-item" href="/MacbookStore/admin/charger">CHARGER</a>
                            <a class="dropdown-item" href="/MacbookStore/admin/bag">SHOCKPROOF BAG</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a style="..." class="nav-link" href="/MacbookStore/admin/login">Login</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</div>

<div id="root">
    <tiles:insertAttribute name="body"/>
</div>

<footer>
    <div class="container">
        <div class="row">
            <div class="col-md-3 footer-item">
                <h4>Finance Business</h4>
                <p>Vivamus tellus mi. Nulla ne cursus elit,vulputate. Sed ne cursus augue hasellus lacinia sapien vitae.</p>
                <ul class="social-icons">
                    <li><a rel="nofollow" href="https://fb.com/templatemo" target="_blank"><i class="fa fa-facebook"></i></a></li>
                    <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                    <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                    <li><a href="#"><i class="fa fa-behance"></i></a></li>
                </ul>
            </div>
        </div>
    </div>
</footer>

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
