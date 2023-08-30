
public class commandlinesemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
for (String a : args) {
	System.out.println(a);
	sum = sum+ Integer.parseInt(a);
}
System.out.println(sum);
	}

}
