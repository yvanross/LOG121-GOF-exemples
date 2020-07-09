package Facade.Bank;

public class TestBankAccount {
	
	public static void main(String[] args){
		
		BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);
		accessingBank.depositCash(1000.00);	

		accessingBank.withdrawCash(50.00);
		
		accessingBank.withdrawCash(990.00);

	}
	
}