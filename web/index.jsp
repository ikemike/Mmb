<%--
  Created by IntelliJ IDEA.
  User: Ike
  Date: 2/24/2016
  Time: 6:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html data-vide-bg="images/sky2"
      data-vide-options="bgColor:transparent, position: 100% 100%, loop: true"
      class="image_display">

  <head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
    <script src="js/jquery.vide.js"></script>



    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

    <!-- Latest compiled JavaScript -->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>


    <style>
    </style>




    <title>Ike's Index</title>

  </head>
  <body>


  <div class="row" style="height:100%;width:100%;">
    <!-- LEFT MAIN -->
    <div class="col-sm-2" style="height:100%;"></div>

    <!-- CENTER MAIN -->
    <div class="col-sm-8">

      <div class="row" style="height:200px;width:100%;font-align:center;">
        <div class="col-sm-4">
          <span id="log-in">
          <form action="../restricted/restricted.jsp">
          <button type="submit">Login</button>
          </form>
          </span>
        </div>
        <div class="col-sm-4"></div>
        <div class="col-sm-4"><img src="images/MMB_Brain.png" style="height:75px;width:75px;"></div>

      </div>
    </div>
    <div class="col-sm-2" style="width:100%;height:100%;background-color:black;opacity: 0.99;"></div></div>

  </body>

</html>
