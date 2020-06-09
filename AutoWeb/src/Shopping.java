

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Shopping
 */
@WebServlet("/sh.do")
public class Shopping extends HttpServlet {
	


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sum=0;
		for(int i=1; i<=100;i++){
			if(i%2==0){
				sum+=i;
				
			}
		}
		response.setContentType("text/html; charset=euc-kr"); //MIME Type
		PrintWriter out = response.getWriter();
		out.println("3202 ±è³ª¿¬");
		out.println(sum);
	}

}
