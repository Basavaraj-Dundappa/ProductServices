package com.qrcode.productrestservices.Items;

public class Items {

	String Product_Id;
	String Product_Name;
	String Product_Brand;
	Double Product_Price;
	String Image_URL;

	public Items() {

	}

	public Items(String product_Id, String product_Name, String product_Brand, Double product_Price, String image_URL) {
		super();
		Product_Id = product_Id;
		Product_Name = product_Name;
		Product_Brand = product_Brand;
		Product_Price = product_Price;
		Image_URL = image_URL;
	}

	public String getProduct_Id() {
		return Product_Id;
	}

	public void setProduct_Id(String product_Id) {
		Product_Id = product_Id;
	}

	public String getProduct_Name() {
		return Product_Name;
	}

	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}

	public String getProduct_Brand() {
		return Product_Brand;
	}

	public void setProduct_Brand(String product_Brand) {
		Product_Brand = product_Brand;
	}

	public Double getProduct_Price() {
		return Product_Price;
	}

	public void setProduct_Price(Double product_Price) {
		Product_Price = product_Price;
	}

	public String getImage_URL() {
		return Image_URL;
	}

	public void setImage_URL(String image_URL) {
		Image_URL = image_URL;
	}

}
