<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         <form method="POST" action="TheNameUserSees" >
            <p>Select beer characteristics</p>
            Color:
            <select name="color">
                <option value="brown">Brown</option>
                <option value="dark">Dark</option>
            </select>
            <br>
            Comments<br><textarea cols="50" rows="4" name="comments" >asdfasdf</textarea><br>
            <input type="checkbox" name="interest" value="a">a<br>
            <input type="checkbox" name="interest" value="b">b<br>
            <input type="checkbox" name="interest" value="c">c<br>
            <input type="submit" />
            
        </form>
    </body>
</html>
