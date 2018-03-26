import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** Test class for Horse. */
public class HorseTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** A Test of getters. */
   @Test public void gettersTest() {
      
      Horse h = new Horse("Jessie Rider", "King", "Quarter horse",
                            1000, 7, 10.0);
            
      Assert.assertEquals("getOwner test",
                           "Jessie Rider", h.getOwner());
      Assert.assertEquals("getName test",
                           "King", h.getName());
      Assert.assertEquals("getBreed test",
                           "Quarter horse", h.getBreed());
      Assert.assertEquals("getWeight test",
                           1000, h.getWeight(), .0001);
      Assert.assertEquals("getDays test",
                           7, h.getDays(), .0001);
      Assert.assertEquals("getExerciseFee",
                        10.0, h.getExerciseFee(), .0001);
   }
   
   /** A test of setters. */
   @Test public void settersTest() {
      
      Horse h = new Horse("Jessie Rider", "King", "Quarter horse",
                            1000, 7, 10.0);
      
      h.setOwner("Bob");
      Assert.assertEquals("setOwner test",
                         "Bob", h.getOwner());
      
      h.setName("Test");
      Assert.assertEquals("setName test",
                           "Test", h.getName());
      
      h.setBreed("Paint");
      Assert.assertEquals("setBreed test",
                           "Paint", h.getBreed());
      
      h.setWeight(500);
      Assert.assertEquals("setWeight test",
                           500, h.getWeight(), .0001);
      
      h.setDays(5);
      Assert.assertEquals("setDays test",
                        5, h.getDays(), .0001);
                        
      h.setExerciseFee(7.0);
      Assert.assertEquals("setExrciseFee test",
                        7.0, h.getExerciseFee(), .0001);
      
   }
   
   /** A test for getCount(). */
   @Test public void getCountTest() {
      
      Horse.resetCount();
      
      Horse h = new Horse("Jessie Rider", "King", "Quarter horse",
                            1000, 7, 10.0);
            
      Assert.assertEquals("getCount test",
                        1, h.getCount(), .0001);
   }
   
   /** A test for boardingCost(). */
   @Test public void boardingCostTest() {
      
      Horse h = new Horse("Jessie Rider", "King", "Quarter horse",
                            1000, 7, 10.0);
            
      Assert.assertEquals("boardingCost test",
                       245.0, h.boardingCost(), .0001);
   } 
   
   /** A test for toString(). */
   @Test public void toStringTest() {
      
      Horse h = new Horse("Jessie Rider", "King", "Quarter horse",
                            1000, 7, 10.0);
      
      Assert.assertEquals("toString test",
                        true, h.toString()
                              .contains("Exercise"));
   }
}






   

