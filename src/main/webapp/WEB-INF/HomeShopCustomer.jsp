<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<style>
    <%@include file='css-shop.css' %>
    <%@include file='css/bootstrap.css' %>
</style>
<!DOCTYPE HTML>
<html>
<head>
    <title>HomeShop</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/bootstrap.css"/>
    <link rel="stylesheet" href="css-shop.css"/>
</head>
<body>
<div class="table-nav">
    <div class="container">
        <form action="HomeShop" method="get">
            <table class="table table-striped">
                <thead>
                <tr>
                    <th>Номер</th>
                    <th>Имя</th>
                    <th>Фамилия</th>
                    <th>Nick</th>
                    <th>Password</th>
                    <th>Номер тел.</th>
                    <th>E-mail</th>
                    <th>Пол</th>
                    <th>Адрес</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="row" items="${cust}">
                    <tr>
                        <th><c:out value="${row.id}"/></th>
                        <td><c:out value="${row.firstName}"/></td>
                        <td><c:out value="${row.lastName}"/></td>
                        <td><c:out value="${row.nick}"/></td>
                        <td><c:out value="${row.password}"/></td>
                        <td><c:out value="${row.phone}"/></td>
                        <td><c:out value="${row.EMail}"/></td>
                        <td><c:out value="${row.sex}"/></td>
                        <td><c:out value="${row.address}"/></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </form>
    </div>
</div>
<div class="table-nav">
    <div class="container">
        <a href="/addCustomer">
            <button type="button" class="btn btn-default">Добавить покупателя</button>
        </a>
    </div>
</div>
<form action="RemoveCustomer" method="get" class="navbar-form navbar-right">
    <div class="form-group">
        <button type="submit" class="btn btn-primary">
            <i class="fa fa-sign-in"></i> удалить пользователя
        </button>
        <input type="text" name="id" class="form-control" placeholder="Id" value="">
    </div>
</form>
<form action="UpdateCustomer" method="post" class="navbar-form navbar-right">
    <div class="form-group">
        <button type="submit" class="btn btn-primary">
            <i class="fa fa-sign-in"></i> изминить
        </button>
        <input type="text" name="id" class="form-control" placeholder="Id" value="">
    </div>
</form>
</body>
</html>