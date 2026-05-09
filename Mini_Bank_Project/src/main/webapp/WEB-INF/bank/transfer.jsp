<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Transfer Funds</title></head>
<body>
<h2>Transfer Funds</h2>
<form action="transfer" method="post">
    From Account No: <input type="number" name="fromAccountNo" required><br><br>
    To Account No: <input type="number" name="toAccountNo" required><br><br>
    Amount: <input type="number" step="0.01" name="amount" required><br><br>
    <input type="submit" value="Transfer">
</form>
<p style="color:green;">${successMessage}</p>
<p style="color:red;">${errorMessage}</p>
<a href="dashboard">Back</a>
</body>
</html>
