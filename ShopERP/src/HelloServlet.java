import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
	// JavaEE�� �⺻ �޼���?
	public void service(HttpServletRequest req,HttpServletResponse resp) 
		throws ServletException, IOException{
			
		// Ŭ���̾�Ʈ�� ��û�ϸ� HelloServlet ���ڿ��� �����غ���\
		resp.setContentType("text/html; charset=euc-kr"); //MIME Type
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("3202_�質��_HelloServlet");
		out.println("</body>");
		out.println("</html>");
		
	}
	
}
