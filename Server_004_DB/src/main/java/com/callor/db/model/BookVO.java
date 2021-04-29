package com.callor.db.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// lombok를 사용할때 @Datas는 가급적 사용하지 말것
@Data


@Getter
@Setter
@ToString

// 모든 변수를 매개변수로 값는 생성자
@AllArgsConstructor

// 기본생성자
@NoArgsConstructor
public class BookVO {
	//DB와 연동하는 프로젝트에서는 코딩의 혼란을 줄이기 위해서 snake case로 VO변수를 선언한다.
	private String bk_isbn;
	private String bk_title; // bkTitle = bk_title
	private String bk_code;
	private String bk_acode;
	private String bk_date;
	
	public String getBk_isbn() {
		return bk_isbn;
	}
	public void setBk_isbn(String bk_isbn) {
		this.bk_isbn = bk_isbn;
	}
	public String getBk_title() {
		return bk_title;
	}
	public void setBk_title(String bk_title) {
		this.bk_title = bk_title;
	}
	public String getBk_code() {
		return bk_code;
	}
	public void setBk_code(String bk_code) {
		this.bk_code = bk_code;
	}
	public String getBk_acode() {
		return bk_acode;
	}
	public void setBk_acode(String bk_acode) {
		this.bk_acode = bk_acode;
	}
	public String getBk_date() {
		return bk_date;
	}
	public void setBk_date(String bk_date) {
		this.bk_date = bk_date;
	}
	public Integer getBk_price() {
		return bk_price;
	}
	public void setBk_price(Integer bk_price) {
		this.bk_price = bk_price;
	}
	public Integer getBk_pages() {
		return bk_pages;
	}
	public void setBk_pages(Integer bk_pages) {
		this.bk_pages = bk_pages;
	}
	//정수형 변수를 선언할때 Integer로 선언하면 0으로 초기값을 설정하자
	private Integer bk_price = 0;
	private Integer bk_pages = 0;

	@Override
	public String toString() {
		return "BookVO [bk_isbn=" + bk_isbn + ", bk_title=" + bk_title + ", bk_code=" + bk_code + ", bk_acode="
				+ bk_acode + ", bk_date=" + bk_date + ", bk_price=" + bk_price + ", bk_pages=" + bk_pages + "]";
	}
	
}
