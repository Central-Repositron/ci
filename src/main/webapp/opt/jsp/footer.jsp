<%-- 
    Document   : footer
    Created on : Apr 5, 2009, 7:35:32 AM
    Author     : SAYANTAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="author" content="sayantan" />
        <title>JSP Page</title>
    </head>
    <body>
        <TABLE border=0 cellPadding=0 cellSpacing=0 width="100%" ALIGN=CENTER vAlign=bottom>
            <TBODY>
                <TR>
                    <%--<TD align=center vAlign=center height="35" style="height: 64px; left: 376px; top: 539px; position: absolute"><FONT face=Arial size=1> --%>
                        <TD align=center vAlign=center height="35" style="height: 64px; left: 6px; top: 50px; position: relative" ><FONT face=Arial size=1> 
                            <% 
                                String server=application.getContextPath();
                            %>
                            <P align=center> | <A class=copyright href="<%=server%>/footer/help.html">Help</A> &nbsp;|
                            <A href= "<%=server%>/footer/notes.html">Release Notes</A> &nbsp;|
                            <A href= "<%=server%>/footer/copyright.jsp">Copyright</A> &nbsp;|
                            <A href= "<%=server%>">Home</A> &nbsp;|
                            <BR>
                            <P align="center"><FONT face="Arial" size="1">Moonshine - Home brewed project by Zajntan LLC </FONT></P> 
                    </FONT></TD>
                </TR>
            </TBODY>
        </TABLE>
    </body>
</html>
