<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>


<jsp:include page="header.jsp"/>
<security:authorize access="hasRole('USER')">


    <div id="accordion">
        <div class="card">
            <div class="card-header" id="headingOne">
                <h5 class="mb-0">
                    <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true"
                            aria-controls="collapseOne">
                        CLIENTS
                    </button>
                </h5>
            </div>

            <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordion">
                <div class="card-body">
                    <table>
                        <tr>
                                <%--<td><h4>CLIENTS</h4></td>--%>
                            <td colspan="9">
                                <a href="/client/add" class="btn btn-primary btn-lg active" role="button"
                                   aria-pressed="true">ADD CLIENT</a>
                            </td>

                            <td colspan="9">
                                <a href="/client/all" class="btn btn-primary btn-lg active" role="button"
                                   aria-pressed="true">ALL CLIENT</a>
                            </td>

                        </tr>
                    </table>
                </div>
            </div>
        </div>
        <div class="card">
            <div class="card-header" id="headingTwo">
                <h5 class="mb-0">
                    <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapseTwo"
                            aria-expanded="false" aria-controls="collapseTwo">
                        CART
                    </button>
                </h5>
            </div>
            <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordion">
                <div class="card-body">
                    <table>
                        <tr>
                                <%--<td><h4>CART</h4></td>--%>
                            <td colspan="9">
                                <a href="/cart/add" class="btn btn-success btn-lg active" role="button"
                                   aria-pressed="true">ADD CART</a>
                            </td>

                            <td colspan="9">
                                <a href="/cart/all" class="btn btn-success btn-lg active" role="button"
                                   aria-pressed="true">ALL CART</a>
                            </td>

                        </tr>
                    </table>
                </div>
            </div>
        </div>
        <div class="card">
            <div class="card-header" id="headingTwoo">
                <h5 class="mb-0">
                    <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapseTwoo"
                            aria-expanded="false" aria-controls="collapseTwoo">
                        TICKET
                    </button>
                </h5>
            </div>
            <div id="collapseTwoo" class="collapse" aria-labelledby="headingTwoo" data-parent="#accordion">
                <div class="card-body">
                    <table>
                        <tr>
                                <%--<td><h4>CART</h4></td>--%>
                            <td colspan="9">
                                <a href="/ticket/add" class="btn btn-primary btn-lg active" role="button"
                                   aria-pressed="true">ADD TICKET</a>
                            </td>

                            <td colspan="9">
                                <a href="/ticket/all" class="btn btn-primary btn-lg active" role="button"
                                   aria-pressed="true">ALL TICKET</a>
                            </td>

                        </tr>
                    </table>
                </div>
            </div>
        </div>

        <div class="card">
            <div class="card-header" id="headingThree">
                <h5 class="mb-0">
                    <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapseThree"
                            aria-expanded="false" aria-controls="collapseThree">
                        SEARCH
                    </button>
                </h5>
            </div>
            <div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordion">
                <div class="card-body">

                    <td colspan="9">
                        <a href="/search/days" class="btn btn-success btn-lg active" role="button"
                           aria-pressed="true">SECTION BY DAY</a>
                    </td>

                    <td colspan="9">
                        <a href="/search/levels" class="btn btn-success btn-lg active" role="button"
                           aria-pressed="true">SECTION BY LEVEL</a>
                    </td>

                    <td colspan="9">
                        <a href="/search/instructors" class="btn btn-success btn-lg active" role="button"
                           aria-pressed="true">SECTION BY INSTRUCTOR</a>
                    </td>


                </div>
            </div>
        </div>
    </div>
</security:authorize>
<jsp:include page="footer.jsp"/>
