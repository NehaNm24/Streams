
public class Parked_CarOwner_Details {
	
	private String ownerName;
	private String CarModel;
	private int CarNo;
	private long MobileNo;
	private String Address;
	
	public Parked_CarOwner_Details(String ownerName, String carModel, int carNo, long mobileNo, String address) {
		super();
		this.ownerName = ownerName;
		CarModel = carModel;
		CarNo = carNo;
		MobileNo = mobileNo;
		Address = address;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCarModel() {
		return CarModel;
	}

	public void setCarModel(String carModel) {
		CarModel = carModel;
	}

	public int getCarNo() {
		return CarNo;
	}

	public void setCarNo(int carNo) {
		CarNo = carNo;
	}

	public long getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Parked_CarOwner_Details [ownerName=" + ownerName + ", CarModel=" + CarModel + ", CarNo=" + CarNo
				+ ", MobileNo=" + MobileNo + ", Address=" + Address + "]";
	}

	
}
