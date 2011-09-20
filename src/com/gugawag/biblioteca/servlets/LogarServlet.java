package com.gugawag.biblioteca.servlets;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.corba.se.spi.protocol.RequestDispatcherDefault;

/**
 * Servlet implementation class login
 */
@WebServlet("/logar.do")
public class LogarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		if ("tw".equalsIgnoreCase(login) && "tw".equalsIgnoreCase(senha)) {
			HttpSession sessao = request.getSession(true);
			
			RequestDispatcher r = request.getRequestDispatcher("/principal.jsp");
			r.forward(request, response);
		}else{
			RequestDispatcher r = request.getRequestDispatcher("/login.jsp?mensagem=Usu‡rio e/ou senha inv‡lido(s)!");
			r.forward(request, response);
		} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
