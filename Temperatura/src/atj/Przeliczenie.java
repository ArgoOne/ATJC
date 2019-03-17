package atj;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Przeliczenie")
public class Przeliczenie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Double value1 = Double.parseDouble(request.getParameter("value1"));

		String oper = request.getParameter("oper");
		double wynik = przelicz(value1, oper);

		request.setAttribute("wybor", new String(oper));
		request.setAttribute("result", new Double(wynik));

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("res.jsp");
		
		requestDispatcher.forward(request, response);

		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	public double przelicz(double value1, String oper) {
		double wynik = 0;
		if (oper.equalsIgnoreCase("CF")) {
			return wynik = (value1 * 1.8000) + 32;
		}
		if (oper.equalsIgnoreCase("FC")) {
			return wynik = (value1 - 32) * 1.8000;
		}
		return 0;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
