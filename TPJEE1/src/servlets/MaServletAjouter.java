package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Client;
import service.ClientService;
import service.IClientService;

/**
 * Servlet implementation class MaServlet
 */
@WebServlet("/MaServletAjouter") //@WebServlet veut dire que lorsque j'utilise (/MaServlet) dans le navigateur, je fais appel � la class MaServlet
public class MaServletAjouter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaServletAjouter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*response.getWriter().append("Served at: ").append(request.getContextPath())
		.append("\n client adresse : ").append(request.getRemoteAddr())
		.append("\n nom : ").append(request.getParameter("nom"))
		.append("\n prenom : ").append(request.getParameter("prenom"))
		.append("\n mdp : ").append(request.getParameter("mdp"));
	
		String[] lesLoisirs = request.getParameterValues("loisirs"); 
		
		for(String l : lesLoisirs){
			response.getWriter().append(l+"\n");
		}*/
		request.setCharacterEncoding("utf-8"); //permet d'avoir des noms et prenoms avec des accents.
		
		//1- R�cup�rer les param�tres
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String yeux = request.getParameter("yeux");
		int age = Integer.parseInt(request.getParameter("age"));
		
		//2- Traitements avec couche service
		
		IClientService cs = new ClientService();
		Client c = new Client(nom,prenom,yeux,age);
		
		cs.ajouterClient(c);
		
		
		//3- Pr�paration envoi
		request.setAttribute("lenom", nom); //le premier "lenom" va �tre utilis� dans la JSP. nom repr�sente la valeur r�cup�r�e plus haut
		request.setAttribute("leprenom", prenom);
		request.setAttribute("lesyeux", yeux);
		request.setAttribute("lage", age);
		
		
		
		//4- Envoi
		request.getRequestDispatcher("/resultatAjouter.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("\n nom : ").append(request.getParameter("nom"));
		response.getWriter().append("\n prenom : ").append(request.getParameter("prenom"));
		response.getWriter().append("\n mdp : ").append(request.getParameter("mdp"));
				
	}

}
