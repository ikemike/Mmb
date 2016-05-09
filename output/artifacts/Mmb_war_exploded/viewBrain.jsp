<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<c:import url="head.jsp"/>

<body>
<c:import url="nav-bar.jsp"/>
<div class="container">
    <h3>Brain Data</h3>
    <c:choose>
        <c:when test="${!empty brains}">
            <table class="table table-responsive">
                <tr>
                    <th class="col-sm-2">ID</th>
                    <th class="col-sm-2">Serial Data</th>
                </tr>
                <!-- Loop through each record in the brain table -->
                <c:forEach items="${brains}" varStatus="loop">
                    <tr>
                        <td>${brains[loop.index].id}</td>
                        <td>${brains[loop.index].serialData}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:when>

        <c:otherwise>
            <p>Oh...I think something's broken :( </p>
        </c:otherwise>
    </c:choose>
</div>
</body>
</html>