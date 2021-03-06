<%@page import="java.util.List"%>
<%@page import="com.catchdog.disadoption.vo.DisadoptionVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
<style type="text/css">
.tt{ text-align:center; font-weight:bold;}
.button { border:none;}
</style>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script type="text/javascript">

$(document).ready(function(){			
	// anum
	$(document).on("click", "#anum", function(){
		//alert("chkInAnum >>> : ");		
		if($(this).prop('checked')){			 
			//$('input[type="checkbox"][name="anum"]').prop('checked',false);
			$('.anum').prop('checked',false);
			$(this).prop('checked',true);
		}
	});
	//  I
	$(document).on("click", "#I", function(){
		//alert("I >>> : ");
		location.href="/disadoptionBoardInsert.cd";
	});
	
	$(document).on("click", ".subject", function(){
		$("#anum").val($(this).attr("id"));
		$("#boardList").attr({ "method":"POST"
             ,"action":"disadoptionPwCheckForm.cd"}).submit();
	});
	
});
	
</script>

</head>
<body>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:include page="/include/header.jsp" flush="true"></jsp:include>
<p class="nav">1</p>
<%
	//페이징 변수 세팅
	int pageSize = 0;
	int groupSize = 0;
	int curPage = 0;
	int totalCount = 0;

	Object objPaging = request.getAttribute("pagingDVO");
	DisadoptionVO pagingDVO = (DisadoptionVO)objPaging;
	
	Object obj = request.getAttribute("listAll");
	List<DisadoptionVO> list = (List)obj;
	System.out.println("Obj >>> : " + list);
	int nCnt= list.size();
	System.out.println("nCnt >>> : " + nCnt);
%>
	
	<form name="boardList" id="boardList" class="boardList">
	<input type="hidden" id="anum" name="anum"/>
		<table align="center" style="border-top:none;">
			<thead>
			<tr>
				<td colspan ="10">
					<h1 style="font-size: 25px; color:black; margin-left: 41%; margin-bottom:15px;">파양 게시판</h1>
				</td>	
			</tr>
			<tr>
				<th class="tt">글번호</th>
				<th class="tt" width="50%">제목</th>
				<th class="tt">작성자</th>		
				<th class="tt">최종작성일</th>
			</tr>
			</thead>
<%
for(int i=0; i<nCnt; i++){
		DisadoptionVO dvo = list.get(i);
		System.out.println("dvo.getAnum >>> : " + dvo.getAnum());
		System.out.println("dvo.getMname() >>> : " + dvo.getMname());
		pageSize = Integer.parseInt(pagingDVO.getPageSize());
		groupSize = Integer.parseInt(pagingDVO.getGroupSize());
		curPage = Integer.parseInt(pagingDVO.getCurPage());
		totalCount = Integer.parseInt(dvo.getTotalCount());
%>	
	<tbody>
		<tr>	
			<td class="tt"><%= dvo.getAnum() %> </td>
			<td class="tt" style="padding-left: 0;">
			<span class="subject" id="<%= dvo.getAnum() %>" style="cursor:pointer;"><%= dvo.getAsubject() %></span></td>
			<td class="tt"><%= dvo.getMname() %> </td>
			<td class="tt"><%= dvo.getInsertdate() %> </td>
		</tr>
		
<%
}// end of for	
%>	
	<tr style="border:none;">
		<td> </td>
		<td style="padding-left: 0">
			<jsp:include page="disadoptionBoardSelectPaging.jsp" flush="true">
				<jsp:param name="url" value="disadoptionBoardSelectPaging.cd"/>
				<jsp:param name="str" value=""/>
				<jsp:param name="pageSize" value="<%=pageSize%>"/>
				<jsp:param name="groupSize" value="<%=groupSize%>"/>
				<jsp:param name="curPage" value="<%=curPage%>"/>
				<jsp:param name="totalCount" value="<%=totalCount%>"/>
			</jsp:include>
		</td>
		<td> </td>
		<td>
			<input type="button" value="파양신청하기" id="I" style="float: right;">
		</td>
	</tr>
	</tbody>		
		</table>
	</form>
</body>
</html>