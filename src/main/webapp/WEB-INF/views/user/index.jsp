<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../header.jsp"/>



<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">Id</th>
        <th scope="col">First Name</th>
        <th scope="col">Last Name</th>
        <th scope="col">User Name</th>
        <th scope="col">Email</th>
        <th scope="col">Address</th>
        <th scope="col">Phone</th>
        <th scope="col">Description</th>


    </tr>
    </thead>
    <tbody>

    <c:forEach items="${users}" var="users">
        <tr>
            <td scope="col">${users.id}</td>
            <td scope="col">${users.firstName}</td>
            <td scope="col">${users.lastName}</td>
            <td scope="col">${users.username}</td>
            <td scope="col">${users.email}</td>
            <td scope="col">${users.address}</td>
            <td scope="col">${users.phone}</td>
            <td scope="col">${users.description}</td>


    </c:forEach>

    </tbody>
</table>

<jsp:include page="../footer.jsp"/>
