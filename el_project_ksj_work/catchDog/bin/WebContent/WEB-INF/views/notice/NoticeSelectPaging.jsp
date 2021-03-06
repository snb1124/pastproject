<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "com.catchdog.notice.vo.NoticeVO"%>
<%@ page import = "java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 페이징 목록 </title>
<script src ="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">

	$(document).ready(function(){
		
		$(document).on("click","#nnum",function(){
			if($(this).prop('checked')){
				$('.nnum').prop('checked',false);
				$(this).prop('checked',true);
			}
		});
		
		//검색 버튼 누르면 
		$(document).on("click","#searchBtn",function(){
			alert("searchBtn>>>");
			$("#noticeList").attr({
									"method":"GET"
									,"action":"NoticeSelectPaging.cd"
									
							}).submit();
			
		});
		
		//I
		$(document).on("click","#I",function(){
			
			location.href ="noticeForm.cd";
		
		});
		
		//U
		$(document).on("click","#U",function(){
			if($('.nnum:checked').length == 0){
				alert('수정할 글 번호 하나를 선택하세요');
				return;
			}
			$("#noticeList").attr({
							"method":"POST"
							,"action":"noticeSelect.cd"
						
			}).submit();
		});
		
		//d버튼 
		$(document).on("click","#D",function(){
			if($('.nnum:checked').length == 0){
				alert('수정할 글 번호 하나를 선택하세요');
				return;
			}
			$("#noticeList").attr({
							"method":"POST"
							,"action":"noticeSelect.cd"
							
			}).submit();
		});
	});
</script>

</head>
<body>
<jsp:include page="/include/header.jsp" flush="true"></jsp:include>	
<% 
	//페이징 변수 세팅
	int pageSize = 0;
 	int groupSize = 0;
 	int curPage = 0;
 	int totalCount= 0;
 	
 	Object objPaging = request.getAttribute("pagingNVO");
 	NoticeVO pagingNVO = (NoticeVO)objPaging;
 	
 	Object obj = request.getAttribute("listAll");
 	List<NoticeVO> list = (List)obj;
 	
 	int nCnt = list.size();
 	System.out.println("nCnt >>>:" + nCnt);
 	
%>
<form name="noticeList" id="noticeList">
<table border ="1" align="center">
<thead>
<tr>
	<td colspan="10" align="center">
		<h2>공지사항</h2>
	</td>
</tr>
<tr>
	<td colspan="10" align="left">
	<select id="keyfilter" name="keyfilter">
		<option value="key1">제목</option>
		<option value="key2">내용</option>
		<option value="key3">제목+내용</option>
	</select>
	<input type="text" id="keyword" placeholder="검색어입력"><br>
	<button type="button" id="searchBtn">검색 </button>
	</td>
</tr>
<tr>
	<th class="tt">체크</th>
	<th class="tt">글번호</th>
	<th class="tt">제목</th>	
	<th class="tt">내용</th>
	<th class="tt">최종작성일</th>
	<th class="tt">사진</th>	
</tr>
</thead>

<%
	for(int i=0; i<nCnt; i++){
		NoticeVO nvo = list.get(i);
		pageSize = Integer.parseInt(pagingNVO.getPageSize());
		groupSize=Integer.parseInt(pagingNVO.getGroupSize());
		curPage=Integer.parseInt(pagingNVO.getCurPage());
		totalCount =Integer.parseInt(nvo.getTotalCount());

%>
<tbody>
<tr>
	<td align="center">
		<input type="checkbox" name="nnum" id="nnum" class="nnum" value="<%=nvo.getNnum() %>">
	</td>
	<td class="tt"><%= (curPage-1)*pageSize + i + 1 %></td>
	<td class="tt"><%= nvo.getNtitle() %></td>
	<td class="tt"><%= nvo.getNcontent() %></td>
	<td class="tt"><%= nvo.getNupdatedate() %></td>
	<td class ="tt"><img src ="image/noticeimg/<%=nvo.getNimage() %>"></td>
</tr>
<%
	}//end of for
%>
<tr>
	<td colspan="7" align="right">
		<input type="button" value="글쓰기 " id='I'>
		<input type="button" value="글수정 " id='U'>
		<input type="button" value="글삭제 " id='D'>
	</td>
</tr>
<td colspan="7">
<jsp:include page="NoticePaging.jsp" flush="true">
	<jsp:param  name="url" value="NoticeSelectPaging.cd"/>
	<jsp:param  name="str" value=""/>
	<jsp:param  name="pageSize" value="<%=pageSize %>"/>
	<jsp:param  name="groupSize" value="<%=groupSize %>"/>
	<jsp:param  name="curPage" value="<%=curPage %>"/>
	<jsp:param  name="totalCount" value="<%=totalCount %>"/>
</jsp:include>
</td>
</tbody>
</table>
</form>
</body>
</html>