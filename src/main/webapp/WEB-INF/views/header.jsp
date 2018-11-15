<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>WALLcontrol</title>

    <!-- Bootstrap core CSS-->
    <link href="/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template-->
    <link href="/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

    <!-- Page level plugin CSS-->
    <link href="/resources/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

    <!-- Custom styles for this    template-->
    <link href="/resources/css/sb-admin.css" rel="stylesheet">

</head>

<body id="page-top">

<nav class="navbar navbar-expand navbar-dark bg-dark static-top">

    <a class="navbar-brand mr-0" href="/">Start Bootstrap</a>

    <button class="btn btn-link btn-sm text-white order-1 order-sm-0" id="sidebarToggle" href="#">
        <i class="fas fa-bars"></i>
    </button>

    <!-- Navbar Search -->
    <form class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0">
        <div class="input-group">
        </div>
    </form>

    <!-- Navbar -->
    <ul class="navbar-nav ml-auto ml-md-0">


        <li class="nav-item dropdown no-arrow">
            <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown"
               aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-user-circle fa-fw"></i>
            </a>
            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="userDropdown">
                <a class="dropdown-item" href="/blank">Settings Profile</a>
                <a class="dropdown-item" href="/blank">Activity Log</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="/logout" data-toggle="modal" data-target="#logoutModal">Logout</a>
            </div>
        </li>
    </ul>

</nav>

<div id="wrapper">
    <ul class="sidebar navbar-nav">

        <li class="nav-item">
            <a class="nav-link" href="/login">
                <i class="fas fa-fw fa-user"></i>
                <span>LOGIN</span></a>
        </li>


        <%--#######################################################--%>

    <security:authorize access="hasRole('USER')">
        <li class="nav-item">
            <a class="nav-link" href="/client/all">
                <i class="fas fa-fw fa-chart-area"></i>
                <span>CLIENTS</span></a>
        </li>

        <li class="nav-item">
            <a class="nav-link" href="/cart/all">
                <i class="fas fa-fw fa-chart-area"></i>
                <span>CART</span></a>
        </li>

        <li class="nav-item">
            <a class="nav-link" href="/section/all">
                <i class="fas fa-fw fa-chart-area"></i>
                <span>SECTIONS</span></a>
        </li>

        <li class="nav-item">
            <a class="nav-link" href="/ticket/all">
                <i class="fas fa-fw fa-chart-area"></i>
                <span>TICKETS</span></a>
        </li>

        <li class="nav-item">
            <a class="nav-link" href="/wall/all">
                <i class="fas fa-fw fa-chart-area"></i>
                <span>WALLS</span></a>
        </li>

        <li class="nav-item">
            <a class="nav-link" href="/user/all">
                <i class="fas fa-fw fa-chart-area"></i>
                <span>EMPLOYEES</span></a>
        </li>

        <li class="nav-item">
            <a class="nav-link" href="/level/all">
                <i class="fas fa-fw fa-chart-area"></i>
                <span>LEVELS</span></a>
        </li>
    </security:authorize>

    <%--#######################################################--%>

        <security:authorize access="hasRole('ADMIN')">  <!--opcja widoczna tylko dla ADMINA-->

        <li class="nav-item">
            <a class="nav-link" href="tables.html">
                <i class="fas fa-fw fa-table"></i>
                <span>Tables</span></a>
        </li>


            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="pagesAdmin" role="button" data-toggle="dropdown"
                   aria-haspopup="true" aria-expanded="false">
                    <i class="fas fa-fw fa-folder"></i>
                    <span>ADMIN</span>
                </a>
                <div class="dropdown-menu" aria-labelledby="pagesDropdown">
                    <%--<a class="dropdown-item" href="/register">Register</a>--%>
                    <a class="dropdown-item" href="/admin/walls">Walls</a>
                    <a class="dropdown-item" href="/admin/users">Employee</a>
                    <div class="dropdown-divider"></div>

                </div>
            </li>
        </security:authorize>

    </ul>
    <c:if test="${not empty message}">
    <div class="alert alert-success">
            ${message}
    </div>
    </c:if>

