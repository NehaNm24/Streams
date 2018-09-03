import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;
import static java.util.Comparator.comparing;

public class BankAccountList {

	public static void main(String[] args) {
		List<BankAccount> bankAcc=new ArrayList<>();
		//int accNo, String accname, double accBalance
		bankAcc.add(new BankAccount(101, "Neha Nema", 5000000));
		bankAcc.add(new BankAccount(102, "Aishwarya Roy", 3500000));
		bankAcc.add(new BankAccount(103, "Lavina Murjani", 7500000));
		bankAcc.add(new BankAccount(104, "Meghna Mathew", 5000000));
		bankAcc.add(new BankAccount(105, "Priya", 4500000));
		bankAcc.add(new BankAccount(106, "Athira", 3500000));
		
		BankAccount maxBal=bankAcc.stream()
			      .max(comparing(BankAccount::getAccBalance))
			      .orElseThrow(NoSuchElementException::new);
		
		System.out.println("Account with the highest balance : "+maxBal.getAccname()+" with balance :"+ maxBal.getAccBalance());
		
		
	
		bankAcc.stream().filter((s) -> s.getAccname().startsWith("A"))
		.forEach(System.out :: println);
		
		BankAccount minBal=bankAcc.stream()
			      .min(comparing(BankAccount::getAccBalance))
			      .orElseThrow(NoSuchElementException::new);
		
		System.out.println("Account with the lowest balance : "+minBal.getAccname()+" with balance :"+ minBal.getAccBalance());
		
		
		BankAccount highBal=bankAcc.stream()
				.filter((s) -> s.getAccname().startsWith("A"))
			      .max(comparing(BankAccount::getAccBalance))
			      .orElseThrow(NoSuchElementException::new);
		
		System.out.println("Account holder name who’s name start with A and in that group highest account balance :");
		System.out.println(highBal.getAccname());	
		
		bankAcc.stream().sorted(comparing(BankAccount:: getAccBalance)).forEach(System.out:: println);

	}

}
