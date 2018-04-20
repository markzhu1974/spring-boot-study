<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head lang="en">
</head>
<body>
<h1 id="name">${name}</h1>
<c:url value="http://www.abc.com" var="url"/>
<spring:url value="http://www.abc.com" htmlEscape="true" var="springUrl" />

Spring URL: ${springUrl}
<br>
JSTL URL: ${url}

</body>
</html>