package Proxy.Atm;

public class HasPinState implements ATMState {
  GetATMData getAtmData = null;

  public HasPinState(final GetATMData data){
    getAtmData = data;
  }

  @Override
  public void insertCard() throws Exception {
   throw new Exception("Card already in");

  }

  @Override
  public void ejectCard() {
   this.getAtmData.setATMState(new NoCardState(this.getAtmData));

  }

  @Override
  public void insertPin(int pinEntered) throws Exception {
   throw new Exception("Pin already entered");

  }

  @Override
  public void requestCash(int cashToWithdraw) throws Exception {
    this.getAtmData.withdraw(cashToWithdraw);

  }

  @Override
  public void depositCash(int cashDeposit) throws Exception {
 this.getAtmData.deposit(cashDeposit);

  }
}
