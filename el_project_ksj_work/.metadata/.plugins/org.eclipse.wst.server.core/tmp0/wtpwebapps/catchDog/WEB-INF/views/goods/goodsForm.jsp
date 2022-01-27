<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GoodsInsert</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$(document).on("click", "#gbtn", function(){
			$('#goodsForm').attr({
				'action':'goodsInsert.cd',
				'method':'POST',
				'enctype':'multipart/form-data'
			}).submit();
		});
	});
</script>
</head>
<body>
<form name="goodsForm" id="goodsForm">
	<table border="1" align="center">
<!-- 
	private String gnum; 채번 ㅇ
	private String gpdnum; 채번 ㅇ
	private String gname; 입력  ㅇ
	private String gimage; 파일 이름 ㅇ 
	private String gdday; 달력? 마감일 ㅇ
	private String gmoney; 입력 현재 금액 X 
	private String gtarget; 입력 목표치 ㅇ
	private String gprice; 입력 가격 ㅇ
	private String gdetailpage;  상세페이지 컨텐츠 입력 텍스트 에어리어  ㅇ
 -->	
 	<tr>
 		<td colspan="2" align="center"> 상품 판매글 입력</td>
 	</tr>
 	<tr>
 		<td align="center">글번호</td>
 		<td><input type="text" name="gnum" id="gnum" size="20" readonly></td>
 	</tr>
 	<tr>
 		<td align="center">상품번호</td>
 		<td><input type="text" name="gpdnum" id="gpdnum" size="20" readonly></td>
 	<tr>
 		<td align="center">상품명</td>
 		<td><input type="text" name="gname" id="gname" size="53"></td>
 	</tr>
 	<tr>
 		<td align="center">상품가격</td>
 		<td><input type="text" name="gprice" id="gprice" size="53"></td>
 	</tr>
 	<tr>
 		<td align="center">목표금액</td>
 		<td><input type="text" name="gtarget" id="gtarget" size="53"></td>
 	</tr>
 	<tr>
 		<td align="center">D-DAY</td>
 		<td><input type="text" name="gdday" id="gdday" size="20"></td>
 	</tr>
 	<tr>
		<td align="center">내용 </td>
		<td><textarea type="text" name="gdetail" id="gdetail" rows="10"></textarea></td>
	</tr>
 	<tr>
		<td align="center">사진</td>
		<td><input type="file" name="gimage" id="gimage"></td>
	</tr>
	<tr>
		<td><input type="hidden" name="mnum" id="mnum" value="M2021120024"></td>
	</tr>			
	<tr>
		<td colspan="2" align="right"></td>
		<td><input type="button" value="글쓰기" id="gbtn"></td>
	</tr>
	</table>
</form>
</body>
</html>