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
        <th scope="col">Salary</th>
        <%--<th scope="col">Password</th>--%>
        <th scope="col">Address</th>
        <th scope="col">Phone</th>
        <th scope="col">Description</th>
        <th scope="col">Update</th>
        <th scope="col">Delete</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${users}" var="user">
        <tr>
            <td scope="col">${user.id}</td>
            <td scope="col">${user.firstName}</td>
            <td scope="col">${user.lastName}</td>
            <td scope="col">${user.username}</td>
            <td scope="col">${user.email}</td>
            <td scope="col">${user.salary}</td>
            <%--<td scope="col">${user.password}</td>--%>
            <td scope="col">${user.address}</td>
            <td scope="col">${user.phone}</td>
            <td scope="col">${user.description}</td>
            <td scope="col"><a href="/admin/userupdate/${user.id}">update</a></td>
            <td scope="col"><a href="/admin/userdelete/${user.id}">delete</a></td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="11">
            <a href="/register" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">ADD EMPLOYEE</a>
        </td>

    </tr>

    </tbody>

</table>


<jsp:include page="../footer.jsp"/>
