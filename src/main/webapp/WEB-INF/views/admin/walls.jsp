<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../header.jsp"/>


<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Name</th>
        <th scope="col">Address</th>
        <th scope="col">Open</th>
        <th scope="col">Description</th>
        <th scope="col">Update</th>
        <th scope="col">Delete</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${walls}" var="wall">
        <tr>
            <td scope="col">${wall.id}</td>
            <td scope="col">${wall.name}</td>
            <td scope="col">${wall.address}</td>
            <td scope="col">${wall.openHours}</td>
            <td scope="col">${wall.description}</td>
            <td scope="col"><a href="/admin/wallupdate/${wall.id}">update</a></td>
            <td scope="col"><a href="/admin/walldelete/${wall.id}">delete</a></td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="7">
            <a href="/admin/addwall" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">ADD
                WALL</a>
        </td>

    </tr>

    </tbody>

</table>


<jsp:include page="../footer.jsp"/>
