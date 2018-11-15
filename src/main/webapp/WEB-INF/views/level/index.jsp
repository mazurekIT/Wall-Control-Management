<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../header.jsp"/>


<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Name</th>
        <th scope="col">Update</th>
        <th scope="col">Delete</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${levels}" var="level">
        <tr>
            <td scope="col">${level.id}</td>
            <td scope="col">${level.name}</td>

            <td scope="col"><a href="/level/update/${level.id}">update</a></td>
            <td scope="col"><a href="/level/delete/${level.id}">delete</a></td>

        </tr>

    </c:forEach>
    <tr>
        <td colspan="4">
            <a href="/level/add" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">ADD LEVEL</a>
        </td>

    </tr>
    </tbody>
</table>

<jsp:include page="../footer.jsp"/>
