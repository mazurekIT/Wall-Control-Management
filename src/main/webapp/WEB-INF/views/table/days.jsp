<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../header.jsp"/>

<table class="table table-striped">
    <tr>
        <c:forEach items="${days}" var="day">
            <td colspan="7">
                <a href="/search/section/byday/${day}" class="btn btn-success btn-lg active" role="button"
                   aria-pressed="true">${day}</a>
            </td>
        </c:forEach>

    </tr>

</table>




<jsp:include page="../footer.jsp"/>
