package Proxy.Atm;


// This interface will contain just those methods
// that you want the proxy to provide access to
public class ATMMachine implements GetATMData{
	
ATMState hasCard;
ATMState noCard;
ATMState hasCorrectPin;
ATMState atmOutOfMoney;

ATMState atmState;

int cashInMachine = 2000;
boolean correctPinEntered = false;

public ATMMachine() {

	// hasCard = new HasCard(this);
	// noCard = new NoCard(this);
	// hasCorrectPin = new HasPin(this);
	// atmOutOfMoney = new NoCash(this);
	// atmState = noCard;

	// if(cashInMachine < 0){
	// 	atmState.insertPin(pinEntered);
	// }
}


	public ATMState getYesCardState() { return hasCard; }
	public ATMState getNoCardState() { return noCard; }
	public ATMState getHasPin() { return hasCorrectPin; }
	public ATMState getNoCashState() { return atmOutOfMoney; }
	
	// NEW STUFF
	
	public ATMState getATMState() { return atmState; }
	public int getCashInMachine() { return cashInMachine; }


	public void insertCard() {
		System.out.println("Insert card");
	}
}