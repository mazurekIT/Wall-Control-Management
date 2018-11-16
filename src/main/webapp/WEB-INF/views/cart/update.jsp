<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Cart Update</title>

    <!-- Bootstrap core CSS-->
    <link href="/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template-->
    <link href="/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

    <!-- Custom styles for this template-->
    <link href="/resources/css/sb-admin.css" rel="stylesheet">

</head>

<body class="bg-dark">

<div class="container">
    <div class="card card-register mx-auto mt-5">
        <div class="card-header">Update Cart</div>
        <div class="card-body">
            <form:form method="post" modelAttribute="cart">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                <form:hidden path="id" value="${cart.id}"/>

                <div class="form-group">

                    <label for="client">Clients</label>
                    <select name="client" class="form-control" id="client">
                        <option selected>Choose ...</option>

                        <c:forEach items="${clients}" var="client">
                            <option value="${client.id}">${client.firstName}-${client.lastName}</option>
                        </c:forEach>
                    </select>
                </div>

                <div class="form-group">

                    <label for="ticket">Tickets</label>
                    <select multiple name="ticket" class="form-control" id="ticket">
                        <option selected>Choose ...</option>

                        <c:forEach items="${tickets}" var="ticket">
                            <option value="${ticket.id}">${ticket.name}</option>
                        </c:forEach>
                    </select>
                </div>

                <input type="submit" class="btn btn-primary btn-block" value="Save"/>
                <div class="col-md-6">
                    <div class="form-label-group">
                        <form:errors path="*"/>
                            
                    </div>
                </div>
            </form:form>

        </div>
    </div>
</div>

<!-- Bootstrap core JavaScript-->
<script src="/resources/vendor/jquery/jquery.min.js"></script>
<script src="/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="/resources/vendor/jquery-easing/jquery.easing.min.js"></script>

</body>

</html>
