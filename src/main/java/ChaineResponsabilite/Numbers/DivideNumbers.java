package ChaineResponsabilite.Numbers;

public class DivideNumbers implements Chain{

	private  Chain nextInChain = null;
	
	@Override
	public void setNextChain(Chain nextChain) {
		nextInChain = nextChain;
	}

	@Override
	public void calculate(Numbers request) {
		
		if(request.getCalcWanted() == "div"){
			
			System.out.print(request.getNumber1() + " / " + request.getNumber2() + " = "+
					(request.getNumber1()/request.getNumber2()));
			
		} else {
		
			if (nextInChain != null)
				nextInChain.calculate(request);

			System.out.print("Only works for add, sub, mult, and div");
			
		}
	}
}