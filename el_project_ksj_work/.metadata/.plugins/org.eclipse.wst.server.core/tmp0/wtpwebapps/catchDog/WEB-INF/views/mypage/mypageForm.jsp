<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	//  회원정보 수정 눌렀을때
	$(document).on("click", "#btn", function(){
		// alert("회원정보수정"); 
		//alert("<%= ssMap.get("ssMnum") %>"); 
		mnum: $("#mnum").val()
		// alert($("#mnum").val())
		$("#mypageForm").attr({
			 "method":"GET"
            ,"action":"memSelect.cd"
            ,'enctype':'application/x-www-form-urlencoded'
            }).submit();
		});
	});

</script>
<style type="text/css">
/* 녹색배경 */
.blue{  
  height: 80px  !important;
  background-color: #F7AA58;    
  
  display: flex;
  align-items: flex-end;
  padding: 16px;
}
</style>
</head>
<body>
<jsp:include page="/include/header.jsp" flush="true"></jsp:include>
	<div class="wrap">
	  <div class="greenContainer blue">
 			<form id="mypageForm">
		  <input type="hidden" name="mnum" id="mnum" value="<%= ssMap.get("ssMnum") %>"/>
		  <div class="name"><%= ssMap.get("ssMname") %>님 환영합니다</div>
	      <img src="/image/mypage/—Pngtree—soles_6083038.png" width="60" height="60" alt="발바닥">      
	  		</form>
	  </div>
	  <div class="summaryContainer">
	    <div class="item">	        
	        <div class="number"><input type="button" value="회원정보수정" id="btn" class="btn"></div>
	      </div>
	      <div class="item">
	        <div class="number">354</div>
	        <div>상품후기</div>
	      </div>
	  </div>  
	  <div class="shippingStatusContainer">
	    <div class="title">
	      주문/배송조회
	    </div>
	    <div class="status">
	      
	      <div class="item">
	        <div>
	          <div class="green number">6</div>
	          <div class="text">장바구니</div>
	        </div>
	        <div class="icon"> > </div>
	      </div>     
	      <div class="item">
	        <div>
	          <div class="number">0</div>
	          <div class="text">결제완료</div>
	        </div>
	        <div class="icon"> > </div>
	      </div>     
	      <div class="item">
	        <div>
	          <div class="green number">1</div>
	          <div class="text">배송중</div>
	        </div>
	        <div class="icon"> > </div>
	      </div>     
	      <div class="item">
	        <div>
	          <div class="green number">3</div>
	          <div class="text">구매확정</div>
	        </div>
	      </div>     
	      
	    </div>
	    
	  </div>  
	  <div class="listContainer">
	    <a href="#" class="item">
	        <div class="icon">ii</div>
	        <div class="text">주문목록<span class="circle"></span></div>
	        <div class="right"> > </div>
	    </a>
	    <a href="#" class="item">
	        <div class="icon">ii</div>
	        <div class="text">상품후기</div>
	        <div class="right"> > </div>
	    </a>
	    <a href="#" class="item">
	        <div class="icon">ii</div>
	        <div class="text">상품문의</div>
	        <div class="right"> > </div>
	    </a>
	    <a href="#" class="item">
	        <div class="icon">ii</div>
	        <div class="text">단골상점</div>
	        <div class="right"> > </div>
	    </a>
	    <a href="#" class="item">
	        <div class="icon">ii</div>
	        <div class="text">찜한상품</div>
	        <div class="right"> > </div>
	    </a>
	  </div>
	
	</div>
</body>
</html>