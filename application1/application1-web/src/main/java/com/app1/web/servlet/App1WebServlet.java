package com.app1.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app1.core.App1CoreService;

@Singleton
@WebServlet(name = "App1WebServlet", description = "App1 Web Servlet", urlPatterns = "/app1WebServlet")
public class App1WebServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Inject
    App1CoreService appCore1Service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	PrintWriter writer = resp.getWriter();
	writer.println("<!DOCTYPE html>");
	writer.println("<html>");
	writer.println("<body>");
	writer.println("<p>");
	writer.println(appCore1Service.getMessage());
	writer.println("</p>");
	writer.println("</body>");
	writer.println("</html>");
    }
}
