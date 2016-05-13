<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html data-vide-bg="<%=request.getContextPath()%>/images/Forest01.mp4"
      class="image_display">

<c:import url="head.jsp"/>

<body>
<c:import url="nav-bar.jsp"/>

<div class="container" style="margin-top:5%">
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-6"><c:import url="new-account-template.jsp" /></div>
        <div class="col-md-3"></div>
    </div>
</div>

</body>


</html>
