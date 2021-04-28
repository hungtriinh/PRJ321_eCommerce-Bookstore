<%-- 
    Document   : logOut
    Created on : Mar 12, 2021, 12:46:01 AM
    Author     : Hung Trinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    session.invalidate();
    response.sendRedirect("home");
%>
