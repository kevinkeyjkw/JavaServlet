
<%@page import= "java.util.*;" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recommendations</title>
    </head>
    <body>
       <%
       List styles= (List)request.getAttribute("styles");
       
       Iterator it = styles.iterator();
       while(it.hasNext()){
           out.println("<br>" + it.next());
       }
       //if(request.getAttribute("boxes") != null)
       out.println("<br>There are " + request.getAttribute("boxes")+ "boxes checked.");
       %>
    </body>
</html>
