<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../header.jsp"/>

<table class="table table-striped">
    <tr>
        <c:forEach items="${levels}" var="level">
            <td colspan="7">
                <a href="/search/section/bylevel/${level.id}" class="btn btn-success btn-lg active" role="button"
                   aria-pressed="true">${level.name}</a>
            </td>
        </c:forEach>

    </tr>

</table>




<jsp:include page="../footer.jsp"/>
