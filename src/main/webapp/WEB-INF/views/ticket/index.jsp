<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../header.jsp"/>


<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Name</th>
        <th scope="col">Value</th>
        <th scope="col">Update</th>
        <th scope="col">Delete</th>
       
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${tickets}" var="ticket">
        <tr>
            <td scope="col">${ticket.id}</td>
            <td scope="col">${ticket.name}</td>
            <td scope="col">${ticket.value}</td>

            <td scope="col"><a href="/ticket/update/${ticket.id}">update</a></td>
            <td scope="col"><a href="/ticket/delete/${ticket.id}">delete</a></td>

        </tr>

    </c:forEach>
    <tr>
        <td colspan="5">
            <a href="/ticket/add" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">ADD TICKET</a>
        </td>

    </tr>
    </tbody>
</table>

<jsp:include page="../footer.jsp"/>
