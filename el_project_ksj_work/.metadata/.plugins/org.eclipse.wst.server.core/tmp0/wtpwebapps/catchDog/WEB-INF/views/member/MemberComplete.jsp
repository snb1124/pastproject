<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.catchdog.common.CodeUtil" %>
<%@ page import="com.catchdog.member.vo.MemberVO" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	form {
		margin-left: auto !important;
		margin-right: auto !important;
		width: 50%;
		align: center;
	}
</style>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	$(document).on("click", "#Login", function(){
		$("#MemberComplete").attr({
			"action":"loginForm.cd",
			"method":"POST"
		}).submit();
	});
	
	$(document).on("click", "#Recommend", function(){
		$("#MemberComplete").attr({
			"action":"recommendForm.cd",
			"method":"POST"
		}).submit();
	});
</script>
</head>
<body>
<jsp:include page="/include/header.jsp" flush="true"></jsp:include>
<%
	Object obj = request.getAttribute("listS");
	if(obj==null) return;
	
	ArrayList<MemberVO> aList = (ArrayList<MemberVO>)obj;
	int nCnt = aList.size();
	
	String mgender = "";
	String mbirth = "";
	String mhp = "";
	String memail = "";
	String maddrress = "";
	String mzonecode = "";
	String mroadaddress = "";
	String mroadaddressdetail = "";
	String mjibunaddress = "";
	
	MemberVO mvo = null;
	
	if(nCnt == 1){
		mvo = aList.get(0);
		
		if (mvo.getMgender() == "01"){
			mgender = "여자";
		}else{
			mgender = "남자";
		}
		mbirth = CodeUtil.birth(mvo.getMbirth());
		mhp = CodeUtil.hp(mvo.getMhp());
		memail = mvo.getMemail();
		mzonecode = mvo.getMzonecode();
		mroadaddress = mvo.getMroadaddress();
		maddrress = mvo.getMroadaddress().replace("@", " ");
		mjibunaddress = mvo.getMjibunaddress();
	}
	%>
<form name="MemberComplete" id="MemberComplete">
	<input type="hidden" name="mnum" id="mnum" value="<%= mvo.getMnum() %>"/>
	<div style="width: 80%;height: 442px;border: 1px solid #ccc;border-top:1px solid black; align-items: center; text-align: center;line-height: 40px;padding-top: 15px; margin: 35px auto;">
			<h1 style="font-size: 30px; color: black;">가입 완료</h1>
			<h2 style="color:black;">회원가입이 완료되었습니다.</h2>
			<div style="margin: 10px auto; border-top: 0.5px dashed; width: 80%; display:block;">
						<span style="font-weight: bold; font-size:12px; display:inline-block; width:48%; text-align: right; padding-right: 10px;">이름 :</span>
						<span style="font-weight: bold; font-size:12px; display:inline-block; width:48%; text-align: left;"> <%= mvo.getMname() %></span>
						<span style="font-weight: bold; font-size:12px; display:inline-block; width:48%; text-align: right; padding-right: 10px;">아이디 :</span>
						<span style="font-weight: bold; font-size:12px; display:inline-block; width:48%; text-align: left;"> <%= mvo.getMid() %></span>
						<span style="font-weight: bold; font-size:12px; display:inline-block; width:48%; text-align: right; padding-right: 10px;">성별 :</span>
						<span style="font-weight: bold; font-size:12px; display:inline-block; width:48%; text-align: left;"> <%= mgender %></span>
						<span style="font-weight: bold; font-size:12px; display:inline-block; width:48%; text-align: right; padding-right: 10px;">생년월일 :</span>
						<span style="font-weight: bold; font-size:12px; display:inline-block; width:48%; text-align: left;"> <%= mbirth %></span>
						<span style="font-weight: bold; font-size:12px; display:inline-block; width:48%; text-align: right; padding-right: 10px;">핸드폰 :</span>
						<span style="font-weight: bold; font-size:12px; display:inline-block; width:48%; text-align: left;"> <%= mhp %></span>
						<span style="font-weight: bold; font-size:12px; display:inline-block; width:48%; text-align: right; padding-right: 10px;">이메일 :</span>
						<span style="font-weight: bold; font-size:12px; display:inline-block; width:48%; text-align: left;"> <%= mvo.getMemail() %></span>
						<span style="font-weight: bold; font-size:12px; display:inline-block; width:48%; text-align: right; padding-right: 10px;">주소 :</span>
						<span style="font-weight: bold; font-size:12px; display:inline-block; width:48%; text-align: left;"><%= maddrress%> </span>

			</div>
			<input type="button" name="Login" id="Login" value="로그인하기" style="display:inline-block; padding:0 15px; background:#393939; color:#FFF; line-height:30px; font-weight:bold; border:none; cursor:pointer;">
			<input type="button" name="Recommend" id="Recommend" value="관심동물 선택하기" style="display:inline-block; padding:0 15px; background:#393939; color:#FFF; line-height:30px; font-weight:bold; border:none; cursor:pointer;">
	</div>
	

</form>
</body>
</html>