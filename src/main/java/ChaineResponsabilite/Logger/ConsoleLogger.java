package ChaineResponsabilite.Logger;

public class ConsoleLogger extends AbstractLogger {

  public ConsoleLogger(int level){
     this.level = level;
  }

  
  /** 
   * @param message
   */
  @Override
  protected void write(String message) {		
     System.out.println("Standard Console::Logger: " + message);
  }
}