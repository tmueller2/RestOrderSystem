<%-- 
    Document   : orderResult
    Created on : Sep 4, 2012, 3:59:40 PM
    Author     : Spark
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Receipt</title>
    </head>
    <body>
        <h1>Todd's Sweets & Creamery Order</h1>
        <p>
            <%
            List records = (List)request.getAttribute("itemsOrdered");
            Iterator it = records.iterator();
            while(it.hasNext()){
                out.print(it.next());
            }
            %>
        </p>
    </body>
</html>
