<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<div class="main-banner header-text" id="top">
    <div class="Modern-Slider">
        <!-- Item -->
        <div class="item item-1">
            <div class="img-fill">
                <div class="container"><br/>
                    <a class="navbar-brand" href="/MacbookStore/home"><h2 STYLE="color: black" ><i class="fab fa-apple"></i> MACBOOK STORE</h2></a>
                </div>
                <div class="text-content">
                    <h6>Our newest product</h6>
                    <h4 style="text-shadow: 2px 0 black, -2px 0 black, 0 2px black, 0 -2px black, 1px 1px black, -1px -1px black, -1px 1px black, 1px -1px black;">MACBOOK PRO 16 INCH <br>2021</h4>
                    <p style="color: #6c4646">Say something about this product</p>
                    <a href="/MacbookStore/newest" class="filled-button">More </a>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="services">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="section-heading">
                    <h2>BEST SELLING <em>PRODUCT</em></h2>
                    <span>...</span>
                </div>
            </div>

            <div class="col-md-12">
                <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
                    <div class="carousel-inner">

                        <div class="carousel-item active">
                            <div class="row">
                                <div class="col-md-4 d-block w-100">
                                    <div class="service-item">
                                        <img src="resources/assets/images/macbookpro2020-silver13.jpg" class="d-block w-100" alt="">
                                        <div class="down-content">
                                            <h4>MACBOOK PRO 2021</h4>
                                            <p>VGA - CPU - RAM - HARDDRIVE - DISPLAYCARD - COLOR - DISPLAY - YEAR - STATUS </p>
                                            <a href="" class="btn btn-outline-dark ">Read More</a>
                                            <a href="" class="btn btn-outline-dark ">Add To Cart</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4 d-block w-100">
                                    <div class="service-item">
                                        <img src="resources/assets/images/macbookpro2020-silver13.jpg" class="d-block w-100" alt="">
                                        <div class="down-content">
                                            <h4>MACBOOK PRO 2021</h4>
                                            <p>VGA - CPU - RAM - HARDDRIVE - DISPLAYCARD - COLOR - DISPLAY - YEAR - STATUS </p>
                                            <a href="" class="btn btn-outline-dark ">Read More</a>
                                            <a href="" class="btn btn-outline-dark ">Add To Cart</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4 d-block w-100">
                                    <div class="service-item">
                                        <img src="resources/assets/images/macbookpro2020-silver13.jpg" class="d-block w-100" alt="">
                                        <div class="down-content">
                                            <h4>MACBOOK PRO 2022</h4>
                                            <p>VGA - CPU - RAM - HARDDRIVE - DISPLAYCARD - COLOR - DISPLAY - YEAR - STATUS </p>
                                            <a href="" class="btn btn-outline-dark ">Read More</a>
                                            <a href="" class="btn btn-outline-dark ">Add To Cart</a>
                                        </div>
                                    </div>
                                </div>

                            </div>
                        </div>

                        <div class="carousel-item">
                            <div class="row">
                                <c:forEach var="item" items="${product}">
                                    <div class="col-md-4 d-block w-100">
                                        <div class="service-item">
                                            <a href="/MacbookStore/detail">
                                                <img src="resources/assets/images/macbookpro2020-silver13.jpg" class="d-block w-100" alt="">
                                            </a>
                                            <div class="down-content">
                                                <h4>${item.productName}</h4>
                                                <p>VGA - CPU - RAM - HARDDRIVE - DISPLAYCARD - COLOR - DISPLAY - YEAR - STATUS </p>
                                                <a href="" class="btn btn-outline-dark ">Read More</a>
                                                <a href="" class="btn btn-outline-dark ">Add To Cart</a>
                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>
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
            </div>
            <div class="col-md-4">
                <div class="service-item">
                    <img src="resources/assets/images/service_01.jpg" alt="">
                    <div class="down-content">
                        <h4>MACBOOK PRO 2020</h4>
                        <p>VGA - CPU - RAM - HARDDRIVE - DISPLAYCARD - COLOR - DISPLAY - YEAR - STATUS </p>
                        <a href="" class="btn btn-outline-dark ">Read More</a>
                        <a href="" class="btn btn-outline-dark ">Add To Cart</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="service-item">
                    <img src="resources/assets/images/service_02.jpg" alt="">
                    <div class="down-content">
                        <h4>MACBOOK PRO 2020</h4>
                        <p>VGA - CPU - RAM - HARDDRIVE - DISPLAYCARD - COLOR - DISPLAY - YEAR - STATUS </p>
                        <a href="" class="btn btn-outline-dark ">Read More</a>
                        <a href="" class="btn btn-outline-dark ">Add To Cart</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="service-item">
                    <img src="resources/assets/images/service_03.jpg" alt="">
                    <div class="down-content">
                        <h4>MACBOOK PRO 2020</h4>
                        <p>VGA - CPU - RAM - HARDDRIVE - DISPLAYCARD - COLOR - DISPLAY - YEAR - STATUS </p>
                        <a href="" class="btn btn-outline-dark ">Read More</a>
                        <a href="" class="btn btn-outline-dark ">Add To Cart</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</div>

