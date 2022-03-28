<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="letscode.User" %>
<%@ page import="letscode.Client" %>

<!doctype html>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
<h1>Hello JSP</h1>
<%
    response.getWriter().write("First message");
    out.print("right here, after header");
%>
<br/>
<%= request.getRequestURI() %>
<br>
<%= LocalDateTime.now() %>
<hr/>
<%
    List<User> users = (List) request.getAttribute("users");
    User anUser = users.get(0);
%>
    <b><%= anUser.getName() %></b>
    <i><%= anUser.getCountry() %></i>
    <u><%= anUser.getAge() %></u>
<%
    ArrayList<Client> clients = (ArrayList) request.getAttribute("clients");
    Client anClient = clients.get(0);
%>
    <b><%= anClient.getName() %></b>
    <i><%= anClient.getAge() %></i>
    <u><%= anClient.getBalanceAccount() %></u>
<table>
<% for (Client client : clients) {%>
    <tr>
       <td><%= client.getName() %></td>
       <td><%= client.getAge() %></td>
       <td><%= client.getWeight() %></td>
       <td><%= client.getHeight() %></td>
       <td><%= client.getIdAccount() %></td>
       <td><%= client.getBalanceAccount() %></td>
    </tr>
<% } %>

<% for (User user : users) {%>
    <tr>
       <td><%= user.getName() %></td>
       <td>
           <% if (user.getCountry().equals("Vietnam")) { %>
                <b><%= user.getCountry() %></b>
           <% } else { %>
                <%= user.getCountry() %>
           <% } %>
       </td>
       <td><%= user.getAge() %></td>
    </tr>
<% } %>
</table>
</body>
</html>
