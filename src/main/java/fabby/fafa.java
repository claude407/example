package fabby;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class fafa
 */
@WebServlet("/fafa")
public class fafa extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public fafa() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	      String input = request.getParameter("inputString");

	        // Initialize result variables
	        String reversedString = "";
	        int length = 0;

	        // Process the string
	        if (input != null && !input.trim().isEmpty()) {
	            // Reverse the string
	            reversedString = new StringBuilder(input).reverse().toString();
	            
	            // Calculate the length of the string
	            length = input.length();
	        } else {
	            reversedString = "No input provided";
	            length = 0;
	        }

	        // Set response content type
	        response.setContentType("text/html");

	        // Write response
	        response.getWriter().println("<html><body>");
	        response.getWriter().println("<h1>String Processing Result</h1>");
	        response.getWriter().println("<p>Original String: " + input + "</p>");
	        response.getWriter().println("<p>Reversed String: " + reversedString + "</p>");
	        response.getWriter().println("<p>Character Count: " + length + "</p>");
	        response.getWriter().println("</body></html>");
	    }
	}


