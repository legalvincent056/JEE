package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
@WebServlet("/MaServletLister") //@WebServlet veut dire que lorsque j'utilise (/MaServlet) dans le navigateur, je fais appel � la class MaServlet
public class MaServletLister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaServletLister() {
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
		
		//1- R�cup�rer les �l�ments de la bdd
		//2- Traitements avec couche service
		
		IClientService cs = new ClientService();
		List<Client> lesClients = new ArrayList<Client>();
		lesClients = (List<Client>) cs.listerClients();
		
				
		//3- Pr�paration envoi
		request.setAttribute("lesClients", lesClients); //le premier "lenom" va �tre utilis� dans la JSP. nom repr�sente la valeur r�cup�r�e plus haut
		
		
		
		
		//4- Envoi
		request.getRequestDispatcher("/resultatLister.jsp").forward(request, response);
		
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
