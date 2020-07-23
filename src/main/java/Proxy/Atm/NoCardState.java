package Proxy.Atm;

public class NoCardState implements ATMState {
  
GetATMData getAtmData = null;

public NoCardState(final GetATMData data){
  getAtmData = data;
}

@Override
  public void insertCard() {
   System.out.println("NoCard insert card");
    this.getAtmData.setATMState(new HasCardState(getAtmData));
  }

  @Override
  public void ejectCard() throws Exception {
   throw new Exception("Cannot eject because threre is no card");
  }

  @Override
  public void insertPin(final int pinEntered) throws Exception {
    throw new Exception("card is missing");
  }

  @Override
  public void requestCash(final int cashToWithdraw) throws Exception {
    throw new Exception("card is missing");

  }

  @Override
  public void depositCash(final int castDeposit) throws Exception {
    throw new Exception("card is missing");

  }
}
