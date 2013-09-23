package osa2;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//Esimene servlet n3itab kasutaja sessiooni id-d ja sessiooni pandud
//atribuudi v22rtust.
//V6imaldab sessiooni atribuuti seada (?param=value1).
//Seadmiseks on servleti parameeter nimega "param".
//N2ide: http://ci.itcollege.ee/part2example/HomePage
public class HomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String sessionId = session.getId();
		response.getWriter().println("Hello");
		response.getWriter().println("Your session id is "+sessionId);
		response.getWriter().println("Session attribute is "+request.getParameter("param"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
