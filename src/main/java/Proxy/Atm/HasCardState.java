package Proxy.Atm;

public class HasCardState implements ATMState {
  GetATMData getAtmData = null;

  public HasCardState(final GetATMData data){
    getAtmData = data;
  }

  @Override
  public void insertCard() throws Exception {
   throw new Exception("Card is already in");

  }

  @Override
  public void ejectCard() {
    System.out.println("HasCardStarte -> Eject card");
   this.getAtmData.setATMState(new NoCardState(getAtmData));

  }

  @Override
  public void insertPin(final int pinEntered) {
    System.out.println("HasCardStarte -> insert Pin: Valid");
   this.getAtmData.setATMState(new HasPinState(getAtmData));

  }

  @Override
  public void requestCash(final int cashToWithdraw) throws Exception {
   throw new Exception("Pin is missing");
  }

  @Override
  public void depositCash(final int castDeposit) throws Exception {
    throw new Exception("Pin is missing");

  }
}
