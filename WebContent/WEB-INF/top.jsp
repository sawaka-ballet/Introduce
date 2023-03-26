<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>${title}</title>
        <link rel="stylesheet" href="css/styles.css">
    </head>
    <body>
    <div class="container">
        <h1>${title}</h1>
        <p>${message}</p>
        <img src="${pageContext.request.contextPath}/images/${image}" alt="${image}">
    </div>
    <div class="button-wrapper">
        <form method="get" action="${pageContext.request.contextPath}/HelloServlet">
           <input type="submit" name="button" value="1">
           <input type="submit" name="button" value="2">
           <input type="submit" name="button" value="3">
        </form>
    </div>
    </body>
</html>
