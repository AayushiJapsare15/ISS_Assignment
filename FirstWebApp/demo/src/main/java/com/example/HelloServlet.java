package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HelloServlet is a simple servlet that displays Hello World message.
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    /**
     * Handles HTTP GET request.
     *
     * @param request HttpServletRequest
     * @param response HttpServletResponse
     * @throws IOException if an input or output error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello World from Servlet!</h1>");
    }
}
