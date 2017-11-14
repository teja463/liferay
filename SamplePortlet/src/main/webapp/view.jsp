<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is just a sample portlet

<portlet:actionURL var="action" name="sampleAction">
	<portlet:param name="name" value="Teja.."/>
	<portlet:param name="mvcPath" value="/view.jsp" />
</portlet:actionURL>

<a href="${action}">Action Url</a>

<%
	String s = renderRequest.getParameter("name");
	System.out.println("s"+s);
	
%>

<form action="${action }" method="post">

</form>
