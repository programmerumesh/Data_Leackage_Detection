package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import databaseconnection.*;

public final class distributorhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Distributor Home Page</title>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Your website name | Homepage</title>\r\n");
      out.write("\r\n");
      out.write("<!-- This template was created by Mantis-a [http://www.mantisa.cz/]. For more templates visit Free website templates [http://www.mantisatemplates.com/]. -->\r\n");
      out.write("\r\n");
      out.write("<meta name=\"Description\" content=\"...\" />\r\n");
      out.write("<meta name=\"Keywords\" content=\"...\" />\r\n");
      out.write("<meta name=\"robots\" content=\"all,follow\" />\r\n");
      out.write("<meta name=\"author\" content=\"...\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Javascript -->\r\n");
      out.write("<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\" />\r\n");
      out.write("\r\n");
      out.write("<!-- CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"screen, projection, tv\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style-print.css\" type=\"text/css\" media=\"print\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Favicon -->\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"favicon.ico\" type=\"image/x-icon\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"form\" action=\"\" method=\"post\" >\r\n");
      out.write("\r\n");
      out.write("\r\n");


 Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	String sql="select max(id) from register ";
	try
	{
		con=databasecon.getconnection();
		st=con.createStatement();
		rs=st.executeQuery(sql);
		//session.setAttribute( "id", n );
		

	
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <div id=\"wrapper\"> \r\n");
      out.write("    <!-- Header -->\r\n");
      out.write("    <div id=\"header\"> \r\n");
      out.write("      <!-- Your website name  -->\r\n");
      out.write("      <h1><font color=\"#FFFFFF\"> \r\n");
      out.write("        <marquee direction=\"right\">\r\n");
      out.write("        DATA LEAKAGE DETECTION \r\n");
      out.write("        </marquee>\r\n");
      out.write("        </font></h1>\r\n");
      out.write("      <!-- Your website name end -->\r\n");
      out.write("      <!-- Your slogan -->\r\n");
      out.write("      <h2></h2>\r\n");
      out.write("      <!-- Your slogan end -->\r\n");
      out.write("      <div id=\"header-arrow\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Header end -->\r\n");
      out.write("    <!-- Menu -->\r\n");
      out.write("    <a href=\"#skip-menu\" class=\"hidden\">Skip menu</a> \r\n");
      out.write("    <ul id=\"menu\" class=\"cleaning-box\">\r\n");
      out.write("      <li class=\"first\"><a href=\"distributorhome.jsp\" class=\"active\">HOME</a></li>\r\n");
      out.write("      <li><a href=\"distributorsend.jsp\">Send Files</a></li>\r\n");
      out.write("      <li><a href=\"distributorviewfiles .jsp\">View Files</a></li>\r\n");
      out.write("      <li><a href=\"distributorleakfiles.jsp\">Leak Files</a></li>\r\n");
      out.write("      <li><a href=\"index.html\">LogOut</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <!-- Menu end -->\r\n");
      out.write("    <hr class=\"noscreen\" />\r\n");
      out.write("    <div id=\"content-box\"> \r\n");
      out.write("      <div id=\"content-box-in\"> \r\n");
      out.write("        <!-- Content left -->\r\n");
      out.write("        <div class=\"content-box-left\"> \r\n");
      out.write("          <div class=\"content-box-left-in\"> \r\n");
      out.write("            <h1>DISTRIBUTOR</h1>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Content left end -->\r\n");
      out.write("        <hr class=\"noscreen\" />\r\n");
      out.write("        <!-- Content right -->\r\n");
      out.write("        <div class=\"content-box-right\"> \r\n");
      out.write("          <h4>Welcome \r\n");
      out.write("           Distributor\r\n");
      out.write("            !</h4>\r\n");
      out.write("          <div class=\"content-box-right-in\"> \r\n");
      out.write("            <dl>\r\n");
      out.write("              <dt><br />\r\n");
      out.write("                <a href=\"#\"><img src=\"img/dr.jpg\" width=\"120\" height=\"90\" \" /></a> \r\n");
      out.write("              </dt>\r\n");
      out.write("            </dl>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"content-box-right-in\"></div>\r\n");
      out.write("          <div id=\"column-right-bottom\">&nbsp;</div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Content right end -->\r\n");
      out.write("        <div class=\"cleaner\">&nbsp;</div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <hr class=\"noscreen\" />\r\n");
      out.write("    <!-- Footer -->\r\n");
      out.write("    <!-- Footer end -->\r\n");
      out.write("  </div>\r\n");

}
catch(Exception e)
	{
		System.out.println(e);
	}
	  finally
	{
		con.close();
		st.close();
	}
 
  
      out.write("\r\n");
      out.write("  </form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
