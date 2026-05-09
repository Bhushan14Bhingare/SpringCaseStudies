<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head><title>Transaction History</title></head>
<body>
<h2>Transaction History</h2>
<table border="1" cellpadding="5">
    <tr>
        <th>ID</th>
        <th>Type</th>
        <th>Amount</th>
        <th>Description</th>
        <th>Date</th>
    </tr>
    <c:forEach var="txn" items="${transactions}">
        <tr>
            <td>${txn.txnId}</td>
            <td>${txn.txnType}</td>
            <td>${txn.amount}</td>
            <td>${txn.description}</td>
            <td>${txn.txnDate}</td>
        </tr>
    </c:forEach>
</table>
<p style="color:red;">${errorMessage}</p>
<a href="/bank/account/dashboard">Back</a>
</body>
</html>
