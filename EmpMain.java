import java.util.ArrayList;
import java.util.List;
import static java.util.Comparator.comparing;


public class EmpMain {

	public static void main(String[] args) {
		ArrayList<Employee> empList= new ArrayList<>();
		empList.add(new Employee(1,"Onkar","Trainer",50000,10));
		empList.add(new Employee(2,"Amit","Admin",30000,20));
		empList.add(new Employee(3,"Rahul","HR",40000,30));
		empList.add(new Employee(4,"Ajay","Trainer",55000,10));
		empList.add(new Employee(5,"Kiran","Admin",35000,20));
		empList.add(new Employee(6,"Kumar","HR",40500,30));
		empList.add(new Employee(7,"Ajit","CEO",500000,100));
		empList.add(new Employee(8,"Laxman","Trainer",350000,10));
		
		
		empList.stream().filter(s -> s.getSalary()> 20000)
		.filter(d -> d.getDeptNo()== 10)
		.sorted(comparing(Employee :: getSalary))
		.forEach(System.out :: println);

	}

}
