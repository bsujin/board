package kr.or.ddit.board.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationListener implements ServletContextListener{

	private static final Logger logger = LoggerFactory.getLogger(ApplicationListener.class);
	
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		logger.debug("init()");
		ServletContext sc = sce.getServletContext();
		sc.setAttribute("cp", sc.getContextPath());
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		logger.debug("destroy()");
	}

}
