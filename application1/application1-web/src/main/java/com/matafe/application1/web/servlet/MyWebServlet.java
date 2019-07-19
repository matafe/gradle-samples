package com.matafe.application1.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.matafe.application1.core.CoreService;

@Singleton
@WebServlet(name = "MyWebServlet", description = "My Web Servlet", urlPatterns = "/myWebServlet")
public class MyWebServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Inject
    CoreService coreService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	PrintWriter writer = resp.getWriter();
	writer.println("<!DOCTYPE html>");
	writer.println("<html>");
	writer.println("<body>");
	writer.println("<p>");
	writer.println("<i>");
	writer.println(coreService.getMessage());
	writer.println("</i>");
	writer.println("</p>");
	writer.println("</body>");
	writer.println("</html>");
    }
}
