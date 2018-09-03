import java.util.Scanner;

public class ParkMain {

	public static void main(String[] args) {
		Parked_CarOwner_Details pcar;
		Scanner sc=new Scanner(System.in); 
		// String ownerName, String carModel, int carNo, long mobileNo, String address
		System.out.println("Enter car details :");
		System.out.println("Enter Owner Name :");
		String name=sc.next();
		System.out.println("Enter carModel :");
		String cmdl=sc.next();
		System.out.println("Enter Car No. :");
		int cno=sc.nextInt();
		System.out.println("Enter mobileNo.");
		long phn=sc.nextLong();
		System.out.println("Enter Address :");
		String address=sc.next();
		pcar=new Parked_CarOwner_Details(name, cmdl, cno, phn, address);
		System.out.println(pcar);
		Parked_CarOwnerList plist = new Parked_CarOwnerList();
		System.out.println(plist.add_new_car(pcar));
		plist.get_parked_car_location(pcar);
		
		

	}

}
