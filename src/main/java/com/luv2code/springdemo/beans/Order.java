package com.luv2code.springdemo.beans;

import java.util.LinkedHashMap;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.custom.validation.ProductCode;

/*import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;*/

public class Order {
	
	@NotNull(message = "is required")
	@Size(min = 1,message = "min 1 character")
	private String product;
	
	@ProductCode(value = "PRO",message = "should start with PRO" )
	private String productCode;
	
	
	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	@NotNull(message="is required")
	@Min(value = 1,message = "min 1")
	@Max(value = 5,message ="max allowed value is 5")
	private Integer quantity;
	private double price;
	private String addressType;
	private String paymentType;
	private String coupon;
	private List<String> giftOptions;
	
	@NotNull(message="is required")
	@Pattern(regexp="^[a-zA-z0-9]{5}", message="Required 5 characters.No special character")
	private String pincode;
	
	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public List<String> getGiftOptions() {
		return giftOptions;
	}

	public void setGiftOptions(List<String> giftOptions) {
		this.giftOptions = giftOptions;
	}

	public String getCoupon() {
		return coupon;
	}

	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}
	//Ordered pair of unique values
	private LinkedHashMap<String, String> paymentOptions;
	
	public Order() {
		paymentOptions = new LinkedHashMap<String, String>();
		paymentOptions.put("Card", "Debit/Credit Card");
		paymentOptions.put("Netbanking", "Internet Banking");
		paymentOptions.put("COD", "Cash On Delivery");
	}
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public LinkedHashMap<String, String> getPaymentOptions() {
		return paymentOptions;
	}
	public void setPaymentOptions(LinkedHashMap<String, String> paymentOptions) {
		this.paymentOptions = paymentOptions;
	}
	
	
}
