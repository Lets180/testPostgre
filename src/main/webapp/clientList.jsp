<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="letscodeTags" prefix="lct" %>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page import="letscode.Client" %>
<html>
<head>
    <title>Title</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<h3>Client List</h3>
<table>
<%

    String test = (String) request.getAttribute("testField");
    List<Client> clients = (List) request.getAttribute("clients");
    Client anClient = clients.get(0);
    %>
    <tr>
           <td><%= anClient.getName() %></td>
           <td><%= anClient.getAge() %></td>
           <td><%= anClient.getWeight() %></td>
           <td><%= anClient.getHeight() %></td>
           <td><%= anClient.getIdAccount() %></td>
           <td><%= anClient.getBalanceAccount() %></td>
    </tr>

</table>
<%
    String[] times = new String[] { "summer", "autumn", "winter", "spring" };
    request.setAttribute("items", times);
%>
<h3>For each loop</h3>



    <table border="1" cellpadding="2" cellspacing="1" >
       <tr>
          <th>Name</th>
          <th>Age</th>
          <th>Weight</th>
          <th>Height</th>
          <th>Id</th>
          <th>Balance</th>
          <th>Edit</th>
          <th>Delete</th>
          <th>Deposit</th>
          <th>Withdraw</th>
       </tr>



    </table>
 </body>
 </html>