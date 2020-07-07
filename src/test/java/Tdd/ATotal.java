package Tdd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ATotal implements ITotal {
  List<ITotal> items = new ArrayList<ITotal>();

  public void addItem(ITotal item) {
		items.add(item);
  }
  
	public Double getTotal() {
		Iterator<ITotal> iterator = items.iterator();
		Double somme = 0.0;
		while(iterator.hasNext()){
			somme += iterator.next().getTotal();
		}
		return somme;
  }
  
}
