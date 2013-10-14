package osa3;

import javax.servlet.*;
//import javax.servlet.ServletContextEvent;
//import javax.servlet.ServletContextListener;

public class ServletContextListener implements javax.servlet.ServletContextListener {
	
	@Override
    public void contextInitialized(ServletContextEvent arg0) {
    	//System.out.println("ServletContextListener initialized");
    	dao.SetupDao setup = new dao.SetupDao();
    	setup.destroy();
    	setup.createSchema();
    	//setup.createDefaultValues();
    }

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
    	//System.out.println("ServletContextListener destroyed");
    }
	
}
