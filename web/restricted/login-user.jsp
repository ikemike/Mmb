<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="<%=request.getContextPath()%>"/>
<html data-vide-bg="/images/wheat.mp4"
      class="image_display">

<c:import url="${ctx}/head.jsp"/>

<body>

<c:import url="${ctx}/nav-bar.jsp"/>
<div class="container" style="margin-top:5%">
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-6">
            <div class="panel panel-success" style="text-align:center">
                <div class="panel-heading">
                    Welcome
                </div>
                <div class="panel-body">
                    You're Logged in!
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>