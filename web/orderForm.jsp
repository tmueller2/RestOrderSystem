<%-- 
    Document   : orderForm
    Created on : Sep 18, 2012, 2:16:46 PM
    Author     : Todd Mueller
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="edu.wctc.distjava.ch3.model.MenuItem"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //Creates a menuList Object
    List<MenuItem> menuList = new ArrayList<MenuItem>();
    Object menuListObj = request.getAttribute("menuList");
    //Checks to see if the menulist Oject not null to create menuList
    if(menuListObj != null) {
        menuList = (List<MenuItem>) menuListObj;
    }
    
    List<MenuItem> orderList = new ArrayList<MenuItem>();
    Object orderListObj = request.getAttribute("menuList");
    if(orderListObj != null) {
        orderList = (List<MenuItem>) orderListObj;
    }
    
        //List<MenuItem> menuList = (List<MenuItem>) request.getAttribute("menuList");
	//List<MenuItem> orderList = (List<MenuItem>) request.getAttribute("orderList");
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Order Home</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <!-- The next 3 lines are used so the cache is erased
             Then when you rerun the program again it will display the new code
        -->
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">            
    </head>
    <body>
        <h1 align="center">Todd's Sweets & Creamery Order Form</h1>
        <form id="formDB" name="formDB" method="POST" action="Order.do">
             <%
                for(MenuItem menuItems : menuList) {
                    String item = menuItems.getMenuDescription();
                   
             %>
             <input type="checkbox" name="menuItems" value="<%= item %>" /><%= item %> <br/>
             <%
             }
             %>
             <br />
             <input id="orderSubmit" name="orderSubmit" type="submit" value="Submit Order">
            
             
        </form>

    </body>
</html>
