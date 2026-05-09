<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Create Account</title></head>
<body>
<h2>Create Account</h2>
<form action="create" method="post">
    User ID: <input type="number" name="userId" required><br><br>
    Account Holder: <input type="text" name="accountHolder" required><br><br>
    Account Type:
    <select name="accountType">
        <option value="SAVINGS">Savings</option>
        <option value="CURRENT">Current</option>
    </select><br><br>
    Initial Balance: <input type="number" step="0.01" name="balance" value="0"><br><br>
    <input type="submit" value="Create Account">
</form>
<p style="color:green;">${successMessage}</p>
<p style="color:red;">${errorMessage}</p>
<a href="dashboard">Back</a>
</body>
</html>
