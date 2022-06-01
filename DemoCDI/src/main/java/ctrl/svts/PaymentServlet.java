package ctrl.svts;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ctrl.Payment;
import ctrl.PaymentAyden;

/**
 * Servlet implementation class PaymentServlet
 */
@WebServlet({ "/PaymentServlet", "/index.html" })
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	@Inject
	@PaymentAyden
	Payment payment;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.println(payment.getClass().getSimpleName());
		out.println(payment.toString());
		
		
	}

}
