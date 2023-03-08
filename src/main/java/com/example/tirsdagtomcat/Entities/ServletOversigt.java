package com.example.tirsdagtomcat.Entities;

import com.example.tirsdagtomcat.Entities.Entitet.Person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletOversigt", value = "/ServletOversigt")
public class ServletOversigt extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        Person person = (Person) request.getSession().getAttribute("bruger");

        if (person.getRolle().equalsIgnoreCase("admin")) {
            request.getRequestDispatcher("WEB-INF/oversigt.jsp").forward(request,response);
        }

        request.setAttribute("msg", "Din rolle er ikke admin !");
        request.getRequestDispatcher("WEB-INF/hemmelig.jsp").forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }
}
