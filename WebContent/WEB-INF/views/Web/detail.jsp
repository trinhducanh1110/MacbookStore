<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!-- Tab -->
<div class="container">
    <nav aria-label="breadcrumb">
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="/MacbookStore/home">HOME</a></li>
            <li class="breadcrumb-item active" aria-current="page">PRODUCT DETAIL</li>
        </ol>
    </nav>
</div>
<br>
<!--Nội Dung-->
<div class="main-content">
    <div class="container">
        <h3><b>${product.productName} - ${product.groupID} ${product.yearID} ${product.displayID} - ${product.cpuID}/${product.ramID}/${product.hardDriveID} - ${product.status}</b></h3><br/>
        <img src="resources/assets/images/macbookpro2020-silver13.jpg" alt="">
        <div class="row">
            <div class="col-md-5">
                <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <img src="${product.getImage()}" class="d-block w-100" alt="">
                        </div>
                        <div class="carousel-item">
                            <img src="resources/assets/images/1.jpg" class="d-block w-100" alt="...">
                        </div>
                        <div class="carousel-item">
                            <img src="resources/assets/images/2.jpg" class="d-block w-100" alt="...">
                        </div>
                        <div class="carousel-item">
                            <img src="resources/assets/images/3.jpg" class="d-block w-100" alt="...">
                        </div>
                    </div>
                    <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>
                    <br>
                    <div class="row">
                        <div class="col-md-3">
                                <img src="resources/assets/images/macbookpro2020-silver13.jpg" id="main" alt="#" class="img-fluid">
                        </div>
                        <div class="col-md-3">
                                <img src="resources/assets/images/1.jpg" id="1" alt="#" class="img-fluid">
                        </div>
                        <div class="col-md-3">
                                <img src="resources/assets/images/2.jpg" id="2" alt="#" class="img-fluid">
                        </div>
                        <div class="col-md-3">
                                <img src="resources/assets/images/3.jpg" id="3" alt="#" class="img-fluid">
                        </div>
                    </div>
                </div>
            <div class="col-md-4">
                <h4 style="color: red; text-align: center;font-weight: bold"><b>PRICE:  ${product.getPrice()}   VND</b></h4>
                <div id="Datmua">
                    <b>
                        <a href="" style="color: #ffffff;text-align: center" class="btn btn-dark col-md-12">
                            Add To Cart<br /> (Delivery or pick up at the store)
                        </a>
                    </b>
                </div>
                <br>

            </div>
            <div class="col-md-3">
                <h3>PRODUCT DETAIL</h3>
                <b>CPU</b>:&ensp;<br><br>

                <b>RAM</b>:&ensp;<br><br>

                <b>HARD DRIVE</b>:&ensp;<br><br>

                <b>DISPLAY CARD</b>:&ensp;<br><br>

                <b>STATUS</b>:&ensp;<br><br>

                <b>COLOR</b>:&ensp;<br><br>

                <b>SCREEN</b>:&ensp;<br><br>

                <b>YEAR</b>:&ensp;<br><br>
            </div>


        </div>
    </div>
</div>