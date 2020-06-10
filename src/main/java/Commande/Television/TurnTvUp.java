package Commande.Television;

public class TurnTvUp implements Command {

	ElectronicDevice theDevice;
	
	public TurnTvUp(ElectronicDevice newDevice){
		
		theDevice = newDevice;
		
	}
	
	public void execute() {
		
		theDevice.volumeUp();
		
	}

	public void undo() {
		
		theDevice.volumenDown();
		
	}
	
}