/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-07-13 17:34:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.owner;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.saraya.models.Owner;
import com.saraya.models.Pet;

public final class show_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/view/owner/./../header.jsp", Long.valueOf(1657730850102L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>list of owners</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./../../bootstrap-4.0.0-dist/css/bootstrap.css\">\r\n");
      out.write("    <script src=\"bootstrap-4.0.0-dist/js/bootstrap.bundle.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\" ></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\" ></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("  <a class=\"navbar-brand\" href=\"#\">Navbar</a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("      <li class=\"nav-item active\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"/owners/list\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"/vits/list\">Vits and Specialies</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item dropdown\">\r\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("          Owners\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"/owners/add\">Add</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"/owners/list\">list</a>\r\n");
      out.write("          <div class=\"dropdown-divider\"></div>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"/owners/search\">search</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link disabled\"  href=\"/logout\">logout</a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <form class=\"form-inline my-2 my-lg-0\" method=\"get\" action=\"/owners/search2\">\r\n");
      out.write("      <input class=\"form-control mr-sm-2\" name=\"lastname\" type=\"search\" placeholder=\"Search owner by lastname\" aria-label=\"Search\">\r\n");
      out.write("      <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("            <h2>Owner Information</h2>\r\n");
      out.write("\r\n");
      out.write("            <table class=\"table table-striped\">\r\n");
      out.write("\r\n");
      out.write("                <tbody>\r\n");
      out.write("                ");
  Owner owner = (Owner)  request.getAttribute("owner");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>name</td>\r\n");
      out.write("                    <td> ");
      out.print( owner.getLastname() );
      out.write(' ');
      out.print( owner.getFirstname() );
      out.write(" </td>\r\n");
      out.write("\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Address</td>\r\n");
      out.write("                    <td>");
      out.print( owner.getAddress());
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>City</td>\r\n");
      out.write("                    <td>");
      out.print( owner.getCity() );
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Télephone</td>\r\n");
      out.write("                    <td>");
      out.print( owner.getTelephone() );
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("            <a href=\"/owners/");
      out.print( owner.getId() );
      out.write("/update\" ><button type=\"button\" class=\"btn btn-success\">Edite Owner</button> </a>\r\n");
      out.write("            <a href=\"/pets/");
      out.print( owner.getId() );
      out.write("/add\" ><button type=\"button\" class=\"btn btn-primary\">Add new Pet</button> </a>\r\n");
      out.write("            <h2>Pets and Visits </h2>\r\n");
      out.write("        <hr>\r\n");
      out.write("\r\n");
      out.write("            <table class=\"table table-striped\">\r\n");
      out.write("\r\n");
      out.write("                <tbody>\r\n");
      out.write("                ");
 if(owner.getPets()!=null){
                    for(Pet pet:owner.getPets()){
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>name</td>\r\n");
      out.write("                    <td> ");
      out.print( pet.getName() );
      out.write(" </td>\r\n");
      out.write("                    <td> Visit date  Decription </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>date Of Birth</td>\r\n");
      out.write("                    <td> ");
      out.print( pet.getDateOfBirth() );
      out.write(" </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <a href=\"/pets/");
      out.print( pet.getId() );
      out.write("/update\" ><button type=\"button\" class=\"btn btn-success\">Edit pet</button> </a>\r\n");
      out.write("                        <a href=\"/visits/");
      out.print( pet.getId() );
      out.write("/add\" ><button type=\"button\" class=\"btn btn-danger\">add visit</button> </a>\r\n");
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Type</td>\r\n");
      out.write("                    <td> ");
      out.print( pet.getPetType() );
      out.write(" </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <hr>\r\n");
      out.write("                ");
}}
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
