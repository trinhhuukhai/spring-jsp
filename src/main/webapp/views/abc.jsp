<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Move category of a product</h1>
    <form>
        <select name="categories" id="categories">
            <c:forEach var="category" items="${categories}">
                <option value="${category.getCategoryID()}">${category.getCategoryName}</option>
            </c:forEach>
        </select>
        <input type="submit" value="Update">
    </form>
</body>
</html>