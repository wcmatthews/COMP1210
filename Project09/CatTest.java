import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** Test Class for Cat. */
public class CatTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** A Test of getters. */
   @Test public void gettersTest() {
      
      Cat c = new Cat("Barb Jones", "Callie", "Siamese", 9.0, 7, 9);
      
      Assert.assertEquals("getOwner test",
                           "Barb Jones", c.getOwner());
      Assert.assertEquals("getName test",
                           "Callie", c.getName());
      Assert.assertEquals("getBreed test",
                           "Siamese", c.getBreed());
      Assert.assertEquals("getWeight test",
                           9.0, c.getWeight(), .0001);
      Assert.assertEquals("getDays test",
                           7, c.getDays(), .0001);
      Assert.assertEquals("getLivesLeft test",
                           9, c.getLivesLeft(), .0001);
   }
   
   /** A test of setters. */
   @Test public void settersTest() {
      
      Cat c = new Cat("Barb Jones", "Callie", "Siamese", 9.0, 7, 9);
      
      c.setOwner("Bob");
      Assert.assertEquals("setOwner test",
                         "Bob", c.getOwner());
      
      c.setName("Test");
      Assert.assertEquals("setName test",
                           "Test", c.getName());
      
      c.setBreed("Tabby");
      Assert.assertEquals("setBreed test",
                           "Tabby", c.getBreed());
      
      c.setWeight(5.0);
      Assert.assertEquals("setWeight test",
                           5.0, c.getWeight(), .0001);
      
      c.setDays(5);
      Assert.assertEquals("setDays test",
                        5, c.getDays(), .0001);
      
      c.setLivesLeft(7);
      Assert.assertEquals("setLivesLeft test",
                        7, c.getLivesLeft(), .0001);
   }
   
   /** A test for getCount(). */
   @Test public void getCountTest() {
      
      Cat.resetCount();
      
      Cat c = new Cat("Barb Jones", "Callie", "Siamese", 9.0, 7, 9);
      
      Assert.assertEquals("getCount test",
                        1, c.getCount(), .0001);
   }
   
   /** A test for boardingCost(). */
   @Test public void boardingCostTest() {
      
      Cat c = new Cat("Barb Jones", "Callie", "Siamese", 9.0, 7, 9);
      
      Assert.assertEquals("boardingCost test",
                        76.3, c.boardingCost(), .0001);
   } 
   
   /** A test for toString(). */
   @Test public void toStringTest() {
      
      Cat c = new Cat("Barb Jones", "Callie", "Siamese", 9.0, 7, 9);
      
      Assert.assertEquals("toString test",
                        true, c.toString()
                              .contains("Lives Left"));
   }
}
