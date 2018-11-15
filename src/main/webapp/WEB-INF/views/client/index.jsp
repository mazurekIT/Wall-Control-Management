<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../header.jsp"/>


<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">Id</th>
        <th scope="col">First Name</th>
        <th scope="col">Last Name</th>
        <th scope="col">Email</th>
        <th scope="col">Phone</th>
        <th scope="col">Birth Date</th>
        <th scope="col">Kid</th>
        <th scope="col">Update</th>
        <th scope="col">Delete</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${clients}" var="client">
        <tr>
            <td scope="col">${client.id}</td>
            <td scope="col">${client.firstName}</td>
            <td scope="col">${client.lastName}</td>
            <td scope="col">${client.email}</td>
            <td scope="col">${client.phone}</td>
            <td scope="col">${client.birthDate}</td>
            <td scope="col">${client.kid}</td>
            <td scope="col"><a href="/client/update/${client.id}">update</a></td>
            <td scope="col"><a href="/client/delete/${client.id}">delete</a></td>

        </tr>

    </c:forEach>
    <tr>
        <td colspan="9">
            <a href="/client/add" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">ADD CLIENT</a>
        </td>

    </tr>
    </tbody>
</table>

<jsp:include page="../footer.jsp"/>
