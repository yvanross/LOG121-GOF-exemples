package PatronStrategie.Comparator;
//import PatronStrategie.Comparator.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.time.LocalDate;
import org.junit.Test;

public class EmployeTest {

    @Test 
    public void create(){
    final Employe employe = new Employe("Gendron", "Yves",     LocalDate.of(1990, 10, 18), LocalDate.of(2015,  2, 28),  40000.0);
    assertEquals("Yves",employe.getPrenom());
    assertEquals("Gendron",employe.getNom());
    assertEquals("1990-10-18",employe.getDateNaissance().toString());
    assertEquals("2015-02-28",employe.getDateEmbauche().toString());
    //assertEquals(123.0,employe.getSalaire());
    }

    @Test
    public void entete(){
        String entete = Employe.getEntete();
        assertTrue(entete.contains("Nom"));
        assertTrue(entete.contains("Prénom"));
        assertTrue(entete.contains("Date Naissance"));
        assertTrue(entete.contains("Date Embauche"));
        assertTrue(entete.contains("Salaire"));
        assertTrue(entete.contains("--------"));
    }
}