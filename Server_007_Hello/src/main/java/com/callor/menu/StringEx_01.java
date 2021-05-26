package com.callor.menu;

public class StringEx_01 {

	public static void main(String[] args) {

		String menu = "null";
// 노란줄 방지하여 임시로 "" 감싸놨음.
		if (menu == "null") {
			System.out.println("menu 값이 null");
		} else if (menu.equals("1")) {
			System.out.println("menu에 저장된 값은 1");
		} else if (menu.equals("2")) {
			System.out.println("저장된 값 2");
		} else if (menu.equals("3")) {
			System.out.println("저장된 값 3");
		} else if (menu.equals("4")) {
			System.out.println("저장된 값 4");
		} else if (menu.equals("5")) {
			System.out.println("저장된 값 5");
		} else {
			System.out.println("모르겠음");
		}
		/*
		 * switch 명령은 다중 if else, else if를 대신하여 사용할 수 있는 구조적인 명령문이다. 단점이 반드시 case 조건을
		 * 수행한 다음 break;를 실행하여 더이상 불필요한 코드가 실행되는 것을 막아야하며
		 * 만약에 변수에 저장된 값이 null이면 미리 
		 * if 명령등을 이용하여 검사를 하던지, 절대 변수에 null값이 저장되지 않도록 미리 조치를 취해주어야 한다.
		 * 
		 * java 1.5 이전에는 switch 문으로 문자열의 조건을 처리할 수 없었다.
		 * 
		 * switch는 변수가 숫자형 일경우에 만 사용하는 것이 오류를 막고 깔끔한 코드가 될 수 있다.
		 * switch는 문자열 변수를 담을 경우 if문보다 처리속도가 매우 느리다. if문이 switch문 보다 더 깔끔하게 처리가능하다.
		 */
		if (menu != null) {
			switch (menu) {
			case "1":
				System.out.println("1");
				break;
			case "2":
				System.out.println("2");
				break;
			case "3":
				System.out.println("3");
				break;
			case "4":
				System.out.println("4");
				break;
			case "5":
				System.out.println("5");
				break;
			default:
				System.out.println("모르겟음");
			}
		}
	}

}
