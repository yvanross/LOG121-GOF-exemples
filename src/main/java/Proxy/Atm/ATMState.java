package Proxy.Atm;

public interface ATMState {
	
	void insertCard() throws Exception;
	void ejectCard() throws Exception;
	void insertPin(int pinEntered) throws Exception;
	void requestCash(int cashToWithdraw) throws Exception;
	void depositCash(int castDeposit) throws Exception;
	
}