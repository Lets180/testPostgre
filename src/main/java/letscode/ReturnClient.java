package letscode;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.stream.Collectors;

import static java.rmi.server.LogStream.log;
@WebServlet(urlPatterns = {"/return-servlet"})
public class ReturnClient extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        log("Method init =)");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Method service enter\n");
        super.service(req, resp);
        resp.getWriter().write("Method service exit\n");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String uri = req.getRequestURI();
        String params = formatParams(req);

        resp.getWriter().write("Method doGet\nURI: " + uri + "\nParams:\n" + params + "\n");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        String params = formatParams(req);
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        System.out.println("username: " + userName);
        System.out.println("password: " + password);
        Connection conn = DbUtils.connectDb("postgres","180180141");
        DbUtils.storeConnection(req,conn);
        PrintWriter writer = resp.getWriter();
        writer.println(userName);
        writer.println(password);
        resp.getWriter().write("Method doPost\nURI: " + uri + "\nParams:\n" + params + "\n");
        RequestDispatcher dispatcher = req.getServletContext()
                .getRequestDispatcher("/first-jsp.jsp");
        dispatcher.forward(req, resp);

    }

    private String formatParams(HttpServletRequest req) {
        return req.getParameterMap()
                .entrySet()
                .stream()
                .map(entry -> {
                    String param = String.join(" and ", entry.getValue());
                    return entry.getKey() + " => " + param;
                })
                .collect(Collectors.joining("\n"));
    }

    @Override
    public void destroy() {
        log("Method destroy =)");
    }
}

