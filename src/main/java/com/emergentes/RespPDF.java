package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "RespPDF", urlPatterns = {"/RespPDF"})
public class RespPDF extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("application/pdf");
                PrintWriter out = response.getWriter();
                try {
            out.println("PDF generado desde servlet");
        } finally {
                    out.close();
        }
    }
}
