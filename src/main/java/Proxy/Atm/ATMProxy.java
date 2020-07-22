package Proxy.Atm;

// In this situation the proxy both creates and destroys
// an ATMMachine Object
public class ATMProxy implements GetATMData {

	// Allows the user to access getATMState in the 
	// Object ATMMachine

	public ATMState getATMState() {
		
    // convertir en injection de dépendance.
    final ATMMachine realATMMachine = new ATMMachine();

      return realATMMachine.getATMState();
    }

    // Allows the user to access getCashInMachine
    // in the Object ATMMachine

    public int getCashInMachine() {

      final ATMMachine realATMMachine = new ATMMachine();

      return realATMMachine.getCashInMachine();

    }

  }