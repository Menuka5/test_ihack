<%-- 
    Document   : registration
    Created on : Sep 5, 2015, 12:44:17 PM
    Author     : janaka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>
        Registration
    </title>
    
    <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

    <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
        <script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
    
    
    
</head>
<body>

<div class="row" style="padding-left: 300px;padding-right: 300px;">
    <br>
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3 class="panel-title">Application Form</h3>
        </div>
        <form action = "RegistrationServlet" method="post">
        <div class="panel-body">
        
            <div class="row">
            <center>
                <div class="col-lg-2">
                    First Name :
                </div>
                <div class="col-lg-6">
                    <input type="text" name= "firstname" placeholder="Enter First name" class="form-control">
                </div>
            </center>
                
            </div>
            
            <br />
            
            <div class="row">
            <center>
                <div class="col-lg-2">
                    Last Name :
                </div>
                <div class="col-lg-6">
                    <input type="text" name = "lastname" placeholder="Enter Last Name" class="form-control">
                </div>
            </center>
                
            </div>
            <br />
            
            <div class="row">
                <center>
                    <div class="col-lg-2">
                    Contact Number :
                </div>
                <div class="col-lg-6">
                    <input type="text" name = "contact" placeholder="Enter Contact Number" class="form-control">
                </div>
                </center>
                
            </div>
            
            <br>

            <div class="row">
            <center>
                <div class="col-lg-2">
                    Email :
                </div>
                <div class="col-lg-6 controls">
                    <input type="email" name = "email" placeholder="Enter Email" class="form-control">
                </div>
                <label class="control-label"></label>
            </center>
                
            </div>
            
            <br>
            
            <div class="row">
            <center>
                <div class="col-lg-2">
                    Password :
                </div>
                <div class="col-lg-6">
                    <input type="password" name = "password" placeholder="Enter password" id="password1" class="form-control"/>
                </div>
            </center>
                
            </div>
            
            <br>

            <div class="row">
            <center>
            <div class="col-lg-2">
                    Confirm Password :
                </div>
                <div class="col-lg-6">
                    <input type="password" name = "confirm_password" placeholder="Retype password" id="password1" class="form-control"/>
                </div>
            </center>
                
            </div>
            
            <br>
            <br>

            <div class="row">
            <center><input type="submit" style="width: 200px;" class="btn btn-danger" value="Sign Up"/></center>
                
            </div>
            
            <br>
            
        </div>
        </form>
        <%
            
            String msg = (String) request.getAttribute("success msg");
            if(msg != null){
                out.println("<div>"+msg+"</div>");
            }
      
        %>
      
    </div>
</div>
    
<script type="text/javascript" src="lib/jquery-1.11.0.js"></script>
<script type="text/javascript" src="lib/bootstrap.js"></script>

</body>
</html>
