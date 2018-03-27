<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
            <tr>
                <th></th>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
<div class="table-nav">
    <div class="container">
        <a href="/addCustomer">
            <button type="button" class="btn btn-default">Добавить покупателя</button>
        </a>
    </div>
</div>
</body>
</html>