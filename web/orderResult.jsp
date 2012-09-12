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
        <fieldset>
            <legend>ORDER</legend>
            <%
            List records = (List)request.getAttribute("itemsOrdered");
            Iterator it = records.iterator();
            while(it.hasNext()){
                out.print("<br>" + it.next());
            }
            %>
        </p>
        <h5>Thank you for your order!</h5>
        <br />
        </fieldset>
        <p><a href="orderForm.html">BACK</p>
    </body>
</html>
