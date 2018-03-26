import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** Test Class for Dog. */
public class DogTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A Test of getters. */
   @Test public void gettersTest() {
      
      Dog d = new Dog("Jake Smith", "Honey", "Great Dane", 60, 7);
      
      Assert.assertEquals("getOwner test",
                           "Jake Smith", d.getOwner());
      Assert.assertEquals("getName test",
                           "Honey", d.getName());
      Assert.assertEquals("getBreed test",
                           "Great Dane", d.getBreed());
      Assert.assertEquals("getWeight test",
                           60, d.getWeight(), .0001);
      Assert.assertEquals("getDays test",
                           7, d.getDays(), .0001);
   }
   
   /** A test of setters. */
   @Test public void settersTest() {
      
      Dog d = new Dog("Jake Smith", "Honey", "Great Dane", 60, 7);
      
      d.setOwner("Bob");
      Assert.assertEquals("setOwner test",
                         "Bob", d.getOwner());
      
      d.setName("Test");
      Assert.assertEquals("setName test",
                           "Test", d.getName());
      
      d.setBreed("Lab");
      Assert.assertEquals("setBreed test",
                           "Lab", d.getBreed());
      
      d.setWeight(50);
      Assert.assertEquals("setWeight test",
                           50, d.getWeight(), .0001);
      
      d.setDays(5);
      Assert.assertEquals("setDays test",
                        5, d.getDays(), .0001);
      
   }
   
   /** A test for getCount(). */
   @Test public void getCountTest() {
      
      Dog.resetCount();
      
      Dog d = new Dog("Jake Smith", "Honey", "Great Dane", 60, 7);
      
      Assert.assertEquals("getCount test",
                        1, d.getCount(), .0001);
   }
   
   /** A test for boardingCost(). */
   @Test public void boardingCostTest() {
      
      Dog d = new Dog("Jake Smith", "Honey", "Great Dane", 60, 7);
      
      Assert.assertEquals("boardingCost test",
                        105.0, d.boardingCost(), .0001);
   } 
   
   /** A test for toString(). */
   @Test public void toStringTest() {
      
      Dog d = new Dog("Jake Smith", "Honey", "Great Dane", 60, 7);
      
      Assert.assertEquals("toString test",
                        true, d.toString()
                              .contains("Great Dane"));
   }
}


