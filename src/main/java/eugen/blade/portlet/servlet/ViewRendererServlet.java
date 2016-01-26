package eugen.blade.portlet.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"osgi.http.whiteboard.servlet.name=view-servlet",
		"osgi.http.whiteboard.servlet.pattern=/WEB-INF/servlet/view",
		"service.ranking:Integer=100" }, 
		service = { Servlet.class })

public class ViewRendererServlet extends org.springframework.web.servlet.ViewRendererServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.err.println("=========================================");
		super.init(config);
	}
	
	@Activate
	public void activate() {
		System.err.println("Eugen Servlet activated: " + this);
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.err.println("=========================================");
		
		//resp.getWriter().append("Salut");
		
		super.service(req, resp);
	}
	
}
