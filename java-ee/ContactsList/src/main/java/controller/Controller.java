package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.JavaBeans;

/**
 * Servlet implementation class Controller
 */
@WebServlet(urlPatterns = {
	"/Controller", 
	"/index", 
	"/save" 
})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		
		switch (action) {
			case "/index":
				request.setAttribute("contacts", dao.findAll());
				RequestDispatcher rd = request.getRequestDispatcher("contacts-list.jsp");
				rd.forward(request, response);
				break;
			case "/save":
				JavaBeans contact = new JavaBeans();
				contact.setName(request.getParameter("name"));
				contact.setPhone(request.getParameter("phone"));
				contact.setEmail(request.getParameter("email"));
				dao.save(contact);
				
				response.sendRedirect("index");
				break;
			default:
				response.sendRedirect("index.html");
		}
	}
}
