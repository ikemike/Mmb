<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-dark">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="<%=request.getContextPath()%>/index.jsp">
                <img src="<%=request.getContextPath()%>/images/map_pix1.png" style="width:200px;">
            </a>
        </div>
        <ul class="nav navbar-nav">
            <li><a href="<%=request.getContextPath()%>/restricted/viewBrain">View Brain</a></li>
            <li><a href="#">Page 2</a></li>
            <li><a href="#">Page 3</a></li>
        </ul>
    </div>
</nav>