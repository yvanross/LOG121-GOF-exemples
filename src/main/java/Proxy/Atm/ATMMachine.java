package Proxy.Atm;

// This interface will contain just those methods
// that you want the proxy to provide access to
public class ATMMachine implements ATMState, GetATMData {

	ATMState atmState;

	int cashInMachine = 0;
	boolean correctPinEntered = false;

	public ATMMachine() {
		atmState = new NoCardState(this);
		System.out.println("Initial atm state: " + atmState);
	}

	public ATMState getATMState() {
		return atmState;
	}

	public void setATMState(final ATMState state) {
		System.out.println("ATMMachine setState: " + state);
		this.atmState = state;
	}


	public void insertCard() throws Exception {
		System.out.println("ATMMachine Insert card");
		getATMState().insertCard();
	}

	@Override
	public void ejectCard() throws Exception {
		System.out.println("ATMMachine eject card");
		getATMState().ejectCard();
	}

	@Override
	public void insertPin(final int pinEntered) throws Exception {
		System.out.println("ATMMachine insertPin: " + pinEntered);
		getATMState().insertPin(pinEntered);
	}

	@Override
	public void requestCash(final int cashToWithdraw) {
		System.out.println("ATMMachine requestCash: " + cashToWithdraw);
		try {
			getATMState().requestCash(cashToWithdraw);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void depositCash(final int cashDeposit) {
		System.out.println("ATMMachine depositCash: " + cashDeposit);

		try {
			getATMState().depositCash(cashDeposit);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void withdraw(int cashToWithdraw) throws Exception {
		if(cashToWithdraw > cashInMachine)
			throw new Exception("Not enough cash in account");

		System.out.println("ATMMachine withdraw: " + cashToWithdraw);
		cashInMachine -= cashToWithdraw;

	}

	@Override
	public void deposit(int cashDeposit) {
		System.out.println("ATMMachine deposit: " + cashDeposit);
		cashInMachine += cashDeposit;
	}

	public int getCashInMachine(){
		return cashInMachine;
	}
}