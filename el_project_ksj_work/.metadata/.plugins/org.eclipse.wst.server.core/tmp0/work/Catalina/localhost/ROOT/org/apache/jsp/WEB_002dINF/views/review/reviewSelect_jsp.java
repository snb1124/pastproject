/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.70
 * Generated at: 2021-12-11 07:19:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.review;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.catchdog.review.vo.ReviewVO;
import java.util.List;

public final class reviewSelect_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1637208810448L));
    _jspx_dependants.put("jar:file:/C:/00.KOSMO93/30.WEB/el_project_ksj_work/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/catchDog/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.catchdog.review.vo.ReviewVO");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>REVIEW SELECT</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	div{\r\n");
      out.write("		margin: 50px 0px 0px 100px;\r\n");
      out.write("	}\r\n");
      out.write("	.mem{ text-align: center;}\r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
 request.setCharacterEncoding("UTF-8"); 
      out.write('\r');
      out.write('\n');

 	Object obj = request.getAttribute("listR");
	List<ReviewVO> list = (List)obj;
	ReviewVO rvo = null;
	if (list.size() == 1) {
		rvo = list.get(0);
	};


      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	//U\r\n");
      out.write("	 $(document).ready(function(){\r\n");
      out.write("		 \r\n");
      out.write("		 $(document).on(\"click\", \"#U\", function(){\r\n");
      out.write("			 $(\"#reviewUpdate\").attr({ \"method\":\"POST\"\r\n");
      out.write("										   ,\"action\": \"reviewUpdate.cd\"	 \r\n");
      out.write("			 }).submit();	\r\n");
      out.write("			 \r\n");
      out.write("		 });\r\n");
      out.write("	\r\n");
      out.write("			 \r\n");
      out.write("	//D\r\n");
      out.write("		 $(document).on(\"click\",\"#D\", function(){\r\n");
      out.write("			 $(\"#reviewUpdate\").attr({\"method\": \"POST\"\r\n");
      out.write("									,\"action\" : \"reviewDelete.cd\"	 \r\n");
      out.write("			 }).submit();	\r\n");
      out.write("\r\n");
      out.write("		 }); \r\n");
      out.write("	\r\n");
      out.write("	 });\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("BOARD SELECT\r\n");
      out.write("<hr>\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("<form name=\"reviewUpdate\" id=\"reviewUpdate\">\r\n");
      out.write("<table border=1>\r\n");
      out.write("<tr>\r\n");
      out.write("<td colspan=\"2\" align=\"center\">?????? ?????? ???????????? </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td align=\"center\">?????????	</td>\r\n");
      out.write("		<td><input type=\"text\" name=\"rbnum\" id=\"rbnum\" size=\"20\" value=\"");
      out.print(rvo.getRbnum() );
      out.write("\" readonly></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td align=\"center\">??????</td>\r\n");
      out.write("		<td><input type=\"text\" name=\"rbsubject\" id=\"rbsubject\" size=\"53\" value=\"");
      out.print(rvo.getRbsubject() );
      out.write("\" readonly></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td align=\"center\">?????????</td>\r\n");
      out.write("		<td><input type=\"text\" name=\"rbwriter\" id=\"rbwriter\" size=\"53\" value=\"");
      out.print(rvo.getRbwriter() );
      out.write("\" readonly></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("		<td align=\"center\">?????????</td>\r\n");
      out.write("		<td><input type=\"text\" name=\"rbinsertdate\" id=\"rbinsertdate\" size=\"53\" value=\"");
      out.print(rvo.getRbinsertdate() );
      out.write("\" readonly></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td align=\"center\">?????????</td>\r\n");
      out.write("		<td>\r\n");
      out.write("		<textarea name=\"rbcontent\" id=\"rbcontent\" cols=\"50\" rows=\"10\">\"");
      out.print(rvo.getRbcontent() );
      out.write("\"</textarea>\r\n");
      out.write("		</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td align=\"center\">??????</td>\r\n");
      out.write("		<td>\r\n");
      out.write("		<input type=\"file\" name=\"rbimage\" id=\"rbimage\" value=\"");
      out.print(rvo.getRbimage() );
      out.write("\" readonly>\r\n");
      out.write("	</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td colspan=\"2\" align=\"right\">\r\n");
      out.write("		<input type=\"button\" value=\"?????????\" id=\"rbbtn\">\r\n");
      out.write("	</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td colspan=\"2\" align=\"right\">\r\n");
      out.write("<button type=\"button\" id=\"U\">??????</button>\r\n");
      out.write("<button type=\"button\" id=\"D\">??????</button>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
