/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.70
 * Generated at: 2021-10-22 06:31:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.lesson;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lesson_005fpop_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/00.KOSMO93/30.WEB/el_springdblink_work/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/springDBLink/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1634795120424L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>과목 테이블 팝업</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".required{color:red;}\r\n");
      out.write("table{width:450px;}\r\n");
      out.write("table th{width:120px; text-align:left;}\r\n");
      out.write("input[type=\"text\"]{width:330px;}\r\n");
      out.write("</style> \r\n");
      out.write("	<script  src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("	$(document).ready(function(){\r\n");
      out.write("	\r\n");
      out.write("	var mode = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("		if(mode == \"insert\") {\r\n");
      out.write("			$('#insertData').attr('disabled',false);\r\n");
      out.write("			$('#updateData').attr('disabled',true);\r\n");
      out.write("			$('#deleteData').attr('disabled',true);\r\n");
      out.write("		} else if(mode == \"update\") {\r\n");
      out.write("			$('#insertData').attr('disabled',true);\r\n");
      out.write("			$('#updateData').attr('disabled',false);\r\n");
      out.write("		$('#deleteData').attr('disabled',false);\r\n");
      out.write("		}\r\n");
      out.write("		$(\"#insertData\").click(function(){\r\n");
      out.write("		 	if(!validateForm()) return;\r\n");
      out.write("		 	if($(\"#no\").val()==\"\") $(\"#no\").val(0);\r\n");
      out.write("		 	if(confirm('등록을 진행할까요?')) {\r\n");
      out.write("		 		$(\"#lessonForm\").attr(\"action\", \"/lesson/insertLesson.ksj\");\r\n");
      out.write("				 $(\"#lessonForm\").submit();\r\n");
      out.write("		 }\r\n");
      out.write("});\r\n");
      out.write("	$(\"#updateData\").click(function(){\r\n");
      out.write("		 if(!validateForm()) return;\r\n");
      out.write("		 if(confirm('수정을 진행할까요?')) {\r\n");
      out.write("		 $(\"#lessonForm\").attr(\"action\", \"/lesson/updateLesson.ksj\");\r\n");
      out.write("		 $(\"#lessonForm\").submit();\r\n");
      out.write("		 }\r\n");
      out.write("		});\r\n");
      out.write("	$(\"#deleteData\").click(function(){\r\n");
      out.write("		 if(confirm('삭제를 진행할까요?')) {\r\n");
      out.write("		 $(\"#lessonForm\").attr(\"action\", \"/lesson/deleteLesson.do\");\r\n");
      out.write("		 $(\"#lessonForm\").submit();\r\n");
      out.write("		 }\r\n");
      out.write("		});\r\n");
      out.write("	$(\"#closeWindow\").click(function(){\r\n");
      out.write("		window.close();\r\n");
      out.write("		});\r\n");
      out.write("\r\n");
      out.write("		});\r\n");
      out.write("function validateForm() {\r\n");
      out.write("		 if($(\"#lnum\").val().replace(/\\s/g,\"\") == \"\") {\r\n");
      out.write("		 alert('과목코드를 입력해주세요.');\r\n");
      out.write("		 return false;\r\n");
      out.write("		 }\r\n");
      out.write("		 if($(\"#lname\").val().replace(/\\s/g,\"\") == \"\") {\r\n");
      out.write("		 alert('과목명을 입력해주세요.');\r\n");
      out.write("		 return false;\r\n");
      out.write("		 }\r\n");
      out.write("		 return true;\r\n");
      out.write("		}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<p></p>\r\n");
      out.write("	<div>\r\n");
      out.write("	<form id=\"lessonForm\" name=\"lessonForm\" method=\"post\">\r\n");
      out.write("		<input type=\"hidden\" id=\"no\" name=\"no\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lessonVO.no}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("			<table border=\"1\">\r\n");
      out.write("			<thead>\r\n");
      out.write("				<tr>\r\n");
      out.write(" 				<td colspan=\"2\" align=\"center\">\r\n");
      out.write("		<h4>과목 테이블 팝업창 [Spring] </h4></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</thead>\r\n");
      out.write("			<tbody>\r\n");
      out.write("				<tr>\r\n");
      out.write(" 				<th><span class=\"required\">*</span>과목코드</th>\r\n");
      out.write(" 				<td><input type=\"text\" id=\"lnum\" \r\n");
      out.write("							name=\"lnum\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lessonVO.lnum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" /></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write(" 			<th><span class=\"required\">*</span>과목명</th>\r\n");
      out.write(" 			<td><input type=\"text\" id=\"lname\" \r\n");
      out.write("						name=\"lname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lessonVO.lname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" /></td>\r\n");
      out.write("				</tr> \r\n");
      out.write("			</tbody>\r\n");
      out.write("			</table>\r\n");
      out.write("		</form>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div>\r\n");
      out.write("	<p></p>\r\n");
      out.write("			<table border=\"0\">\r\n");
      out.write("				<tr align=\"center\">\r\n");
      out.write("				 <td>\r\n");
      out.write("					<input type=\"button\" id=\"insertData\" value=\"등록\" /></td>\r\n");
      out.write(" 				<td>\r\n");
      out.write("					<input type=\"button\" id=\"updateData\" value=\"수정\" /></td>\r\n");
      out.write(" 				<td>\r\n");
      out.write(" 					<input type=\"button\" id=\"deleteData\" value=\"삭제\" /></td>\r\n");
      out.write(" 				<td>\r\n");
      out.write(" 					<input type=\"button\" id=\"closeWindow\" value=\"닫기\" /></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("			</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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