<div class="fun-facts">
    <div class="container">
        <div class="row">
            <div class="col-md-6">
                <div class="left-content">
                    <span>Lorem ipsum dolor sit amet</span>
                    <h2>Our solutions for your <em>business growth</em></h2>
                    <p>Pellentesque ultrices at turpis in vestibulum. Aenean pretium elit nec congue elementum. Nulla luctus laoreet porta. Maecenas at nisi tempus, porta metus vitae, faucibus augue.
                        <br><br>Fusce et venenatis ex. Quisque varius, velit quis dictum sagittis, odio velit molestie nunc, ut posuere ante tortor ut neque.</p>
                    <a href="" class="filled-button">Read More</a>
                </div>
            </div>
            <div class="col-md-6 align-self-center">
                <div class="row">
                    <div class="col-md-6">
                        <div class="count-area-content">
                            <div class="count-digit">945</div>
                            <div class="count-title">Work Hours</div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="count-area-content">
                            <div class="count-digit">1280</div>
                            <div class="count-title">Great Reviews</div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="count-area-content">
                            <div class="count-digit">578</div>
                            <div class="count-title">Projects Done</div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="count-area-content">
                            <div class="count-digit">26</div>
                            <div class="count-title">Awards Won</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="more-info">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="more-info-content">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="left-image">
                                <img src="assets/images/more-info.jpg" alt="">
                            </div>
                        </div>
                        <div class="col-md-6 align-self-center">
                            <div class="right-content">
                                <span>Who we are</span>
                                <h2>Get to know about <em>our company</em></h2>
                                <p>Curabitur pulvinar sem a leo tempus facilisis. Sed non sagittis neque. Nulla conse quat tellus nibh, id molestie felis sagittis ut. Nam ullamcorper tempus ipsum in cursus<br><br>Praes end at dictum metus. Morbi id hendrerit lectus, nec dapibus ex. Etiam ipsum quam, luctus eu egestas eget, tincidunt</p>
                                <a href="#" class="filled-button">Read More</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="testimonials">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="section-heading">
                    <h2>What they say <em>about us</em></h2>
                    <span>testimonials from our greatest clients</span>
                </div>
            </div>
            <div class="col-md-12">
                <div class="owl-testimonials owl-carousel">

                    <div class="testimonial-item">
                        <div class="inner-content">
                            <h4>George Walker</h4>
                            <span>Chief Financial Analyst</span>
                            <p>"Nulla ullamcorper, ipsum vel condimentum congue, mi odio vehicula tellus, sit amet malesuada justo sem sit amet quam. Pellentesque in sagittis lacus."</p>
                        </div>
                        <img src="http://placehold.it/60x60" alt="">
                    </div>

                    <div class="testimonial-item">
                        <div class="inner-content">
                            <h4>John Smith</h4>
                            <span>Market Specialist</span>
                            <p>"In eget leo ante. Sed nibh leo, laoreet accumsan euismod quis, scelerisque a nunc. Mauris accumsan, arcu id ornare malesuada, est nulla luctus nisi."</p>
                        </div>
                        <img src="http://placehold.it/60x60" alt="">
                    </div>

                    <div class="testimonial-item">
                        <div class="inner-content">
                            <h4>David Wood</h4>
                            <span>Chief Accountant</span>
                            <p>"Ut ultricies maximus turpis, in sollicitudin ligula posuere vel. Donec finibus maximus neque, vitae egestas quam imperdiet nec. Proin nec mauris eu tortor consectetur tristique."</p>
                        </div>
                        <img src="http://placehold.it/60x60" alt="">
                    </div>

                    <div class="testimonial-item">
                        <div class="inner-content">
                            <h4>Andrew Boom</h4>
                            <span>Marketing Head</span>
                            <p>"Curabitur sollicitudin, tortor at suscipit volutpat, nisi arcu aliquet dui, vitae semper sem turpis quis libero. Quisque vulputate lacinia nisl ac lobortis."</p>
                        </div>
                        <img src="http://placehold.it/60x60" alt="">
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>

<div class="callback-form">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="section-heading">
                    <h2>Request a <em>call back</em></h2>
                    <span>Etiam suscipit ante a odio consequat</span>
                </div>
            </div>
            <div class="col-md-12">
                <div class="contact-form">
                    <form id="contact" action="" method="post">
                        <div class="row">
                            <div class="col-lg-4 col-md-12 col-sm-12">
                                <fieldset>
                                    <input name="name" type="text" class="form-control" placeholder="Full Name" required="">
                                </fieldset>
                            </div>
                            <div class="col-lg-4 col-md-12 col-sm-12">
                                <fieldset>
                                    <input name="email" type="text" class="form-control" pattern="[^ @]*@[^ @]*" placeholder="E-Mail Address" required="">
                                </fieldset>
                            </div>
                            <div class="col-lg-4 col-md-12 col-sm-12">
                                <fieldset>
                                    <input name="subject" type="text" class="form-control" placeholder="Subject" required="">
                                </fieldset>
                            </div>
                            <div class="col-lg-12">
                                <fieldset>
                                    <textarea name="message" rows="6" class="form-control" placeholder="Your Message" required=""></textarea>
                                </fieldset>
                            </div>
                            <div class="col-lg-12">
                                <fieldset>
                                    <button type="submit" class="border-button">Send Message</button>
                                </fieldset>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="partners">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="owl-partners owl-carousel">

                    <div class="partner-item">
                        <img src="assets/images/client-01.png" title="1" alt="1">
                    </div>

                    <div class="partner-item">
                        <img src="assets/images/client-01.png" title="2" alt="2">
                    </div>

                    <div class="partner-item">
                        <img src="assets/images/client-01.png" title="3" alt="3">
                    </div>

                    <div class="partner-item">
                        <img src="assets/images/client-01.png" title="4" alt="4">
                    </div>

                    <div class="partner-item">
                        <img src="assets/images/client-01.png" title="5" alt="5">
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>
