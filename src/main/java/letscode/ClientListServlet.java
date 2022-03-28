package letscode;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClientListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        String errorString = "null";
        Connection conn = DbUtils.getStoredConnection(req);
        ArrayList<String[]> clientList = new ArrayList<>();
        String test2 = "123456";

        String test = "ssdsdsd";
        ArrayList<Client> clients = new ArrayList<Client>() {{
            add(new Client("Ivan",20,60,160));
            add(new Client("Petr",30,80,170));
        }};
        //test[1] = "2ssdsdsd";
        //test[2] = "3ssdsdsd";
        //test[3] = "4ssdsdsd";
        //test[4] = "5ssdsdsd";
        //test[5] = "6ssdsdsd";
        //clientList.add(test);
        clientList = DbFunctions.readData(conn, "client");//insert true name table
        req.setAttribute("clients",clients);
        req.setAttribute("testField",test);
        RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/clientList.jsp");
        dispatcher.forward(req,resp);
        //resp.getWriter().write("Method doGet\nURI: " + uri + "\nParams:\n" + params + "\n");
    }

   @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
