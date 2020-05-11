package Quiz.Horstman6_2;

/**
  A class for modeling employees who have a name and a salary
*/
public class Employee
{
   /**
      Constructs an Employee object
      @param aName the employee's name
   */
   public Employee(String aName)  { name = aName; }

   /**
      Sets the Employee's salary
      @param aSalary the new salary
   */
   public void setSalary(double aSalary) { salary = aSalary; }

   /**
      Returns the Employee's name
      @return the Employee's name
   */
   public String getName() { return name; }

   /**
      Returns the Employee's salary
      @return the Employee's salary
   */
   public double getSalary() { return salary; }

   private String name;
   private double salary;

}
