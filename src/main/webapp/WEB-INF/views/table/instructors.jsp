<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../header.jsp"/>

<table class="table table-striped">
    <tr>
        <c:forEach items="${instructors}" var="instructor">
            <td colspan="7">
                <a href="/search/section/byins/${instructor.id}" class="btn btn-success btn-lg active" role="button"
                   aria-pressed="true">${instructor.username}</a>
            </td>
        </c:forEach>

    </tr>

</table>




<jsp:include page="../footer.jsp"/>
