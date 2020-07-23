package Proxy.Atm;

// In this situation the proxy both creates and destroys
// an ATMMachine Object
public class ATMProxy implements  ATMState, GetATMData {

  ATMMachine atmMachine = null;

  // Allows the user to access getATMState in the
  // Object ATMMachine
  public ATMProxy(ATMMachine machine) {
    atmMachine = machine;
  }

  public ATMState getATMState() {
    return atmMachine.getATMState();
  }

  public void setATMState(ATMState state) {
     atmMachine.setATMState(state);
  }
  // Allows the user to access getCashInMachine
  // in the Object ATMMachine

  public int getCashInMachine() {
    return atmMachine.getCashInMachine();
  }

  @Override
  public void insertCard() {
    try {
      atmMachine.insertCard();
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }

  @Override
  public void ejectCard() {
    try {
      atmMachine.ejectCard();
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }

  }

  @Override
  public void insertPin(int pinEntered) {
    try {
      atmMachine.insertPin(pinEntered);
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }

  }

  @Override
  public void requestCash(int cashToWithdraw) {
    System.out.println("ATMproxy withdraw: " + cashToWithdraw);
    try {
     if (atmMachine.getCashInMachine() < cashToWithdraw){
       int amount = cashToWithdraw - atmMachine.getCashInMachine();
        System.out.println("Not enough cash - take it from credit margin:" + amount);
        this.depositCash(amount);
     }
      atmMachine.requestCash(cashToWithdraw);
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }

  }

  @Override
  public void depositCash(int castDeposit) {
    try {
      long startTime = System.nanoTime();
      atmMachine.depositCash(castDeposit);
      long endTime = System.nanoTime();
      long duration = (endTime - startTime);
      System.out.println("Deposit duration of " + duration + " NanoSeconds");
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }

  @Override
  public void withdraw(int cashToWithdraw) throws Exception {
   atmMachine.withdraw(cashToWithdraw);

  }

  @Override
  public void deposit(int cashDeposit) {
   atmMachine.deposit(cashDeposit);

  }

}