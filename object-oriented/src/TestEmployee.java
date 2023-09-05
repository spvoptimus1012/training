import com.ey.emp.Clerk;
import com.ey.emp.Employee;
import com.ey.emp.Manager;

public class TestEmployee {

public static void main(String[] args) {

    //Employee e1 = null;//new Employee("Polo", 4000);

    //e1.payslip();

    //System.out.println("Salary: "+e1.getSalary());

    //Employee e2 = null; //new Employee("Lili", 4000);

    // e2.payslip();
     
    Manager m1 = new Manager ("Mike", 5000, 2000);
   // m1.payslip();
   
    Clerk c1 = new Clerk("Ben", 3000, 1200);
   // c1.payslip();
   
    
    showSalary(m1);
    showSalary(c1);

}
//overloading
///private static void showSalary(Clerk c1) {
	// TODO Auto-generated method stub
	// System.out.println("Clerk Salary: "+ c1.getSalary());
//}

//private static void showSalary(Manager m1) {
	// TODO Auto-generated method stub
	 //System.out.println("Manager Salary: " + m1.getSalary());
//}
private static void showSalary(Employee e) {
	if(e instanceof Manager)
		System.out.println("Manager Salary: " + e.getSalary());
	else
		System.out.println("Clerk Salary: " + e.getSalary());
         }
}