/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.70
 * Generated at: 2021-12-12 15:23:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MemForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("		<meta charset=\"UTF-8\">\r\n");
      out.write("		<title>????????????</title>\r\n");
      out.write("		<style type=\"text/css\">\r\n");
      out.write("			h3 { align: center; }\r\n");
      out.write("			table { align: center;}\r\n");
      out.write("			input[type=\"button\"] {\r\n");
      out.write("				padding: 5px !important;\r\n");
      out.write("			}\r\n");
      out.write("		</style>\r\n");
      out.write("		<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("		<script src=\"http://dmaps.daum.net/map_js_init/postcode.v2.js\"></script>\r\n");
      out.write("		<script type=\"text/javascript\">\r\n");
      out.write("			$(document).ready(function(){\r\n");
      out.write("				//????????? ?????? ?????? ?????? =========================\r\n");
      out.write("				$(\"#midbtn\").click(function(){\r\n");
      out.write("					console.log(\"idCheck >> : \");\r\n");
      out.write("					\r\n");
      out.write("					let midVal = $(\"#mid\").val();\r\n");
      out.write("					if(midVal == ''){\r\n");
      out.write("						alert(\"??????????????? ???????????? ???????????????\");\r\n");
      out.write("\r\n");
      out.write("						$(\"#mid\").focus();\r\n");
      out.write("						return false;\r\n");
      out.write("					}\r\n");
      out.write("//					alert(\"???????????? >>> : \");\r\n");
      out.write("					syncIdCheckData();\r\n");
      out.write("				});\r\n");
      out.write("				\r\n");
      out.write("				async function syncIdCheckData(){\r\n");
      out.write("					let idCheckData = '';\r\n");
      out.write("					console.log(\"start >>> :\");\r\n");
      out.write("					var vv = $(\"#mid\").val();\r\n");
      out.write("//					alert(\"vv >>> : \" + vv);\r\n");
      out.write("					idCheckData = await ajaxIdCheckData(vv);\r\n");
      out.write("//					alert(\"????????? ????????? >>> : \" + idCheckData);\r\n");
      out.write("					\r\n");
      out.write("//					alert(\"idCheck data >>> : \" + idCheckData);\r\n");
      out.write("					if(\"ID_YES\" == idCheckData){\r\n");
      out.write("						alert(\"?????? ????????? ??????????????????.\");\r\n");
      out.write("						$(\"#mid\").attr(\"readonly\", true);\r\n");
      out.write("						$(\"#mid\").css(\"background-color\", \"#F2F2F2\");\r\n");
      out.write("						$(\"#mpw\").focus();\r\n");
      out.write("					}\r\n");
      out.write("					else if(\"ID_NO\" == idCheckData){\r\n");
      out.write("						alert(\"????????? ??? ?????? ??????????????????.\");\r\n");
      out.write("						$(\"#mid\").val();\r\n");
      out.write("						$(\"#mid\").focus();\r\n");
      out.write("					}\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				function ajaxIdCheckData(myval){\r\n");
      out.write("//					alert(\"myval >>> : \" + myval);\r\n");
      out.write("					\r\n");
      out.write("					let idCheckURL = \"memIdCheck.cd\";\r\n");
      out.write("					let method = \"POST\";\r\n");
      out.write("					let dataParam = { mid: myval };\r\n");
      out.write("					\r\n");
      out.write("					return $.ajax({\r\n");
      out.write("						url: idCheckURL,\r\n");
      out.write("						type: method,\r\n");
      out.write("						data: dataParam\r\n");
      out.write("					});\r\n");
      out.write("				}\r\n");
      out.write("				//????????? ???????????? ??? ================================\r\n");
      out.write("					\r\n");
      out.write("				\r\n");
      out.write("				//???????????? ?????? \r\n");
      out.write("				$(\"#pwCheck\").click(function(){\r\n");
      out.write("					console.log(\"pwCheck ?????? ?????? \");\r\n");
      out.write("					var pw = $(\"#mpw\").val();\r\n");
      out.write("					var pw_r = $(\"#mpw_r\").val();\r\n");
      out.write("					console.log(\"mpw >>> : \" + pw);\r\n");
      out.write("					console.log(\"mpw_r >>> : \" + pw_r);\r\n");
      out.write("					if(pw == pw_r){\r\n");
      out.write("						alert(\"??????????????? ????????????\");\r\n");
      out.write("						$(\"#mgender\").focus();\r\n");
      out.write("						return true;\r\n");
      out.write("					} else {\r\n");
      out.write("						alert(\"??????????????? ????????????\");\r\n");
      out.write("						$(\"#mpw\").val();\r\n");
      out.write("						$(\"#mpw_r\").val();\r\n");
      out.write("						$(\"#mpw\").focus();\r\n");
      out.write("						return false;\r\n");
      out.write("					}\r\n");
      out.write("				});\r\n");
      out.write("				\r\n");
      out.write("				//????????????\r\n");
      out.write("				$(\"#mbirth\").append(\"<option value=''>???--- </option>\");\r\n");
      out.write("				var date = new Date();\r\n");
      out.write("				var year = date.getFullYear();\r\n");
      out.write("		        for(var i = 1901; i <= year; i++){\r\n");
      out.write("		            $(\"#mbirth\").append(\"<option value='\"+ i +\"'>\"+ i + \"</option>\");\r\n");
      out.write("		        }\r\n");
      out.write("				//???\r\n");
      out.write("				$(\"#mbirth1\").append(\"<option value=''>???--- </option>\");\r\n");
      out.write("		        for(var i = 1; i <= 12; i++){\r\n");
      out.write("		        	if (i < 10){ i = '0'+i;}\r\n");
      out.write("		            $(\"#mbirth1\").append(\"<option value='\"+ i +\"'>\"+ i + \"</option>\");\r\n");
      out.write("		        }\r\n");
      out.write("		        //???\r\n");
      out.write("		        $(\"#mbirth2\").append(\"<option value=''>??? ---</option>\");\r\n");
      out.write("		        for(var i = 1; i <= 31; i++){\r\n");
      out.write("		        	if (i < 10){ i = '0'+i;}\r\n");
      out.write("		            $(\"#mbirth2\").append(\"<option value='\"+ i +\"'>\"+ i + \"</option>\");\r\n");
      out.write("		        }\r\n");
      out.write("		        //?????????\r\n");
      out.write("		        $('#memail2').change(function(){	\r\n");
      out.write("		    		$(\"#memail2 option:selected\").each(function () {\r\n");
      out.write("		    			if($(this).val()== '1'){ //??????????????? ?????? \r\n");
      out.write("		    					var aa = $(\"#memail1\").val();\r\n");
      out.write("		    					$(\"#memail1\").val(''); \r\n");
      out.write("		    					$(\"#memail1\").attr(\"readonly\",false); 				\r\n");
      out.write("		    			}else{ //??????????????? ???????????? \r\n");
      out.write("		    					$(\"#memail1\").val($(this).text()); \r\n");
      out.write("		    					$(\"#memail1\").attr(\"readonly\",true); \r\n");
      out.write("	    				}\r\n");
      out.write("		    		}); \r\n");
      out.write("	    		}); 	\r\n");
      out.write("		        //????????????\r\n");
      out.write("		        $(\"#zonecode\").click(function(){\r\n");
      out.write("					console.log(\"zonecode >>> : \");\r\n");
      out.write("					new daum.Postcode({\r\n");
      out.write("						oncomplete: function(data) {\r\n");
      out.write("						    $(\"#mzonecode\").val(data.zonecode); //5?????? ??????????????? ??????\r\n");
      out.write("						    $(\"#mroadaddress\").val(data.roadAddress); //????????? ??????\r\n");
      out.write("						    $(\"#mjibunaddress\").val(data.jibunAddress); //????????????			\r\n");
      out.write("						}\r\n");
      out.write("					}).open();\r\n");
      out.write("				});\r\n");
      out.write("		        //????????? ????????? JSP ?????????\r\n");
      out.write("		        $(\"#btn\").click(function(){\r\n");
      out.write("		        	console.log(\"btn click() ?????? ?????? >>> : \");\r\n");
      out.write("\r\n");
      out.write("		        	console.log(\"mnum >>> : \" + document.memForm.mnum.value);			\r\n");
      out.write("					console.log(\"mname >>> : \" + document.memForm.mname.value);\r\n");
      out.write("					console.log(\"mid >>> : \" + document.memForm.mid.value);\r\n");
      out.write("					console.log(\"mpw >>> : \" + document.memForm.mpw.value);\r\n");
      out.write("					console.log(\"mpw_r >>> : \" + document.memForm.mpw_r.value);\r\n");
      out.write("		        	$(\"#memForm\").attr({\r\n");
      out.write("		        		\"action\":\"memInsert.cd\",\r\n");
      out.write("		        		\"method\":\"POST\",\r\n");
      out.write("		        		\"enctype\":\"multipart/form-data\"				\r\n");
      out.write("		        	}).submit();\r\n");
      out.write("		        });\r\n");
      out.write("			});\r\n");
      out.write("		</script>\r\n");
      out.write("	</head>\r\n");
      out.write("	<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/include/header.jsp", out, true);
      out.write("\r\n");
      out.write("	\r\n");
      out.write("		<hr>\r\n");
      out.write("		<form name=\"memForm\" id=\"memForm\">\r\n");
      out.write("			<input type=\"hidden\" name=\"mnum\" id=\"mnum\" readonly>		\r\n");
      out.write("			<table style=\"width:50%;\">	\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td colspan=\"2\" align=\"center\">\r\n");
      out.write("						<font size=\"4\" color=\"black\">????????????</font>					\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>				\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th>??????</th>\r\n");
      out.write("					<td><input type=\"text\" name=\"mname\" id=\"mname\"></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th>?????????</th>\r\n");
      out.write("					<td><input type=\"text\" name=\"mid\" id=\"mid\">\r\n");
      out.write("					<input type=\"button\" name=\"midbtn\" id=\"midbtn\" value=\"????????????\"></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th>????????????</th>\r\n");
      out.write("					<td style=\"line-height:36px;\"><input type=\"password\" name=\"mpw\" id=\"mpw\"><br>\r\n");
      out.write("					<input type=\"password\" name=\"mpw_r\" id=\"mpw_r\">\r\n");
      out.write("					<input type=\"button\" id=\"pwCheck\" value=\"??????????????????\"></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th>??????</th>\r\n");
      out.write("					<td><input type=\"radio\" name=\"mgender\" id=\"mgender\" value=\"01\" checked> ?????? \r\n");
      out.write("					<input type=\"radio\" name=\"mgender\" id=\"mgender\" value=\"02\"> ?????? </td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th>????????????</th>\r\n");
      out.write("					<td>					\r\n");
      out.write("					<select name=\"mbirth\" id=\"mbirth\"></select>\r\n");
      out.write("					<select name=\"mbirth1\" id=\"mbirth1\"></select>\r\n");
      out.write("					<select name=\"mbirth2\" id=\"mbirth2\"></select></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th>?????????</th>\r\n");
      out.write("					<td><select name=\"mhp\" id=\"mhp\">\r\n");
      out.write("						<option value=\"010\">010</option>\r\n");
      out.write("						<option value=\"011\">011</option>\r\n");
      out.write("						<option value=\"016\">016</option>\r\n");
      out.write("						<option value=\"017\">017</option>\r\n");
      out.write("					</select>\r\n");
      out.write("					<input type=\"text\" name=\"mhp1\" id=\"mhp1\" size=\"2\" maxlength=\"4\">\r\n");
      out.write("					<input type=\"text\" name=\"mhp2\" id=\"mhp2\" size=\"2\" maxlength=\"4\"></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th>?????????</th>\r\n");
      out.write("					<td><input type=\"text\" name=\"memail\" id=\"memail\" style=\"width: 100px;\">@\r\n");
      out.write("					<input type=\"text\" name=\"memail1\" id=\"memail1\" style=\"width: 100px;\" placeholder=\"????????????\">\r\n");
      out.write("					<select name=\"memail2\" id=\"memail2\">\r\n");
      out.write("						<option value=\"1\" selected>????????????</option>\r\n");
      out.write("						<option value=\"naver.com\" selected>naver.com</option>\r\n");
      out.write("						<option value=\"gmail.com\" selected>gmail.com</option>\r\n");
      out.write("						<option value=\"daum.net\" selected>daum.net</option>\r\n");
      out.write("					</select></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th>??????</th>\r\n");
      out.write("					<td style=\"line-height:36px;\">\r\n");
      out.write("						<input type=\"text\" name=\"mzonecode\" id=\"mzonecode\" placeholder=\"????????????\" style=\"width:63px;\" maxlength=\"6\" readonly/>\r\n");
      out.write("						<input type=\"button\" name=\"zonecode\" id=\"zonecode\" value=\"??????????????????\"><br>\r\n");
      out.write("						<input type=\"text\" name=\"mroadaddress\" id=\"mroadaddress\" placeholder=\"???????????????\" style=\"width: 250px;\"><br>\r\n");
      out.write("						<input type=\"text\" name=\"mroadaddressdetail\" id=\"mroadaddressdetail\" placeholder=\"??????????????? ????????????\" style=\"width:250px\"><br>	 	\r\n");
      out.write(" 						<input type=\"text\" name=\"mjibunaddress\" id=\"mjibunaddress\" placeholder=\"????????????\" style=\"width:250px\">\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("		\r\n");
      out.write("				<tr style=\"border-bottom:none;\">\r\n");
      out.write("					<td colspan=\"2\" align=\"center\">\r\n");
      out.write("						<button type=\"button\" id=\"btn\" style=\"cursor:pointer;\">????????????</button>\r\n");
      out.write("						<button type=\"reset\" style=\"cursor:pointer;\">??????</button>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("		</form>\r\n");
      out.write("	</body>\r\n");
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
