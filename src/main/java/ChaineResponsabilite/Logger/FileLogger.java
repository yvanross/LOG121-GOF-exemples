package ChaineResponsabilite.Logger;

public class FileLogger extends AbstractLogger {

  public FileLogger(int level){
     this.level = level;
  }

  
  /** 
   * @param message
   */
  @Override
  protected void write(String message) {		
     System.out.println("File::Logger: " + message);
  }
}
