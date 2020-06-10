package Commande;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import Commande.Stock.Broker;
import Commande.Stock.BuyStock;
import Commande.Stock.SellStock;
import Commande.Stock.Stock;
import Utils.OutStream;

public class stockTest extends OutStream {
  @Test
  public void demoTest() {
    Stock abcStock = new Stock();

    BuyStock buyStockOrder = new BuyStock(abcStock);
    SellStock sellStockOrder = new SellStock(abcStock);

    Broker broker = new Broker();
    broker.takeOrder(buyStockOrder);
    broker.takeOrder(sellStockOrder);

    broker.placeOrders();
 
    assertEquals("Stock [ Name: ABC, Quantity: 10 ] bought"+ System.lineSeparator() +
    "Stock [ Name: ABC, Quantity: 10 ] sold" + System.lineSeparator(), this.getOutput());
 }
}