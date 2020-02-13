package generic_Lab;
/**A bank account  has a balance that can be changed by deposit and withdrawals **/

public class BankAccount implements Measurable{
	private double Balance;
	/**construct a Bank Account with zero balance **/
	public BankAccount() {
		Balance=0;
	}
	/**Construct a Bank account with a given balance @param initialBalance the initial Balance **/
   public BankAccount(double initialBalance) {
	   Balance=initialBalance;
   }
   /**Deposit money into the bank Account @param amount  the amount to deposit**/
   public void deposit (double amount) {
	   double newBalance=Balance+amount;
	   Balance=newBalance;
   }
   /** Withdrawal money from the Bank account @param amount the account to withdrawal**/
   public void withdrawal (double amount) {
	   double newBalance=Balance-amount;
	   Balance=newBalance;
   }
   /**get the current balance of the Bank account @param return the current balance**/
public double getBalance() {
	return Balance;
}
@Override
public double getMeasure() {
	// TODO Auto-generated method stub
	return Balance;
}
}

