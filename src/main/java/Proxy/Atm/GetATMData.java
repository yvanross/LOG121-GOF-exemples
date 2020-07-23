package Proxy.Atm;

// This interface will contain just those methods
// that you want the proxy to provide access to

public interface GetATMData
{
  public void setATMState(ATMState state);
  public ATMState getATMState();
  public void withdraw(int cashToWithdraw) throws Exception;
  public void deposit(int castDeposit);
  public int getCashInMachine();
  }