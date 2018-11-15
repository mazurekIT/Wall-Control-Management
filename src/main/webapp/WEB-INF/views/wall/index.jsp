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

    </c:forEach>

    </tbody>
</table>



<jsp:include page="../footer.jsp"/>
