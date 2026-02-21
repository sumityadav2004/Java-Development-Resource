package servlet;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/first")

public class firstservlet implements Servlet{
 
	private ServletConfig servletconfig;
	
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		this.servletconfig=arg0;
		System.out.println("initializing servlet");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service Request");
		
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy servlet");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.servletconfig;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "this servlet is created by Author:sumit yadav";
	}

	
	
	

}
