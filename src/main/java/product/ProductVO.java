package product;

import java.sql.Date;

public class ProductVO {
	private int pNum; // 상품번호(PK)
	private int cateNum; // 카테고리(FK)
	private String pName; // 상품명
	private int fixPrice; // 정가
	private int selPrice; // 판매가
	private Date rDate; // 등록일
	private String rePerson; // 게임인원
	private int reAge; // 게임연령
	private String brand; // 브랜드
	private String pImg; // 상품 사진 url
	private String infoImg; // 상품 상세정보 url
	private int productCnt; // 재고
	private int lowNum; // JAVA에서만 저장용으로 사용하는 데이터 : 최저 연령
	private int highNum; // JAVA에서만 저장용으로 사용하는 데이터 : 최고 연령

	public int getpNum() {
		return pNum;
	}

	public void setpNum(int pNum) {
		this.pNum = pNum;
	}

	public int getCateNum() {
		return cateNum;
	}

	public void setCateNum(int cateNum) {
		this.cateNum = cateNum;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getFixPrice() {
		return fixPrice;
	}

	public void setFixPrice(int fixPrice) {
		this.fixPrice = fixPrice;
	}

	public int getSelPrice() {
		return selPrice;
	}

	public void setSelPrice(int selPrice) {
		this.selPrice = selPrice;
	}

	public Date getrDate() {
		return rDate;
	}

	public void setrDate(Date rDate) {
		this.rDate = rDate;
	}

	public String getRePerson() {
		return rePerson;
	}

	public void setRePerson(String rePerson) {
		this.rePerson = rePerson;
	}

	public int getReAge() {
		return reAge;
	}

	public void setReAge(int reAge) {
		this.reAge = reAge;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpImg() {
		return pImg;
	}

	public void setpImg(String pImg) {
		this.pImg = pImg;
	}

	public String getInfoImg() {
		return infoImg;
	}

	public void setInfoImg(String infoImg) {
		this.infoImg = infoImg;
	}

	public int getProductCnt() {
		return productCnt;
	}

	public void setProductCnt(int productCnt) {
		this.productCnt = productCnt;
	}

	public int getLowNum() {
		return lowNum;
	}

	public void setLowNum(int lowNum) {
		this.lowNum = lowNum;
	}

	public int getHighNum() {
		return highNum;
	}

	public void setHighNum(int highNum) {
		this.highNum = highNum;
	}

}