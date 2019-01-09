<%-- 
    Document   : LogIn
    Created on : Jan 6, 2019, 1:10:39 AM
    Author     : Clara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1>Sign-up</h1>

     <p>Please fill in the form to sign-up for the Java EE 6 Development forum.</p>
     <form action="welcome" method="POST">
       <label>Name: </label><input type="text" name="name"><br />
       <label>Email: </label><input type="email" name="email"><br />
       <label>Password: </label><input type="password" name="password"><br />
       <label>How did you learn about this tutorial?</label>
       <select name="reference">
           <option value="OLL">Oracle Learning Library</option>
           <option value="Newsletter">Newsletter</option>
           <option value="Social">Social network(s)</option>
           <option value="Search">Internet search</option>
           <option value="Other">Other</option>
       </select><br>
       <label>Gender:</label><br>
         <input type="radio" name="gender" value="male">Male
         <input type="radio" name="gender" value="female">Female<br>
       <label>Select the topics that you're interested about:</label><br>
         <input type="checkbox" name="interests" value="client">Client-side development
         <input type="checkbox" name="interests" value="server">Server-side development
         <input type="checkbox" name="interests" value="database">Database technologies
         <input type="checkbox" name="interests" value="other">Other<br>
       <input type="submit" value="Sign-up">
     </form>
    </body>
</html>
