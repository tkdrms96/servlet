<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%

    

%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<!--form data post 방식으로 보내기-->
    <form action="/jsp/members/save.jsp" method="post">
        username :  <input type="text" name="username"/>
        age :       <input type="text" name="age"/>
        <button type="submit">전송</button>
    </form>
</body>
</html>