package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MaServlet
 */
@WebServlet("/MaServlet") //@WebServlet veut dire que lorsque j'utilise (/MaServlet) dans le navigateur, je fais appel à la class MaServlet
public class MaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath())
		.append("\n client adresse : ").append(request.getRemoteAddr())
		.append("\n nom : ").append(request.getParameter("nom"))
		.append("\n prenom : ").append(request.getParameter("prenom"))
		.append("\n mdp : ").append(request.getParameter("mdp"));
	
		String[] lesLoisirs = request.getParameterValues("loisirs"); 
		
		for(String l : lesLoisirs){
			response.getWriter().append(l+"\n");
		}
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
