/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.20.v20190813
 * Generated at: 2022-03-28 12:43:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import letscode.User;
import letscode.Client;

public final class first_002djsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.time.LocalDateTime");
    _jspx_imports_classes.add("letscode.User");
    _jspx_imports_classes.add("letscode.Client");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>First JSP</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h1>Hello JSP</h1>\n");

    response.getWriter().write("First message");
    out.print("right here, after header");

      out.write("\n");
      out.write("<br/>\n");
      out.print( request.getRequestURI() );
      out.write("\n");
      out.write("<br>\n");
      out.print( LocalDateTime.now() );
      out.write("\n");
      out.write("<hr/>\n");

    List<User> users = (List) request.getAttribute("users");
    User anUser = users.get(0);

      out.write("\n");
      out.write("    <b>");
      out.print( anUser.getName() );
      out.write("</b>\n");
      out.write("    <i>");
      out.print( anUser.getCountry() );
      out.write("</i>\n");
      out.write("    <u>");
      out.print( anUser.getAge() );
      out.write("</u>\n");

    ArrayList<Client> clients = (ArrayList) request.getAttribute("clients");
    Client anClient = clients.get(0);

      out.write("\n");
      out.write("    <b>");
      out.print( anClient.getName() );
      out.write("</b>\n");
      out.write("    <i>");
      out.print( anClient.getAge() );
      out.write("</i>\n");
      out.write("    <u>");
      out.print( anClient.getBalanceAccount() );
      out.write("</u>\n");
      out.write("<table>\n");
 for (Client client : clients) {
      out.write("\n");
      out.write("    <tr>\n");
      out.write("       <td>");
      out.print( client.getName() );
      out.write("</td>\n");
      out.write("       <td>");
      out.print( client.getAge() );
      out.write("</td>\n");
      out.write("       <td>");
      out.print( client.getWeight() );
      out.write("</td>\n");
      out.write("       <td>");
      out.print( client.getHeight() );
      out.write("</td>\n");
      out.write("       <td>");
      out.print( client.getIdAccount() );
      out.write("</td>\n");
      out.write("       <td>");
      out.print( client.getBalanceAccount() );
      out.write("</td>\n");
      out.write("    </tr>\n");
 } 
      out.write('\n');
      out.write('\n');
 for (User user : users) {
      out.write("\n");
      out.write("    <tr>\n");
      out.write("       <td>");
      out.print( user.getName() );
      out.write("</td>\n");
      out.write("       <td>\n");
      out.write("           ");
 if (user.getCountry().equals("Vietnam")) { 
      out.write("\n");
      out.write("                <b>");
      out.print( user.getCountry() );
      out.write("</b>\n");
      out.write("           ");
 } else { 
      out.write("\n");
      out.write("                ");
      out.print( user.getCountry() );
      out.write("\n");
      out.write("           ");
 } 
      out.write("\n");
      out.write("       </td>\n");
      out.write("       <td>");
      out.print( user.getAge() );
      out.write("</td>\n");
      out.write("    </tr>\n");
 } 
      out.write("\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}