<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<div class="main-banner header-text" id="top">
    <div class="Modern-Slider">
        <!-- Item -->
        <div class="item item-1">
            <div class="img-fill">
                <div class="text-content">
                    <h6>Our newest product</h6>
                    <h4 style="text-shadow: 2px 0 black, -2px 0 black, 0 2px black, 0 -2px black, 1px 1px black, -1px -1px black, -1px 1px black, 1px -1px black;">MACBOOK PRO 16 INCH <br>2021</h4>
                    <p style="color: #6c4646">This Macbook is incredible</p>
                    <a href="https://www.apple.com/macbook-pro-16/" class="filled-button">More </a>
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
                    <span></span>
                </div>
            </div>
            <div class="col-md-12">
                <div class="row">
                    <c:forEach var="item" items="${product}">
                        <div class="col-md-4 d-block w-100">
                            <div class="service-item">
                                <a href="/MacbookStore/detail/${item.id}">
                                    <img src="${item.image}" class="d-block w-100" alt="">
                                </a>
                                <div class="down-content">
                                    <h4><bold style="color: red">[ ${item.status} ]</bold> ${item.productName} - ${item.displayID} - ${item.productID}</h4>
                                    <h6 style="color:red">Price: ${item.price} VND</h6>
                                    <p>${item.cpuID} - ${item.ramID} - ${item.hardDriveID} <c:if test="${item.displayCardID!=null}">- ${item.displayCardID}</c:if><br/> ${item.colorID} - ${item.displayID}</p>
                                    <a href="/MacbookStore/detail/${item.id}" class="btn btn-outline-dark ">Read More</a>
                                    <a href="/MacbookStore/cart/add/${item.id}" class="btn btn-outline-dark ">Add To Cart</a>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
    </div>
</div>
</div>

