package com.example.tirsdagtomcat.Entities;

import com.example.tirsdagtomcat.Entities.Entitet.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    public List<Person> personList = new ArrayList<>();



    public void init() {
        personList.add(new Person("Ida", "666", "admin"));
        personList.add(new Person("Lone", "1234"));
        personList.add(new Person("Lonny", "313"));
        personList.add(new Person("Feehaar", "4545"));


        Map<String, Person> personMap = new HashMap<>();

        for (Person person : personList) {
            personMap.put(person.getNavn(),person);
        }


        getServletContext().setAttribute("customers",personMap);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        Map<String, Person> personMap = (Map<String, Person>) getServletContext().getAttribute("customers");


        String navn = request.getParameter("navn");
        String kode = request.getParameter("kode");

        System.out.println(navn+" "+kode);


        if(request.getSession(false) == null || !request.isRequestedSessionIdValid())
        {
            System.out.println("vi kender allerede brugeren");
            request.getRequestDispatcher("WEB-INF/Hemmelig.jsp").forward(request,response);
        }

        if(!personMap.containsKey(navn))
        {
            request.setAttribute("besked","En bruger med det navn fandtes ikke");

            request.getRequestDispatcher("index.jsp").forward(request,response);
        }
        if(!personMap.get(navn).getKode().equalsIgnoreCase(kode))
        {
            request.setAttribute("besked","Koden er forkert, prøv igen");
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }

        HttpSession session = request.getSession();
        request.setAttribute("navn",navn);
        request.setAttribute("id",session.getId());

        session.setAttribute("navn",navn);
        session.setAttribute("kode",kode);
        request.getRequestDispatcher("WEB-INF/Hemmelig.jsp").forward(request,response);

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        Map <String, Person> personMap = (Map<String, Person>) getServletContext().getAttribute("customers");
        String nyNavn = request.getParameter("nyNavn");
        String nyKode = request.getParameter("nyKode");
        Person newPerson = new Person(nyNavn,nyKode);
        if(personMap.containsKey(newPerson.getNavn()))
        {
            request.setAttribute("besked","Brugeren findes allerede");
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }
        else {
            personMap.put(newPerson.getNavn(), newPerson);
            HttpSession session = request.getSession();
            request.setAttribute("navn",nyNavn);
            request.setAttribute("id",session.getId());

            session.setAttribute("navn",nyNavn);
            session.setAttribute("kode",nyKode);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

    public void destroy() {
    }
}