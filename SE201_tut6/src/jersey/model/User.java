package jersey.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	private int UserID;
	private String UserName;
	private String UserPhone;
	private String UserAddress;
	
	public User() {
		super();
	}
	public User(int userID, String userName, String userPhone, String userAddress) {
		super();
		UserID = userID;
		UserName = userName;
		UserPhone = userPhone;
		UserAddress = userAddress;
	}
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserPhone() {
		return UserPhone;
	}
	public void setUserPhone(String userPhone) {
		UserPhone = userPhone;
	}
	public String getUserAddress() {
		return UserAddress;
	}
	public void setUserAddress(String userAddress) {
		UserAddress = userAddress;
	}
	

}
