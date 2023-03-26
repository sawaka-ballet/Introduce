package test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Topservlet
 */
@WebServlet("/Topservlet")
public class Topservlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Topservlet() {
        super();

    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = "自己紹介";
        String message = "関西大学、経済学部の松田幸和花です。私の強み、これまで取り組んできたことについてのwebサイトです。";
        String image = "sawaka.ballet.PNG";

        request.setAttribute("title", title);
        request.setAttribute("message", message);
        request.setAttribute("image", image);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/top.jsp");
        dispatcher.forward(request, response);	}


    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
