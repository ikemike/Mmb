<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
    .navbar {
        opacity:0.5;
        background-color:black;
        color:white;
        height:75px;
    }
</style>
<nav class="navbar navbar-dark">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="<%=request.getContextPath()%>/index.jsp">
                <img src="<%=request.getContextPath()%>/images/MMBProtoLogo.png" style="width:60px;margin-top:-10px;">
            </a>
        </div>
        <ul class="nav navbar-nav">
            <li><a href="<%=request.getContextPath()%>/restricted/viewBrain">View Brain</a></li>
            <li><a href="<%=request.getContextPath()%>/how-to.jsp">Headset Hacking</a></li>
            <li><a href="<%=request.getContextPath()%>/restricted/login-user.jsp">Login</a></li>
            <li><a href="<%=request.getContextPath()%>/new-account.jsp">Sign up</a></li>
        </ul>
    </div>
</nav>