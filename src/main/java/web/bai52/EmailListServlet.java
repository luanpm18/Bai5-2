package web.bai52;

import java.io.*;

import businessClass.User;
import businessClass.Survey;
import jakarta.servlet.http.*;
import jakarta.servlet.*;

public class EmailListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String url = "/index.jsp";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

        if (action.equals("join")){
            url = "/index.jsp";
        }
        else if (action.equals("add")) {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String hearFrom = request.getParameter("hearFrom");
            String wantsUpdate = request.getParameter("wantsUpdate");
            String contactVia = request.getParameter("contactVia");

            if (firstName == null || firstName.trim().isEmpty() ||
                    lastName == null || lastName.trim().isEmpty() ||
                    email == null || email.trim().isEmpty()
                    ) {

                String message = "Vui lòng nhập đầy đủ các trường thông tin (First Name, Last Name, Email, Date)!";
                request.setAttribute("message", message);
                url = "/index.jsp";
            }

            User user = new User(firstName, lastName, email);
            Survey survey = new Survey(hearFrom, wantsUpdate, contactVia);
            request.setAttribute("user", user);
            request.setAttribute("survey", survey);

            url = "/thanks.jsp"; // Chuyển sang thanks.jsp khi dữ liệu hợp lệ
        }

        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);

    }
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}