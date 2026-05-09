<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Deposit</title></head>
<body>
<h2>Deposit Money</h2>
<form action="deposit" method="post">
    Account No: <input type="number" name="accountNo" required><br><br>
    Amount: <input type="number" step="0.01" name="amount" required><br><br>
    <input type="submit" value="Deposit">
</form>
<p style="color:green;">${successMessage}</p>
<p style="color:red;">${errorMessage}</p>
<a href="dashboard">Back</a>
</body>
</html>
