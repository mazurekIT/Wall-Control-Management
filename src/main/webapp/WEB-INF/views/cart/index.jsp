<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../header.jsp"/>


<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Created</th>
        <th scope="col">Value</th>
        <th scope="col">Klient</th>

        <th scope="col">Update</th>
        <th scope="col">Delete</th>


    </tr>
    </thead>
    <tbody>

    <c:forEach items="${carts}" var="cart">
        <tr>
            <td scope="col">${cart.id}</td>
            <td scope="col">${cart.created}</td>
            <td scope="col">${cart.value}</td>
            <td scope="col">${cart.client.firstName}</td>
            <td scope="col"><a href="/cart/update/${cart.id}">update</a></td>
            <td scope="col"><a href="/cart/delete/${cart.id}">delete</a></td>



    </c:forEach>
    <tr>
        <td colspan="6">
            <a href="/cart/add" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">ADD CART</a>
        </td>

    </tr>
    </tbody>
</table>

<jsp:include page="../footer.jsp"/>
