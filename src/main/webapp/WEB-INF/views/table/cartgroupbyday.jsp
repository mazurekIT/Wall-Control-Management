<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../header.jsp"/>

<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">Created</th>
        <th scope="col">Value</th>

    </tr>
    </thead>
    <tbody>

    <c:forEach items="${carts}" var="cart">
    <tr>
        <td scope="col">${cart.created}</td>
        <td scope="col">${cart.value}</td>


        </c:forEach>
    </tbody>
</table>

<jsp:include page="../footer.jsp"/>
