package Proxy.Atm;

public class TestATMMachine {

    public static void main(final String[] args) throws Exception {

      final ATMMachine atmMachine = new ATMMachine();
       atmMachine.insertCard();
       atmMachine.insertPin(1234);
       atmMachine.depositCash(2000);
       atmMachine.requestCash(1000);
      // //  atmMachine.ejectCard();
      System.out.println("cash in atmMachine: " +  atmMachine.getCashInMachine());
      atmMachine.requestCash(1500);



     final ATMProxy atmProxy = new ATMProxy(atmMachine);
     System.out.println("Using proxy");
     System.out.println("cash in atmProxy: " +  atmProxy.getCashInMachine());
     atmProxy.requestCash(1500);
     System.out.println("cash in atmProxy: " +  atmProxy.getCashInMachine());
		  atmProxy.requestCash(250);
      System.out.println("cash in atmProxy: " +  atmProxy.getCashInMachine());
    
      atmProxy.ejectCard();

      atmProxy.depositCash(100);
		// System.out.println("\nCurrent ATM State " + atmProxy.getATMState());
		
		// System.out.println("\nCash in ATM Machine $" + atmProxy.getCashInMachine());
		
		// The user can't perform this action because ATMProxy doesn't
		// have access to that potentially harmful method
		// atmProxy.setCashInMachine(10000);
		
	}
	
}