
<%@page import="java.util.Iterator"%>
<%@page import="java.util.*"%>
<html>
<body>
	<h1 align="center">Beer Recommendations JSP</h1>
	<%
		List styles = (List) request.getAttribute("styles");
		Iterator it = styles.iterator();
		while (it.hasNext()) {
			out.print("<br>Try :" + it.next());
		}
	%>
</body>
</html>