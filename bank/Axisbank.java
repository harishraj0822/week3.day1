package axis.bank;

public class Axisbank extends BankInfo {
	
	public void deposit() {
		System.out.println("Overridding in deposit");
	}
	
	public static void main(String[] args) {
		
	   Axisbank m = new Axisbank();
	   m.deposit();
	}

}
