<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Balance Inquiry</title></head>
<body>
<h2>Check Balance</h2>
<form action="balance" method="post">
    Account No: <input type="number" name="accountNo" required><br><br>
    <input type="submit" value="Check Balance">
</form>
<p style="color:blue;">${balance}</p>
<p style="color:red;">${errorMessage}</p>
<a href="dashboard">Back</a>
</body>
</html>
