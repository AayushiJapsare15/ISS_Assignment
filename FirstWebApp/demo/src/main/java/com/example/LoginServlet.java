package com.example;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        String user = req.getParameter("user");
        String pass = req.getParameter("pass");

        if ("admin".equals(user) && "admin".equals(pass)) {
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
            res.sendRedirect("welcome.jsp");
        } else {
            req.setAttribute("error", "Invalid username or password");
            try {
                req.getRequestDispatcher("login.jsp").forward(req, res);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
