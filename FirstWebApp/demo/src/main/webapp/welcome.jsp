<%
    String user = (String) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("login.jsp");
    }
%>

<h2>Welcome <%= user %></h2>

<form action="logout" method="get">
    <input type="submit" value="Logout">
</form>
