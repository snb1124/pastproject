package com.catchdog.common;

public class CommonUtils {
	
	// 절대 경로 구하기
	private static String curPath = CommonUtils.class.getResource(".").getPath();
	private static String absolutePath = curPath.substring(1, curPath.lastIndexOf("WEB-INF")-1);
	// OS별 경로 구분자
	private static String systemSep = System.getProperty("file.separator");
	// 이미지 디렉토리 경로
	private static String imgPath = absolutePath + systemSep + "image" + systemSep;
	
	static  int yyy = 2*1024*1024;
	static String euckr = "";
	static String utf8 = "UTF-8";
	
	//회원가입
	public static final String MEMBER_PATH = imgPath+"memberimg";
	public static final int MEMBER_SIZE = 2*1024*1024;
	public static final String MEMBER_ENCODE = utf8;
	
	//입양
	public static final String ADOPTION_PATH = imgPath + "adoptionimg";
	public static final int ADOPTION_SIZE = yyy;
	public static final String ADOPTION_ENCODE = utf8;

	//입양후기
	public static final String ADOPTION_REVIEW_PATH = imgPath + "reviewimg";
	public static final int ADOPTION_REVIEW_SIZE = 2*1024*1024;;
	public static final String ADOPTION_REVIEW_ENCODE ="UTF-8";

	//파양
	public static final String DISADOPTION_PATH = imgPath + "disadoptionimg";
	public static final int DISADOPTION_SIZE = 2*1024*1024;;
	public static final String DISADOPTION_ENCODE ="UTF-8";
	
	//실종
	public static final String DISAPPEARANCE_PATH = imgPath + "disappearanceimg";
	public static final int DISAPPEARANCE_SIZE = 2*1024*1024;
	public static final String DISAPPEARANCE_ENCODE ="UTF-8";
	
	//굿즈
	public static final String GOODS_PATH = imgPath + "goodsimg";
	public static final int GOODS_SIZE = 2*1024*1024;
	public static final String GOODS_ENCODE ="UTF-8";
	
	//공지사항
	public static final String NOTICE_PATH = imgPath + "noticeimg";
	public static final int NOTICE_SIZE = 2*1024*1024;;
	public static final String NOTICE_ENCODE ="UTF-8";
	
	public static final String XML_FILE_PATH = imgPath + "shelterimg";
	public static final int SHELTER_CURPAGE = 1;
	public static final int SHELTER_PAGESIZE =5;
	public static final int SHELTER_GROUPSIZE = 5;
	public static final int SHELTER_TOTALCOUNGT = 0;

	
	//페이징은 이해도 가 내가 작성 어떻게 해야할지 헷갈림
	public static final int BOARD_PAGE_SIZE = 10;
	public static final int BOARD_GROUP_SIZE = 5;
	public static final int BOARD_CUR_PAGE = 1;
	public static final int BOARD_TOTAL_COUNT = 0;
	
	//공지사항 페이징 
	public static final int NOTICE_PAGE_SIZE = 10;
	public static final int NOTICE_GROUP_SIZE = 5;
	public static final int NOTICE_CUR_PAGE = 1;
	public static final int NOTICE_TOTAL_COUNT = 0;
	
	//입양후기 페이징
	public static final int REVIEW_PAGE_SIZE = 5; //(화면에 몇개)
	public static final int REVIEW_GROUP_SIZE = 5; //(맨밑에 몇개 표시)
	public static final int REVIEW_CUR_PAGE = 1;   //(현재 첫번째 페이지 표시)
	public static final int REVIEW_TOTAL_COUNT = 0; //()

	
	// 굿즈 페이징
	public static final int GOODS_PAGE_SIZE = 10;
    public static final int GOODS_GROUP_SIZE = 9;
    public static final int GOODS_CUR_PAGE = 1;
    public static final int GOODS_TOTAL_COUNT = 0;
    
    // 실종 페이징
  	public static final int DISAPPEARANCE_PAGE_SIZE = 10;
    public static final int DISAPPEARANCE_GROUP_SIZE = 5;
    public static final int DISAPPEARANCE_CUR_PAGE = 1;
    public static final int DISAPPEARANCE_TOTAL_COUNT = 0;
    
}
