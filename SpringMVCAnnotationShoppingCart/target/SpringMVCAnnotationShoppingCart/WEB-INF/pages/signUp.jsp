<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 
<title>Login</title>
 
<link href="<c:url value='/static/css/style.css' />" rel="stylesheet"></link>
 
</head>
<body>
 
 
   <jsp:include page="_header.jsp" />
   <jsp:include page="_menu.jsp" />
 
 
 
   <div class="page-title">Sign Up</div>
 
   <div class="login-container">
 
       <h3>Enter Sign Up Details</h3>
       <br>
       <!-- /login?error=true -->
       <c:if test="${param.error == 'true'}">
           <div style="color: red; margin: 10px 0px;">
 
               Login Failed!!!<br /> Reason :
               ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}

           </div>
       </c:if>
 
       <form method="POST"
           action="${pageContext.request.contextPath}/j_spring_security_check">
           <table>
               <tr>
                   <td>First Name *</td>
                   <td><input name="firstName" /></td>
               </tr>
 			
 			   <tr>
                   <td>Last Name *</td>
                   <td><input name="lastName" /></td>
               </tr>	
 				
 				<tr>
                   <td>Email *</td>
                   <td><input name="email" /></td>
               </tr>
               
               <tr>
                   <td>Phone *</td>
                   <td><input name="phoneNo" /></td>
               </tr>
               	
               <tr>
                   <td>Password *</td>
                   <td><input type="password" name="password" /></td>
               </tr>
               
               <tr>
                   <td>SSOId *</td>
                   <td><input name="ssoId" /></td>
               </tr>
 
               <tr>
                   <td>&nbsp;</td>
                   <td><input type="submit" value="Submit" /> <input type="reset"
                       value="Reset" /></td>
               </tr>
           </table>
       </form>
 
       <span class="error-message">${error }</span>
 
   </div>
 
 
   <jsp:include page="_footer.jsp" />
 
</body>
</html>