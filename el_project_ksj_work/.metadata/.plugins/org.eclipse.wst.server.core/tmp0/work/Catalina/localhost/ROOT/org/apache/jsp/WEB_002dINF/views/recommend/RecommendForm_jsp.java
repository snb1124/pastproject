/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.70
 * Generated at: 2021-12-11 09:01:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.recommend;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.catchdog.common.DogSizeUtil;
import com.catchdog.common.CatSizeUtil;

public final class RecommendForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("com.catchdog.common.DogSizeUtil");
    _jspx_imports_classes.add("com.catchdog.common.CatSizeUtil");
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

// ???
String[] dogSize = DogSizeUtil.DOG_SIZE; //?????????
String[] dogKind = DogSizeUtil.DOG_KIND; //??????

// ?????????
String[] catLength = CatSizeUtil.CAT_LEGNTH; //?????????
String[] catKind = CatSizeUtil.CAT_KIND; //??????

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>?????? ?????? ??????</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	form {\r\n");
      out.write("		margin-left: auto !important;\r\n");
      out.write("		margin-right: auto !important;\r\n");
      out.write("		width: 50%;\r\n");
      out.write("		align: center;\r\n");
      out.write("	}\r\n");
      out.write("	#imgAupkind_01, #imgAupkind_02{\r\n");
      out.write("		border: 10px solid #e8e8e8;\r\n");
      out.write("		border-radius: 15px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#imgAupkind_01 {\r\n");
      out.write("		margin-right:50px;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	$(document).ready(function(){	\r\n");
      out.write("		\r\n");
      out.write("		// ??????\r\n");
      out.write("		$(\"#acaresite1\").on('change',function(){\r\n");
      out.write("			\r\n");
      out.write("			var idx = $(this).val(); // ????????? select ?????? ??? ????????????\r\n");
      out.write("			\r\n");
      out.write("			$('#acaresite2').children('option:not(:first)').remove(); // ????????? select option??? ????????? (????????? option ??????)\r\n");
      out.write("			\r\n");
      out.write("			for(var i=0; i<cities[idx].length; i++){ // combo1??? ???????????? for??? ??????\r\n");
      out.write("				var optiondata = cities[idx][i];\r\n");
      out.write("				$('#acaresite2').append('<option value=\"'+optiondata+'\">'+optiondata+'</option>'); // option ????????????\r\n");
      out.write("			}	\r\n");
      out.write("			$(\"#acaresite\").val($(\"#acaresite1 option:checked\").text());\r\n");
      out.write("		});	\r\n");
      out.write("		$(\"#acaresite2\").on('change',function(){\r\n");
      out.write("			$(\"#acaresite\").val($(\"#acaresite1 option:checked\").text()+ \" \" +$(\"#acaresite2 option:checked\").text());			 \r\n");
      out.write("		});\r\n");
      out.write("\r\n");
      out.write("		$(\"#btn\").click(function(){\r\n");
      out.write("			\r\n");
      out.write("			// ??????\r\n");
      out.write("			var agender_check = document.getElementsByName('agender');\r\n");
      out.write("			for (var i=0; i < agender_check.length; i++){\r\n");
      out.write("				if (agender_check[i].checked == true){\r\n");
      out.write("					console.log(\"agender_check[\"+i+\"].value >>> : \" + agender_check[i].value);\r\n");
      out.write("				}\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			var agender_check = $('input:radio[name=agender]:checked').val();\r\n");
      out.write("			console.log(\"agender_check.value >>> : \" + agender_check);\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			$(\"#recommendForm\").attr({\r\n");
      out.write("				\"action\":\"recommendInsert.cd\",\r\n");
      out.write("				\"method\":\"POST\"\r\n");
      out.write("			}).submit();\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		// ???\r\n");
      out.write("		$(\"img[name=imgAupkind]\").click(function(){ // ?????? ?????? ????????? ??????\r\n");
      out.write("			var idNo = ($(this).attr(\"id\")).replace(\"imgAupkind_\",\"\"); // ?????? ??? ????????????\r\n");
      out.write("			\r\n");
      out.write("			// ?????? ?????? ????????? ???????????? ??? ????????? ????????????.\r\n");
      out.write("			$(\".long\").hide();\r\n");
      out.write("			$(\".short\").hide();\r\n");
      out.write("			$(\".big\").hide();\r\n");
      out.write("			$(\".mid\").hide();\r\n");
      out.write("			$(\".small\").hide();\r\n");
      out.write("			\r\n");
      out.write("			if(idNo == \"01\"){ // ???????????? ?????? ?????? ??????\r\n");
      out.write("				$(\"#imgAupkind_02\").css(\"border\", \"10px solid #e8e8e8\");\r\n");
      out.write("				$(\"#catsize\").hide();\r\n");
      out.write("				$(\".long\").hide();\r\n");
      out.write("				$(\".short\").hide();\r\n");
      out.write("				if($(\"#dogsize\").is(\":visible\")){\r\n");
      out.write("					$(\"#dogsize\").slideUp(\"slow\");					\r\n");
      out.write("					$(\"#imgAupkind_01\").css(\"border\", \"10px solid #e8e8e8\");\r\n");
      out.write("					$(\"#aupkind\").val(\"\");\r\n");
      out.write("					$(\"[name=asize]\").attr(\"checked\", false);\r\n");
      out.write("				} else {\r\n");
      out.write("					$(\"#dogsize\").slideDown(\"slow\");\r\n");
      out.write("					$(\"#imgAupkind_01\").css(\"border\", \"10px solid #F7AA58\");\r\n");
      out.write("					$(\"#aupkind\").val(idNo);\r\n");
      out.write("				}\r\n");
      out.write("				$(\"[name=afur]\").attr(\"checked\", false);\r\n");
      out.write("				$(\"[name=akind]\").attr(\"checked\", false);\r\n");
      out.write("			} else if (idNo == \"02\"){\r\n");
      out.write("				$(\"#imgAupkind_01\").css(\"border\", \"10px solid #e8e8e8\");\r\n");
      out.write("				$(\"#dogsize\").hide();\r\n");
      out.write("				$(\".big\").hide();\r\n");
      out.write("				$(\".mid\").hide();\r\n");
      out.write("				$(\".small\").hide();\r\n");
      out.write("				if($(\"#catsize\").is(\":visible\")){\r\n");
      out.write("					$(\"#catsize\").slideUp(\"slow\");	\r\n");
      out.write("					$(\"#imgAupkind_02\").css(\"border\", \"10px solid #e8e8e8\");\r\n");
      out.write("					$(\"#aupkind\").val(\"\");\r\n");
      out.write("					$(\"[name=afur]\").attr(\"checked\", false);\r\n");
      out.write("				}else{\r\n");
      out.write("					$(\"#catsize\").slideDown(\"slow\");\r\n");
      out.write("					$(\"#imgAupkind_02\").css(\"border\", \"10px solid #F7AA58\");\r\n");
      out.write("					$(\"#aupkind\").val(idNo);\r\n");
      out.write("				}\r\n");
      out.write("				$(\"[name=asize]\").attr(\"checked\", false);\r\n");
      out.write("				$(\"[name=akind]\").attr(\"checked\", false);\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			//alert($(\"#aupkind\").val())\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		// ??????(???)\r\n");
      out.write("		$(\"[name=asize]\").click(function(){\r\n");
      out.write("			var asize = $(this).val();\r\n");
      out.write("			if (asize == \"?????????\"){\r\n");
      out.write("				$(\".big\").show();\r\n");
      out.write("				$(\".mid\").hide();\r\n");
      out.write("				$(\".small\").hide();\r\n");
      out.write("			}else if(asize == \"?????????\"){\r\n");
      out.write("				$(\".mid\").show();\r\n");
      out.write("				$(\".big\").hide();\r\n");
      out.write("				$(\".small\").hide();\r\n");
      out.write("			}else if(asize == \"?????????\"){\r\n");
      out.write("				$(\".small\").show();\r\n");
      out.write("				$(\".big\").hide();\r\n");
      out.write("				$(\".mid\").hide();\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		// ?????????(?????????)\r\n");
      out.write("		$(\"[name=afur]\").click(function(){\r\n");
      out.write("			var afur = $(this).val();\r\n");
      out.write("			if (afur == \"??????\"){\r\n");
      out.write("				$(\".long\").show();\r\n");
      out.write("				$(\".short\").hide();\r\n");
      out.write("			}else if(afur == \"??????\"){\r\n");
      out.write("				$(\".long\").hide();\r\n");
      out.write("				$(\".short\").show();\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		/* $(document).on(\"click\", \"#S\", function(){\r\n");
      out.write("			$(\"#recommendForm\").attr({\"method\":\"POST\", \"action\":\"recommendSelect.cd\"}).submit();\r\n");
      out.write("		}); */\r\n");
      out.write("		var cities = [\r\n");
      out.write("			[\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"????????????\",\"?????????\",\"?????????\",\"????????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"????????????\",\"?????????\",\"?????????\",\"?????????\",\"??????\",\"?????????\"],\r\n");
      out.write("			[\"?????????\",\"?????????\",\"?????????\",\"??????\",\"??????\",\"?????????\",\"????????????\",\"??????\",\"?????????\",\"?????????\",\"??????\",\"?????????\",\"?????????\",\"?????????\",\"??????\",\"????????????\"],\r\n");
      out.write("			[\"??????\",\"?????????\",\"?????????\",\"??????\",\"??????\",\"??????\",\"?????????\",\"??????\"],\r\n");
      out.write("			[\"?????????\",\"?????????\",\"?????????\",\"??????\",\"????????????\",\"?????????\",\"??????\",\"?????????\",\"?????????\",\"??????\"],\r\n");
      out.write("			[\"?????????\",\"??????\",\"??????\",\"??????\",\"??????\"],																																											\r\n");
      out.write("			[\"?????????\",\"??????\",\"??????\",\"?????????\",\"??????\"],																																											\r\n");
      out.write("			[\"??????\",\"??????\",\"??????\",\"?????????\",\"??????\"],																																											\r\n");
      out.write("			[],\r\n");
      out.write("			[\"?????????\",\"????????? ?????????\",\"????????? ????????????\",\"????????? ????????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"????????????\",\"????????????\",\"?????????\",\"????????? ?????????\",\"????????? ?????????\",\"????????? ?????????\",\"????????? ?????????\",\"????????? ?????????\",\"????????? ?????????\",\"????????? ?????????\",\"?????????\",\"????????? ?????????\",\"????????? ?????????\",\"?????????\",\"????????? ?????????\",\"????????? ?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"????????? ?????????\",\"????????? ?????????\",\"????????? ?????????\",\"?????????\",\"????????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\"],\r\n");
      out.write("			[\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\"],																																										\r\n");
      out.write("			[\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"????????? ?????????\",\"????????? ?????????\",\"????????? ?????????\",\"????????? ?????????\",\"?????????\"],\r\n");
      out.write("			[\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"????????? ?????????\",\"????????? ?????????\",\"?????????\",\"?????????\",\"?????????\"],\r\n");
      out.write("			[\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"????????? ?????????\",\"????????? ?????????\",\"?????????\",\"?????????\"],\r\n");
      out.write("			[\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\"],\r\n");
      out.write("			[\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"????????? ??????\",\"????????? ??????\"],\r\n");
      out.write("			[\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"????????? ???????????????\",\"????????? ???????????????\",\"????????? ?????????\",\"????????? ?????????\",\"????????? ?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\",\"?????????\"],\r\n");
      out.write("			[\"????????????\",\"?????????\"]\r\n");
      out.write("		];\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/include/header.jsp", out, true);
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<form name=\"recommendForm\" id=\"recommendForm\" style=\"width: 700px; margin-left:auto; margin-right: auto;\">\r\n");
      out.write("		<input type=\"hidden\" name=\"mnum\" id=\"mnum\" value=\"");
      out.print( request.getAttribute("mnum") );
      out.write("\"/>\r\n");
      out.write("		<input type=\"hidden\" name=\"aupkind\" id=\"aupkind\" value=\"\" />\r\n");
      out.write("		<h1 style=\"font-size: 20px; text-align: center; color: black;\">???????????? ??????????????? ??????????????????</h1>\r\n");
      out.write("		<div style=\"margin-top: 20px;\">\r\n");
      out.write("				<img name=\"imgAupkind\" id=\"imgAupkind_01\" src=\"image/recommendimg/dog.png\" height=\"280\" width=\"300\" style=\"cursor: pointer;\"/>\r\n");
      out.write("				<img name=\"imgAupkind\" id=\"imgAupkind_02\" src=\"image/recommendimg/cat.png\" height=\"280\" width=\"300\"  style=\"cursor: pointer;\"/>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		<div id=\"dogsize\" style=\"display:none;\">\r\n");
      out.write("			<div class=\"asize\" style=\"margin-top: 15px; text-align: center;\">\r\n");
      out.write("				<label>\r\n");
      out.write("					<input type=\"radio\" name=\"asize\" value=\"?????????\">\r\n");
      out.write("					<div class=\"label\">?????????</div>\r\n");
      out.write("				</label>\r\n");
      out.write("				<label>\r\n");
      out.write("					<input type=\"radio\" name=\"asize\" value=\"?????????\">\r\n");
      out.write("					<div class=\"label\">?????????</div>\r\n");
      out.write("				</label>\r\n");
      out.write("				<label>\r\n");
      out.write("					<input type=\"radio\" name=\"asize\" value=\"?????????\">\r\n");
      out.write("					<div class=\"label\">?????????</div>\r\n");
      out.write("				</label>					\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"akind\" style=\"margin-top: 15px; text-align: center;\">\r\n");
      out.write("			");

			for(int i=0; i<dogSize.length; i++){
				if (dogSize[i] == "??????") {
					
      out.write("\r\n");
      out.write("					<label class=\"big\" style=\"display: none;\">\r\n");
      out.write("						<input type=\"radio\" name=\"akind\" value=\"");
      out.print(dogKind[i] );
      out.write("\">\r\n");
      out.write("						<div class=\"label\">");
      out.print(dogKind[i] );
      out.write("</div>\r\n");
      out.write("					</label>\r\n");
      out.write("					");

				} else if (dogSize[i] == "??????") {
					
      out.write("\r\n");
      out.write("					<label class=\"mid\" style=\"display: none;\">\r\n");
      out.write("						<input type=\"radio\" name=\"akind\" value=\"");
      out.print(dogKind[i] );
      out.write("\">\r\n");
      out.write("						<div class=\"label\">");
      out.print(dogKind[i] );
      out.write("</div>\r\n");
      out.write("					</label>\r\n");
      out.write("					");

				} else if (dogSize[i] == "??????") {
					
      out.write("\r\n");
      out.write("					<label class=\"small\" style=\"display: none;\">\r\n");
      out.write("						<input type=\"radio\" name=\"akind\" value=\"");
      out.print(dogKind[i] );
      out.write("\">\r\n");
      out.write("						<div class=\"label\">");
      out.print(dogKind[i] );
      out.write("</div>\r\n");
      out.write("					</label>\r\n");
      out.write("					");

				}
			}
			
      out.write("\r\n");
      out.write("			</div>				\r\n");
      out.write("		</div>\r\n");
      out.write("		<div id=\"catsize\" style=\"display:none;\">\r\n");
      out.write("					<div class=\"afur\" style=\"margin-top: 15px; text-align: center;\">\r\n");
      out.write("						<label>\r\n");
      out.write("							<input type=\"radio\" name=\"afur\" value=\"??????\"/>\r\n");
      out.write("							<div class=\"label\">??????</div>\r\n");
      out.write("						</label>\r\n");
      out.write("						<label>\r\n");
      out.write("							<input type=\"radio\" name=\"afur\" value=\"??????\" />\r\n");
      out.write("							<div class=\"label\">??????</div>\r\n");
      out.write("						</label>			\r\n");
      out.write("					<div class=\"akind\" style=\"margin-top: 15px; text-align: center;\">\r\n");
      out.write("						");

							for (int i=0; i < catLength.length; i++){
								if (catLength[i] == "??????"){
						
      out.write("\r\n");
      out.write("						<label class=\"long\" style=\"display:none;\">\r\n");
      out.write("							<input type=\"radio\" name=\"akind\" value=\"");
      out.print( catKind[i] );
      out.write("\">\r\n");
      out.write("							<div class=\"label\">");
      out.print( catKind[i] );
      out.write("</div>\r\n");
      out.write("						</label>\r\n");
      out.write("						");

								}else if(catLength[i] == "??????"){
						
      out.write("\r\n");
      out.write("						<label class=\"short\" style=\"display:none;\">\r\n");
      out.write("							<input type=\"radio\" name=\"akind\" value=\"");
      out.print( catKind[i] );
      out.write("\">\r\n");
      out.write("							<div class=\"label\">");
      out.print( catKind[i] );
      out.write("</div>\r\n");
      out.write("						</label>\r\n");
      out.write("						");

								}
							}
						
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div>\r\n");
      out.write("			<table style=\"width: 100%; margin: 20px 0; border-top: 1px solid #cccccc;\">\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>??????</td>\r\n");
      out.write("					<td>\r\n");
      out.write("						<input type=\"radio\" name=\"agender\" value=\"??????\" checked /> ??????\r\n");
      out.write("						<input type=\"radio\" name=\"agender\" value=\"??????\" /> ??????\r\n");
      out.write("					</td>		\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>??????</td>\r\n");
      out.write("					<td>\r\n");
      out.write("						<input type=\"hidden\" name=\"acaresite\" id=\"acaresite\" />\r\n");
      out.write("						<select name=\"acaresite1\" id=\"acaresite1\">\r\n");
      out.write("							<option>???/??? ??????</option>\r\n");
      out.write("							<option value=\"0\" title=\"???????????????\">???????????????</option>\r\n");
      out.write("							<option value=\"1\" title=\"???????????????\">???????????????</option>\r\n");
      out.write("							<option value=\"2\" title=\"???????????????\">???????????????</option>\r\n");
      out.write("							<option value=\"3\" title=\"???????????????\">???????????????</option>\r\n");
      out.write("							<option value=\"4\" title=\"???????????????\">???????????????</option>\r\n");
      out.write("							<option value=\"5\" title=\"???????????????\">???????????????</option>\r\n");
      out.write("							<option value=\"6\" title=\"???????????????\">???????????????</option>\r\n");
      out.write("							<option value=\"7\" title=\"?????????????????????\">?????????????????????</option>\r\n");
      out.write("							<option value=\"8\" title=\"?????????\">?????????</option>\r\n");
      out.write("							<option value=\"9\" title=\"?????????\">?????????</option>\r\n");
      out.write("							<option value=\"10\" title=\"????????????\">????????????</option>\r\n");
      out.write("							<option value=\"11\" title=\"????????????\">????????????</option>\r\n");
      out.write("							<option value=\"12\" title=\"????????????\">????????????</option>\r\n");
      out.write("							<option value=\"13\" title=\"????????????\">????????????</option>\r\n");
      out.write("							<option value=\"14\" title=\"????????????\">????????????</option>\r\n");
      out.write("							<option value=\"15\" title=\"????????????\">????????????</option>\r\n");
      out.write("							<option value=\"16\" title=\"?????????????????????\">?????????????????????</option>\r\n");
      out.write("						</select>\r\n");
      out.write("						<select name=\"acaresite2\" id=\"acaresite2\">\r\n");
      out.write("							<option value=\"??????\">???/???/??? ??????</option>\r\n");
      out.write("						</select>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div style=\"text-align:center; margin-bottom: 20px;\">\r\n");
      out.write("			<button type=\"button\" id=\"btn\">????????????</button>\r\n");
      out.write("			<button type=\"reset\">??????</button>\r\n");
      out.write("			<!-- <button type=\"button\" id=\"S\">???????????????</button> -->\r\n");
      out.write("		</div>\r\n");
      out.write("</form>\r\n");
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
