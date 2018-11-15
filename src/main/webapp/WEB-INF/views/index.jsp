<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>


<jsp:include page="header.jsp"/>
<security:authorize access="hasRole('USER')">


<table>
    <tr>
        <%--<td><h4>CLIENTS</h4></td>--%>
        <td colspan="9">
            <a href="/client/add" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">ADD CLIENT</a>
        </td>

        <td colspan="9">
            <a href="/client/all" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">ALL CLIENT</a>
        </td>

    </tr>
    <tr>
        <%--<td><h4>CART</h4></td>--%>
        <td colspan="9">
            <a href="/cart/add" class="btn btn-success btn-lg active" role="button" aria-pressed="true">ADD CART</a>
        </td>

        <td colspan="9">
            <a href="/cart/all" class="btn btn-success btn-lg active" role="button" aria-pressed="true">ALL CART</a>
        </td>

    </tr>
</table>


</security:authorize>
<jsp:include page="footer.jsp"/>
