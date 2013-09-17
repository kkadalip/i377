package osa2;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

//Teine servlet näitab avatud sessioonide arvu.
//Sessioonide lugemiseks kasutada listener-i. Näide loengu
//slaididelt.
//Näide: http://ci.itcollege.ee/part2example/SessionCount
public class Osa2yl2 extends HttpServlet implements HttpSessionListener {
	private static final long serialVersionUID = 1L;
    
	private static int sessionCount = 0;
	@Override
	public void sessionCreated(HttpSessionEvent event){
		sessionCount++;
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent event){
		sessionCount--;
	}
	
	public static int getSessionCount(){
		return sessionCount;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println(getSessionCount());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
