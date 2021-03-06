package com.catchdog.disadoption.vo;

import com.sun.istack.internal.logging.Logger;

public class DisadoptionVO {

	private static Logger logger = Logger.getLogger(DisadoptionVO.class);
	
	private String mnum;
	private String mname;
	private String mid;
	private String anum;
	private String asubject;
	private String apw;
	private String adno;
	private String aname;
	private String aupkind;
	private String akind;
	private String acolor;
	private String afur;
	private String asize;
	private String aneut;
	private String aage;
	private String aimage;
	private String agender;
	private String acaresite;
	private String acaretel;
	private String aspecial;
	private String deleteyn;
	private String insertdate;
	private String updatedate;
	
	// 페이징 이동 필드
	private String pageSize;
	private String groupSize;
	private String curPage;
	private String totalCount;


	public DisadoptionVO() {

	}
	public DisadoptionVO(String mnum, String mid, String mname, String anum,
						 String asubject, String apw, String adno, 
						 String aname, String aupkind, String akind, 
						 String acolor, String afur, String asize,
						 String aneut, String aage, String aimage,
						 String agender,String acaresite, String acaretel, 
						 String aspecial,String deleteyn, 
						 String insertdate,String updatedate) {
		
		this.mnum = mnum;
		this.mid = mid;
		this.mname = mname;
		this.anum = anum;
		this.asubject = asubject;
		this.apw = apw;
		this.adno = adno;
		this.aname = aname;
		this.aupkind = aupkind;
		this.akind = akind;
		this.acolor = acolor;
		this.afur = afur;
		this.asize = asize;
		this.aneut = aneut;
		this.aage = aage;
		this.aimage = aimage;
		this.agender = agender;
		this.acaresite = acaresite;
		this.acaretel = acaretel;
		this.aspecial = aspecial;
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
	}
	
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public DisadoptionVO(String pageSize, String groupSize, 
						 String curPage, String totalCount) {

		this.pageSize = pageSize;
		this.groupSize = groupSize;
		this.curPage = curPage;
		this.totalCount = totalCount;
	}
	
	// getter
	public String getMnum() {
		return mnum;
	}
	public String getMid() {
		return mid;
	}
	public String getAnum() {
		return anum;
	}
	public String getAsubject() {
		return asubject;
	}
	public String getApw() {
		return apw;
	}
	public String getAdno() {
		return adno;
	}
	public String getAname() {
		return aname;
	}
	public String getAupkind() {
		return aupkind;
	}
	public String getAkind() {
		return akind;
	}
	public String getAcolor() {
		return acolor;
	}
	public String getAfur() {
		return afur;
	}
	public String getAsize() {
		return asize;
	}
	public String getAneut() {
		return aneut;
	}
	public String getAage() {
		return aage;
	}
	public String getAimage() {
		return aimage;
	}
	public String getAgender() {
		return agender;
	}
	public String getAcaresite() {
		return acaresite;
	}
	public String getAcaretel() {
		return acaretel;
	}
	public String getAspecial() {
		return aspecial;
	}
	public String getDeleteyn() {
		return deleteyn;
	}
	public String getInsertdate() {
		return insertdate;
	}
	public String getUpdatedate() {
		return updatedate;
	}
	public String getPageSize() {
		return pageSize;
	}
	public String getGroupSize() {
		return groupSize;
	}
	public String getCurPage() {
		return curPage;
	}
	public String getTotalCount() {
		return totalCount;
	}
	
	// setter
	public void setMnum(String mnum) {
		this.mnum = mnum;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public void setAnum(String anum) {
		this.anum = anum;
	}
	public void setAsubject(String asubject) {
		this.asubject = asubject;
	}
	public void setApw(String apw) {
		this.apw = apw;
	}
	public void setAdno(String adno) {
		this.adno = adno;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public void setAupkind(String aupkind) {
		this.aupkind = aupkind;
	}
	public void setAkind(String akind) {
		this.akind = akind;
	}
	public void setAcolor(String acolor) {
		this.acolor = acolor;
	}
	public void setAfur(String afur) {
		this.afur = afur;
	}
	public void setAsize(String asize) {
		this.asize = asize;
	}
	public void setAneut(String aneut) {
		this.aneut = aneut;
	}
	public void setAage(String aage) {
		this.aage = aage;
	}
	public void setAimage(String aimage) {
		this.aimage = aimage;
	}
	public void setAgender(String agender) {
		this.agender = agender;
	}
	public void setAcaresite(String acaresite) {
		this.acaresite = acaresite;
	}
	public void setAcaretel(String acaretel) {
		this.acaretel = acaretel;
	}
	public void setAspecial(String aspecial) {
		this.aspecial = aspecial;
	}
	public void setDeleteyn(String deleteyn) {
		this.deleteyn = deleteyn;
	}
	public void setInsertdate(String insertdate) {
		this.insertdate = 
				insertdate;
	}
	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public void setGroupSize(String groupSize) {
		this.groupSize = groupSize;
	}
	public void setCurPage(String curPage) {
		this.curPage = curPage;
	}
	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	
	
	public static void printVO (DisadoptionVO dvo) {
		logger.info("DisadoptionVO 데이터 확인 시작  >>> : ");
		
		logger.info("회원번호 >>> : " + dvo.getMnum());
		logger.info("게시판 글번호 >>> : " + dvo.getAnum());
		logger.info("게시판 글제목 >>> : " + dvo.getAsubject());
		logger.info("글 비밀번호 >>> : " + dvo.getApw());
		logger.info("유기번호 >>> : " + dvo.getAdno());
		logger.info("이름 >>> : " + dvo.getAname());
		logger.info("종구분 >>> : " + dvo.getAupkind());
		logger.info("세부종 >>> : " + dvo.getAkind());
		logger.info("색상 >>> : " + dvo.getAcolor());
		logger.info("크기 >>> : " + dvo.getAsize());
		logger.info("중성화 여부 >>> : " + dvo.getAneut());
		logger.info("추정나이 >>> : " + dvo.getAage());
		logger.info("사진 >>> : " + dvo.getAimage());
		logger.info("성별 >>> : " + dvo.getAgender());
		logger.info("보호장소 >>> : " + dvo.getAcaresite());
		logger.info("보호장소 전화번호 >>> : " + dvo.getAcaretel());
		logger.info("특징>>> : " + dvo.getAspecial());
		logger.info("신청날짜/발견날짜 >>> : " + dvo.getInsertdate());
		logger.info("수정날짜 >>> : " + dvo.getUpdatedate());
		logger.info("삭제여부 >>> : " + dvo.getDeleteyn());
		logger.info("페이징 데이터 확인 >>>");
		logger.info("페이지 >>> : " + dvo.getPageSize());
		logger.info("그룹사이즈 >>> : " + dvo.getGroupSize());
		logger.info("현재페이지 >>> : " + dvo.getCurPage());
		logger.info("전체건수 >>> : " + dvo.getTotalCount());
		
		
		logger.info("DisadoptionVO 데이터 확인 끝  >>> : ");
	}
	
	
			
}


