package com.catchdog.common;

import com.catchdog.adoption.vo.AdoptionVO;

public class CodeUtil {

	// 성별
	public static final String[] gender_value = {"여자", "남자"};
	// 핸드폰 라벨
	public static final String[] hp_value = {"010", "011", "016", "017"};
		
	//생일
	public static String birth(String s) {
		String s0 = "";
		String s1 = "";
		String s2 = "";
		String ss = "";
		
		if(s !=null && s.length()>0) {
			int sLen = s.length();
			System.out.println("코드유틸 생일함수 -->>들어온 값 크기"+sLen);
			if(8 == sLen) {
				s0 = s.substring(0,4);
				s1 = s.substring(4,6);
				s2 = s.substring(6);
				ss = s0 +"-"+s1+"-"+s2;
				System.out.println("생일값 쪼개기 ->>>"+s0+"년"+s1+"월"+s2+"일");
			}
		}
		return ss;
	}
	
	// 매개변수 값이 1이면 여자 아니면 남자
	public static String gender(String s) {
		return "01".equals(s.toUpperCase()) ? "남자" : "여자";
	}
	

	
	// 전화번호 
	public static String hp(String s) {

		String s0 = "";
		String s1 = "";
		String s2 = "";
		String ss = "";
		
		if (s !=null && s.length() > 0){			
			int sLen = s.length();			
			if (11 == sLen) {
				s0 = s.substring(0, 3);
				s1 = s.substring(3, 7);
				s2 = s.substring(7);
				ss = s0 + "-" + s1 + "-" + s2;
			}
		}		
		return ss;
	}
	
	public static String aname(String s) {
		if(s == null) return "없음";
		else return s;
	}
	
	public static String akind(String s) {
		if(s.contains("[개] ")) return s.replace("[개] ", "");
		if(s.contains("[고양이] ")) return s.replace("[고양이] ", "");
		return "";
	}
	
	public static String aupkind(String s) {
		if(s.equals("01")) return "고양이";
		if(s.equals("02")) return "강아지";
		return "미정";
	}
	
	public static String[] acaresite(String s) {
		if(s == null) return new String[] {"불명", ""};
		
		String[] address = s.split(" ");
		if(address.length == 1) {
			return new String[] {address[0], ""};
		}
		if(address.length > 1) {
			return new String[] {address[0], address[1]};
		}
		return new String[] {"", ""};
	}
	
	public static String acolors(String s) {
		StringBuffer sb = new StringBuffer();
		if(s == null) return sb.append("불명").toString();
		if(s.contains("흰") || s.contains("백")) sb.append("흰색,");
		if(s.contains("검") || s.contains("흑")) sb.append("검정색,");
		if(s.contains("갈")) sb.append("갈색,");
		if(s.contains("노") || s.contains("황")) sb.append("노랑색,");
		if(s.contains("고등어")) sb.append("고등어색,");
		if(s.contains("주")) sb.append("주황색,");
		if(s.contains("회")) sb.append("회색,");
		System.out.println("color result >>> : " + sb.toString());
		if(sb.length() > 0) return sb.toString();
		else return s;
	}
	
	public static String[] acolor(String s) {
		String colors = acolors(s);
		String[] splitColors = colors.split(",");
		/*
			for(int i=0; i<splitColors.length; i++) {
				System.out.println("splitColors["+ i +"] >>> : " + splitColors[i]);
			}
		*/
		
		return splitColors;
	}
	
	public static String[] aindividuality(AdoptionVO avo) {
		if(avo == null) return null;
		return new String[] {avo.getAsize(), avo.getAfur()};
	}
	
	public static String aneut(String s) {
		if(s.equals("U")) return "불명";
		if(s.equals("Y")) return "O";
		if(s.equals("N")) return "X";
		return "불명";
	}
	
	public static String aage(String s) {
		if(s == null || s == "") return "불명";
		s = s.replace("(년생)", "");
		int currYear = Integer.parseInt(DateFormatUtil.yFormat());
		int bornYear = Integer.parseInt(s);
		return String.valueOf(currYear - bornYear);
	}
	
	public static String agender(String s) {
		if(s == null) return "불명";
		if(s.equals("M")) return "남자";
		if(s.equals("F")) return "여자";
		return "불명";
	}
	
	public static void main(String[] args) {
		System.out.print("color >>> : ");
		String[] colors = acolor("흰검갈노");
		for(int i=0; i<colors.length; i++) {
			System.out.print(colors[i]+" ");
		}
		System.out.println("");
		
		String[] caresites = acaresite("강원도 강릉시 사실이 아닙니다.");
		System.out.println("주소 >>> : " + caresites[0] + " " + caresites[1]);
		
		System.out.println("나이 >>> : " + aage("2011(년생)"));
	}
}
