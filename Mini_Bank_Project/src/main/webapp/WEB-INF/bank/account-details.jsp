<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Account Details</title></head>
<body>
<h2>Account Details</h2>
<p>Account No: ${accountDetails.accountNo}</p>
<p>Holder Name: ${accountDetails.accountHolder}</p>
<p>Account Type: ${accountDetails.accountType}</p>
<p>Balance: ${accountDetails.balance}</p>
<p>Status: ${accountDetails.status}</p>
<p style="color:red;">${errorMessage}</p>
<a href="dashboard">Back</a>
</body>
</html>S
