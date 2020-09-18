package servlet;


import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.bean;
import dao.dao;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/top")
public class top extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public top() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		ArrayList<bean> list = dao.selectAllBook();
		request.setAttribute("list", list);
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		String name = request.getParameter("name");
		String mail = request.getParameter("mail");
		String coment = request.getParameter("coment");
		if(name!=null){
			dao.tui(name,mail,coment,currentTime);
		}



		String view = "/WEB-INF/view/top.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}