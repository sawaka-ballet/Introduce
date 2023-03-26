package test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class Helloservlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Helloservlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String button = request.getParameter("button");

        String title = "";
        String message = "";
        String image = "";
        if (button == null || button.equals("1")) {
            title = "向上心、好奇心";
            message = "私はクラシックバレエで、日々の努力継続によって目標を達成した経験から、向上心、好奇心によって貢献することができます。";
            image = "ballet.jpg";
        } else if (button.equals("2")) {
            title = "チームワーク";
            message = "全員で揃えて踊るという目標に向けて、私は周りを見てサポートをするということに注力し、チームワークが身につきました。";
            image = "IMG_9077.jpg";
        } else if (button.equals("3")) {
            title = "カフェでのアルバイト";
            message = "アルバイトでは企画力、創造力を活かして、新商品の提案とSNSでの宣伝によって課題を解決しました。";
            image = "IMG_4240.jpg";
        }


        request.setAttribute("title", title);
        request.setAttribute("message", message);
        request.setAttribute("image", image);


        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/text.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
