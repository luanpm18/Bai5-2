<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!doctype html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Thanks</title>
    <link rel="stylesheet" href="styles/style2.css"/>
</head>

<body>
<h1>Thanks for taking our survey!</h1>

  <p>Here is the information that you entered:</p>

<label>Email:</label>
<span>${user.email}</span><br>

<label>First Name:</label>
<span>${user.firstName}</span><br>

<label>Last Name:</label>
<span>${user.lastName}</span><br>

<label>Heard From:</label>
<span>${survey.hearFrom}</span><br>

<label>Updates:</label>
<c:if test="${survey.wantsUpdate == null}">
    <span>No</span><br>
</c:if>

<c:if test="${survey.wantsUpdate == 'Yes'}">
    <span>Yes</span><br>
</c:if>

<label>Contact Via:</label>
<span>${survey.contactVia}</span>


  <p>To enter another email address, click on the Back
    button in your browser or the Return button shown
    below.</p>

<form action="emailList" method="get">
  <input type="hidden" name="action" value="join">
  <input type="submit" value="Return">
</form>
</body>

</html>