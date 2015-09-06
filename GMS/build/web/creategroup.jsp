<%-- 
    Document   : creategroup
    Created on : Sep 5, 2015, 6:42:55 PM
    Author     : janaka
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="gms.controller.Person_details_controller"%>
<%@page import="gms.model.Person_details_model"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Dashboard</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/datepicker3.css" rel="stylesheet">
<link href="css/styles.css" rel="stylesheet">
<link href="css/group.css" rel="stylesheet">


<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<script src="js/respond.min.js"></script>
<![endif]-->

</head>

<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			
            <div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#sidebar-collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="adminpanel.jsp"><span>iHack</span>Admin</a>
			</div>
							
		</div>
        
	</nav>
		
	<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		
		<ul class="nav menu">
			<li class=""><a href="adminpanel.jsp"><span class="glyphicon glyphicon-dashboard"></span> My Profile</a></li>
            <li class="parent ">

				<a href="#">
					<span class="glyphicon glyphicon-list"></span><span href="#sub-item-1"> <span data-toggle="collapse" href="#sub-item-1"> Moderator </span></span><span data-toggle="collapse" href="#sub-item-1" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></span> 
				</a>
				<ul class="children collapse" id="sub-item-1">
					<li>
						<a class="" href="addmoderate.jsp">
							<span class="glyphicon glyphicon-share-alt"></span>  Add Moderator
						</a>
					</li>
					<li>
						<a class="" href="removemoderate.jp">
							<font color="white" ><span class="glyphicon glyphicon-share-alt"></span> Remove Moderator
						</a></font>
					</li>
					<li>
						<a class="" href="showmoderate.jsp">
							<span class="glyphicon glyphicon-share-alt"></span> Show Moderator
						</a>
					</li>
				</ul>
			</li>
            
            
			
			<li class="parent active">
				<a href="#">
					<span class="glyphicon glyphicon-list"></span> <span data-toggle="collapse" href="#sub-item-2"> Groups </span><span data-toggle="collapse" href="#sub-item-2" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></span> 
				</a>
				<ul class="children collapse" id="sub-item-2">
					<li>
						<a class="" href="showgroup.jsp">
							<span class="glyphicon glyphicon-share-alt"></span> Show Groups
						</a>
					</li>
					<li>
						<a class="active" href="CreateUserGroupServlet">
							<font color="white" ><span class="glyphicon glyphicon-share-alt"></span> Create Group
						</a></font>
					</li>
					<li>
						<a class="" href="DeleteUserGroupServlet">
							<span class="glyphicon glyphicon-share-alt"></span> Delete Group
						</a>
					</li>
				</ul>
			</li>
			
			<li role="presentation" class="divider"></li>
			
		</ul>
        
        
	</div><!--/.sidebar-->
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">			
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="CreateUserGroupServlet"><span class="glyphicon glyphicon-home"></span></a></li>
				<li class="active">Create Group</li>
			</ol>
            
            
		</div><!--/.row-->
		<div class="row">
			<div class="col-lg-12">
				<h2 class="page-header">Create Group</h2>
            
        <form action="createGroupServlet" method="post">  
<div id="details"><table>
<tr><td>Group Name</td><td><input type="text" class="form-control" name="gname" placeholder="Enter group name" size="50px"></td></tr>
<tr><td>Description</td>
<td><textarea id="border" class="form-control"  name= "gdes" rows="1" cols="17" placeholder="Add group description"></textarea></td>
</tr>
    </table>
    
<div>
                    <table>
                        <tr>
                            <th>Person Id</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Email</th> 
                            <th>Add Members</th>
                        </tr>
                        <%
                            //String person = (String) request.getSession(false).getAttribute("sessionMemberID");
                            //int personID = Integer.parseInt(person);
                           // ArrayList<Person_details_model> rmlis = Person_details_controller.getAllMembers();
                            //System.out.print(groupList.get(0).getGname());
                        %>
                        <c:forEach items="${rmlis}" var="group">
                            <tr>
                                <td><c:out value="${group.person_id}"/>
                                <td><c:out value="${group.fname}"/>
                                <td><c:out value="${group.lname}"/>
                                <td><c:out value="${group.email}"/>
                                <td><input name= "checkPersonID" type="checkbox" value="${group.person_id}"></td>
                            </tr>
                        </c:forEach>
               </table>
                </div>
                        <table>

<tr><td rowspan="6">Privacy</td>
<td><br><input type="radio" name="privacy" value = "public">&nbsp;<icon class="glyphicon glyphicon-globe">&nbsp;<b>Public</b></td></tr>
<tr><td>Anyone can see the group, its members and their posts.</td></tr>
<tr><td><input type="radio" name="privacy" checked="checked" value = "secert">&nbsp;<icon class="glyphicon glyphicon-eye-close" >&nbsp;<b>Closed</b></td></tr>
<tr><td>Anyone can find the group and see who's in it. Only members can see posts.</td></tr>
<tr><td><input type="radio" name="privacy" value = "closed">&nbsp;<icon class="glyphicon glyphicon-lock">&nbsp;<b>Secret</b></td></tr>
<tr><td>Only members can find the group and see posts.</td></tr>
</tr>
<tr><td></td>
<td><input type="submit" id="gr1" name="submit" value="Create" class="btn btn-success">
    <input type="reset" name="cancel" id ="gr2" value="cancel" class="btn btn-danger"></td></tr>
</table>
</form>
			</div>
		</div>
		</div><!--/.row-->
<!--/.main-->

	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/chart.min.js"></script>
	<script src="js/chart-data.js"></script>
	<script src="js/easypiechart.js"></script>
	<script src="js/easypiechart-data.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	<script>
		$('#calendar').datepicker({
		});

		!function ($) {
		    $(document).on("click","ul.nav li.parent > a > span.icon", function(){          
		        $(this).find('em:first').toggleClass("glyphicon-minus");      
		    }); 
		    $(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
		}(window.jQuery);

		$(window).on('resize', function () {
		  if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
		})
		$(window).on('resize', function () {
		  if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
		})
	</script>	
</body>

</html>
