<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        table,th,td{
            border: 1px solid black;
        }
    </style>
</head>
<body>
    <h1>Category List</h1>
     <%-- <h1> Bien du lieu tu controller : Name = ${name} , age = ${age}</h1> bien du lieu tu controller  --%>

    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Actions</th>
            
        </tr>
        <c:forEach var="category" items="${categories}">
            <tr>
                <td>${category.getCategoryID()}</td>
                <td>${category.getCategoryName()}</td>
                <td>${category.getDescription()}</td>
                <td><a href="products/getProductByCatID/${category.getCategoryID()}">Show Products</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>