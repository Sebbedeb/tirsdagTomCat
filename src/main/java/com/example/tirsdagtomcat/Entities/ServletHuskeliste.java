package com.example.tirsdagtomcat.Entities;

import com.example.tirsdagtomcat.Entities.Entitet.Person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletHuskeliste", value = "/ServletHuskeliste")
public class ServletHuskeliste extends HttpServlet {
    public ArrayList<String> huskeliste;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        HttpSession session = request.getSession();
        String ting = request.getParameter("ting");
        for(Person person : Brugere.brugerList)
        {
            if(person.getNavn().equals(session.getAttribute("navn")))
            {
                System.out.println("Det virkede");
                person.addToHuskeListe(ting);
                for (String s : person.getHuskeliste()) {
                    System.out.println(s);
                }
            }
        }
        request.getRequestDispatcher("WEB-INF/Hemmelig.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        HttpSession session = request.getSession();
        for(Person person : Brugere.brugerList)
        {
            if(person.getNavn().equals(session.getAttribute("navn")))
            {
                request.setAttribute("huskeliste",person.getHuskeliste());
                request.getRequestDispatcher("WEB-INF/Huskeliste.jsp").forward(request,response);
            }
        }
    }
}
