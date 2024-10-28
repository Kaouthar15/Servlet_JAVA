package web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/formulaire")
public class Formulaire extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws 
	ServletException, IOException{
			
		response.setContentType("text/html");
		PrintWriter Sortie = response.getWriter(); 
		Sortie.println("<html>");
		Sortie.println("<head><title>Enregistrements coordonnées</title></head>");
		Sortie.println("<body>");
		Sortie.println("<h2>Enregistrements de vos cordonnées effectué:</h2>");
		Sortie.println("<hr width=75%>");
		Sortie.println("<p><b>Bonjour "+request.getParameter("civilite")+" ");
		Sortie.println(request.getParameter("nom")+" ");
		Sortie.println(request.getParameter("prenom")+".");
		int age = Integer.parseInt(request.getParameter("age"));
		String message = "Vous êtes un ";
		if (age > 0 && age < 12) message += "enfant";
		if (age >= 12 && age < 18) message += "adolescent";
		if (age >= 18 && age < 60) message += "adulte";
		if (age >= 60) message += "une personne du 3ème âge";
		Sortie.println("<p>"+message +"</b> </body> <html>");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws 
	ServletException, IOException{
		doGet(request,response);

	}

}
