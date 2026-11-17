<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/style.css"/>
</head>
<body>
<img src="image/murach.png" alt="Ảnh murach">
<h1>Survey</h1>
<p>If you have a moment, we'd appreciate it if you would fill out this survey.</p>
<p style="color: red;">${message}</p>

<form action="emailList" method="post">
    <input type="hidden" name="action" value="add">

    <section class="form-group">
        <h2>Your information:</h2>

        <label>Email:</label>
        <input type="email" name="email" value="${user.email}"><br>

        <label>First Name:</label>
        <input type="text" name="firstName" value="${user.firstName}"><br>

        <label>Last Name:</label>
        <input type="text" name="lastName" value="${user.lastName}"><br>
    </section>

    <section class="radio-group">
        <h2>How did you hear about us?</h2>
        <input type="radio" name="hearFrom" value="Search Engine" checked>
        <label>Search Engine</label>

        <input type="radio" name="hearFrom" value="Word of mouth">
        <label>Word of mouth</label>

        <input type="radio" name="hearFrom" value="Social Media">
        <label>Social Media</label>

        <input type="radio" name="hearFrom" value="Other">
        <label>Other</label>
    </section>

    <section class="checkbox-group">
        <h2>Would you like to receive announcements about new CDs and special offers?</h2>
        <input type="checkbox" id="wantsUpdate" name="wantsUpdate" value="Yes" checked>
        <label for="wantsUpdate">YES, I'd like that.</label>
    </section>

    <section class="dropdown-group">
        <label for="contactVia">Please contact me by:</label>
        <select id="contactVia" name="contactVia">
            <option value="Email">Email</option>
            <option value="Postal mail">Postal mail</option>
            <option value="Both">Both</option>
        </select>
    </section>

    <input type="submit" value="Submit" id="submit">
</form>
</body>
</html>
