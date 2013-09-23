package osa2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Teine servlet n2itab avatud sessioonide arvu.
//Sessioonide lugemiseks kasutada listener-i. N2ide loengu
//slaididelt.
//N2ide: http://ci.itcollege.ee/part2example/SessionCount

public class SessionCount {
	private static final long serialVersionUID = 1L;
	
	SessionCounterListener scl = new SessionCounterListener();
	Integer numberOfSessions = SessionCounterListener.getTotalActiveSessions();
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println(numberOfSessions.toString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
