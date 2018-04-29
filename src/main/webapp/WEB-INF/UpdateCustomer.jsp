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
<form action="UpdateCustomer" method="get" class="navbar-form navbar-right">
    <div class="form-group">
        <input type="text" name="id" class="form-control" placeholder="firstName" value="${cust.id}">
    </div>
    <div class="form-group">
        <input type="text" name="firstName" class="form-control" placeholder="firstName" value="${cust.firstName}">
    </div>
    <div class="form-group">
        <input type="text" name="lastName" class="form-control" placeholder="lastName" value="${cust.lastName}">
    </div>
    <div class="form-group">
        <input type="text" name="nick" class="form-control" placeholder="Nick" value="${cust.nick}">
    </div>
    <div class="form-group">
        <input type="password" name="password" class="form-control" placeholder="Password" value="${cust.password}">
    </div>
    <div class="form-group">
        <input type="text" name="phone" class="form-control" placeholder="phone" value="${cust.phone}">
    </div>
    <div class="form-group">
        <input type="text" name="eMail" class="form-control" placeholder="eMail" value="${cust.EMail}">
    </div>
    <div class="form-group">
        <input type="text" name="sex" class="form-control" placeholder="sex" value="${cust.sex}">
    </div>
    <div class="form-group">
        <input type="text" name="address" class="form-control" placeholder="address" value="${cust.address}">
    </div>
    <button type="submit" class="btn btn-primary">
        <i class="fa fa-sign-in"></i> Изминить
    </button>
    <a href="/HomeShop">
        <button type="button" class="btn btn-default">Все пользователи</button>
    </a>
</form>
<body/>