import com.ey.bank.AccountsFactory;
import com.ey.bank.BalanceException;
import com.ey.bank.Bank;

public class Test2Accounts {

	public static void main(String[] args) {

//        Accounts a1 = new Accounts("Polo", 5000);

//        a1.summary();

//

//        a1.deposit(1000);

//        a1.summary();

//

//        a1.withdraw(3000);

//        a1.summary();

//

//        a1.withdraw(4000);

//        Accounts a2 = new Accounts("Polo", 5000);

//        a2.summary();

		// Saving s1 = new Saving("Polo");

		// s1.summary();

		// s1.withdraw(1);

		// s1.deposit(1000);

		// s1.summary();

		// Bank c1 = new current("sam");
		// c1.summary();

		// c1.withdraw(36000);
		// c1.withdraw(6000);
		// c1.summary();

		// c1.deposit(2000);
		// c1.deposit(5000);
		// c1.summary();

		// AccountsFactory factory = new AccountsFactory();
		// Bank c1 = AccountsFactory.createCurrentAccount("Sam");
		// c1.summary();

		// Bank s1 = factory.createSavingAccount("Ben");
		Bank s1 = AccountsFactory.createSavingAccount("Ben");
		s1.deposit(3000);
		try {
			s1.withdraw(1000);
		} catch (BalanceException e) {
			e.printStackTrace();
//          e.printStackTrace(); // Developers : Troubleshoot the issues
//			System.out.println(e);//Logging : To audit system behavior
			System.out.println(e.getMessage());
		}
		s1.deposit(5000);
		try {
			s1.withdraw(4000);
		} catch (BalanceException e) {
			e.printStackTrace();
		}
		s1.statement();
	}

}
