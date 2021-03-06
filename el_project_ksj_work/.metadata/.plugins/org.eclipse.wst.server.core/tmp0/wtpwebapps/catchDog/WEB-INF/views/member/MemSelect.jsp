<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.catchdog.member.vo.MemberVO" %>
<%@ page import="com.catchdog.common.CodeUtil" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.catchdog.common.K_Session" %>
<%@ page import="java.util.Map" %>
<%
	K_Session ks = K_Session.getInstance();
	Map<String,Object> ssMap = ks.getSession(request);
	if(ssMap.get("ssMid") != null){
		ssMap.get("ssMname");
	}
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원조회</title>
		<style type="text/css">
				* { margin: 0 auto;}
				div { margin: 50px 0px 0px 100px; }
				td, th { padding: 5px; }
				.tt { text-align: center;}
		</style>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
		<script type="text/javascript">
				$(document).ready(function(){
					$("#memail2").change(function(){
						$("#memail2 option:selected").each(function(){
							if($(this).val()=='1'){
								//직접입력일 경우
								var aa = $("#memail").val();
								$("#memail1").val('');
								$("#memail1").attr("readonly", false);
							}else{
								//직접 입력이 아닐경우
								$("#memail1").val('');
								$("#memail1").attr("readonly", true);
							}
						});
					});
					
					$("#zonecode").click(function(){
						console.log("zonecode >>> : ");
						new daum.Postcode({
							oncomplete: function(data){
								$("#mzonecode").val(data.zonecode);
								$("#mroadaddress").val(data.roadAddress);
								$("#mjibunaddress").val(data.jibunAddress);
							}
						}).open();
					});
				});
				
				$(document).on("click", "#U", function(){
					$("#memUpdateForm").attr({"method":"POST", "action":"memUpdate.cd"}).submit();
				});
				$(document).on("click", "#D", function(){
					$("#memUpdateForm").attr({"method":"POST", "action":"memDelete.cd"}).submit();
				});
				$(document).on("click", "#I", function(){
					location.href="memForm.cd";
				});
				$(document).on("click", "#SALL", function(){
					$("#memUpdateForm").attr({"method":"GET", "action":"memSelectAll.cd"}).submit();
				});
		</script>
	</head>
	<body onload="compCheck()">
	<jsp:include page="/include/header.jsp" flush="true"></jsp:include>
			<% request.setCharacterEncoding("UTF-8"); %>
			
			<%
				Object obj = request.getAttribute("listS");
				if(obj==null) return;
				
				ArrayList<MemberVO> aList = (ArrayList<MemberVO>)obj;
				int nCnt = aList.size();
				//out.println("조회 건수 >>> : " + nCnt);
				
				String mgender = "";
				String mbirth = "";
				String mhp = "";
				String memail = "";
				String mzonecode = "";
				String mroadaddress = "";
				String mroadaddressdetail = "";
				String mjibunaddress = "";
				
				MemberVO mvo = null;
				
				if(nCnt == 1){
					mvo = aList.get(0);
					
					mgender = mvo.getMgender();
					mbirth = CodeUtil.birth(mvo.getMbirth());
					mhp = CodeUtil.hp(mvo.getMhp());
					memail = mvo.getMemail();
					mzonecode = mvo.getMzonecode();
					mroadaddress = mvo.getMroadaddress();
					String addr[] = mroadaddress.split("@");
					if (addr.length > 2){
						mroadaddress = addr[0];
						mroadaddressdetail = addr[1];
							
					}
					mjibunaddress = mvo.getMjibunaddress();
				}
 			%>
 			<hr>
 			<div>
 					<form name="memUpdateForm" id="memUpdateForm">
 							<script>
 									function compCheck(){
 										console.log("compCheck >>> 진입 >>> : ");
 										
 										//성별
 										var gen = '<%= mgender %>';
 										console.log("gen >>> " + gen);
 										if('01' == gen){
 											document.getElementsByName("mgender")[0].checked = true;
 										}
 										if('02'==gen){
 											document.getElementsByName("mgender")[1].checked = true;
 										}
 										
 										//이메일
 										var email = '<%= memail %>';
 										var emails = email.split("@");
 										document.getElementById("memail").value = emails[0];
 										document.getElementById("memail1").value = emails[1];
 									}
 							</script>
 							<table >
 									<tr>
 										<td colspan="3" align="center">
 										<font size="4">회원정보 수정 & 삭제</font>
 										
 										</td>
 									</tr>
 									<tr>
 										<th>회원번호</th>
 										<td><input type="text" name="mnum" id="mnum" value="<%= mvo.getMnum() %>" readonly>
 										</td>
 									</tr>
 									<tr>
 										<th>이름</th>
 										<td><input type="text" name="mname" id="mname" value="<%= mvo.getMname() %>" readonly></td>
 									</tr>
 									<tr>
 										<th>아이디</th>
 										<td><input type="text" name="mid" id="mid" style="width:100px" value="<%= ssMap.get("ssMid") %>" readonly>
 										</td>
 									</tr>
 									<tr>
 										<th>패스워드</th>
 										<td><input type="text" name="mpw" id="mpw" style="width:100px" value="<%= mvo.getMpw() %>" readonly><br/>
 										</td>
 									</tr>
 									<tr>
 										<th>성별</th>
 										<td><input type="radio" name="mgender" id="mgender" value="01" checked>여자
 											<input type="radio" name="mgender" id="mgender" value="02">남자
 										</td>
 									</tr>
 									<tr>
 										<th>생년월일</th>
 										<td colspan="2"><input type="text" name="mbirth" id="mbirth" value="<%= mbirth %>" readonly>
 										</td>
 									</tr>
 									<tr>
 										<th>핸드폰</th>
 										<td colspan="2"><input type="text" name="mhp" id="mhp" value="<%= mhp %>" readonly></td>
 									</tr>
 									<tr>
 										<th>이메일</th>
 										<td colspan="2">
 										<input type="text" name="memail" id="memail"  style="width:100px" > @
 										<input type="text" name="memail1" id="memail1" style="width:100px" placeholder="직접입력">
 										<select name="memail2" id="memail2">
 												<option value="1" selected>직접입력</option>
 												<option value="naver.com">naver.com</option>
 												<option value="gmail.com">gmail.com</option>
 												<option value="daum.net">daum.get</option>
 										</select>
 										</td>
 									</tr>
 									<tr>
 										<th>주소</th>
 										<td colspan="2">
 										<input type="text" name="mzonecode" id="mzonecode" placeholder="우편번호" style="width:50px" value="<%= mzonecode %>">
 										<input type="button" name="zonecode" id="zonecode" value="우편번호 찾기"><br>
 										<input type="text" name="mroadaddress" id="mroadaddress" placeholder="도로명주소" style="width:250px" value="<%= mroadaddress %>"><br>
 										<input type="text" name="mjibunaddress" id="mjibunaddress" placeholder="지번주소" style="width:250px" value="<%= mjibunaddress %>">
 										</td>
 									</tr>
 									<tr>
 										<td colspan="3" align="right">
 										<input type="button" value="수정" id='U'>
 										<input type="button" value="삭제" id='D'>
 										<input type="button" value="입력" id='I'>
 										<input type="button" value="목록" id='SALL'>
 										</td>
 									</tr>
  							</table>
 					</form>
 			</div>

	</body>
</html>