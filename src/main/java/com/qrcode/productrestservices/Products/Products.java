package com.qrcode.productrestservices.Products;

public class Products {

	String Product_Id;
	String Product_Name;
	String Product_Type;
	String Product_Brand;
	String Product_Description;
	Double Product_Price;
	int Product_Size;
	String Product_Category;
	String Product_Color;
	String Image_URL;
	String Promotion_Details;

	public Products() {

	}

	public Products(String product_Id, String product_Name, String product_Type, String product_Brand,
			String product_Description, Double product_Price, int product_Size, String product_Category,
			String product_Color, String image_URL, String promotion_Details) {
		super();
		Product_Id = product_Id;
		Product_Name = product_Name;
		Product_Type = product_Type;
		Product_Brand = product_Brand;
		Product_Description = product_Description;
		Product_Price = product_Price;
		Product_Size = product_Size;
		Product_Category = product_Category;
		Product_Color = product_Color;
		Image_URL = image_URL;
		Promotion_Details = promotion_Details;
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

	public String getProduct_Type() {
		return Product_Type;
	}

	public void setProduct_Type(String product_Type) {
		Product_Type = product_Type;
	}

	public String getProduct_Brand() {
		return Product_Brand;
	}

	public void setProduct_Brand(String product_Brand) {
		Product_Brand = product_Brand;
	}

	public String getProduct_Description() {
		return Product_Description;
	}

	public void setProduct_Description(String product_Description) {
		Product_Description = product_Description;
	}

	public Double getProduct_Price() {
		return Product_Price;
	}

	public void setProduct_Price(Double product_Price) {
		Product_Price = product_Price;
	}

	public int getProduct_Size() {
		return Product_Size;
	}

	public void setProduct_Size(int product_Size) {
		Product_Size = product_Size;
	}

	public String getProduct_Category() {
		return Product_Category;
	}

	public void setProduct_Category(String product_Category) {
		Product_Category = product_Category;
	}

	public String getProduct_Color() {
		return Product_Color;
	}

	public void setProduct_Color(String product_Color) {
		Product_Color = product_Color;
	}

	public String getImage_URL() {
		return Image_URL;
	}

	public void setImage_URL(String image_URL) {
		Image_URL = image_URL;
	}

	public String getPromotion_Details() {
		return Promotion_Details;
	}

	public void setPromotion_Details(String promotion_Details) {
		Promotion_Details = promotion_Details;
	}

}
