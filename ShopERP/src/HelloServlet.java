import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
	// JavaEE의 기본 메서드?
	public void service(HttpServletRequest req,HttpServletResponse resp) 
		throws ServletException, IOException{
			
		// 클라이언트가 요청하면 HelloServlet 문자열을 응답해보자\
		resp.setContentType("text/html; charset=euc-kr"); //MIME Type
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("3202_김나연_HelloServlet");
		out.println("</body>");
		out.println("</html>");
		
	}
	
}
