#Exercice 6.2 du livre de Horstman

Écrivez les sous-classes **HourlyEmployee** et **SalariedEmployee** à partir de la classe **Employee** fournie plus bas.

Assurez-vous de fournir les constructeurs suivants :
```java
HourlyEmployee(String aName, double anHourlySalary)
SalariedEmployee(String aName, double anAnnualSalary)
```

Écrivez la méthode **getWeeklySalary()**. Faites l’hypothèse qu’un employé payé à l’heure travail 40 heures par semaines, et un employé salarié est payé le 1/52 de son salaire annuel par semaine. 

Dessinez le diagramme de classe.
```java
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
```