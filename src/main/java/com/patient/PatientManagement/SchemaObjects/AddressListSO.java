package com.patient.PatientManagement.SchemaObjects;

public class AddressListSO {
	
	private String address_line1;
	private String address_line2;
	
	private String state;
	
	private String country;
	
	private String pincode;

	/**
	 * @return the address_line1
	 */
	public String getAddress_line1() {
		return address_line1;
	}

	/**
	 * @param address_line1 the address_line1 to set
	 */
	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	/**
	 * @return the address_line2
	 */
	public String getAddress_line2() {
		return address_line2;
	}

	/**
	 * @param address_line2 the address_line2 to set
	 */
	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the pincode
	 */
	public String getPincode() {
		return pincode;
	}

	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	

}
