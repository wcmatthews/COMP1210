import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** Test class for ServiceDog. */
public class ServiceDogTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** A Test of getters. */
   @Test public void gettersTest() {
      
      ServiceDog sd = new ServiceDog("Jen Baker", "Pepper", "Sheppard", 60, 7,
                                    "guide dog", "sit", "down", "stay");
      
      Assert.assertEquals("getOwner test",
                           "Jen Baker", sd.getOwner());
      Assert.assertEquals("getName test",
                           "Pepper", sd.getName());
      Assert.assertEquals("getBreed test",
                           "Sheppard", sd.getBreed());
      Assert.assertEquals("getWeight test",
                           60, sd.getWeight(), .0001);
      Assert.assertEquals("getDays test",
                           7, sd.getDays(), .0001);
      Assert.assertEquals("getService test",
                           "guide dog", sd.getService());
                           
      String[] commands = sd.getCommands();
      Assert.assertEquals("getCommands test", 
                           commands, sd.getCommands());
   }
   
   /** A test of setters. */
   @Test public void settersTest() {
      
      ServiceDog sd = new ServiceDog("Jen Baker", "Pepper", "Sheppard", 60, 7,
                                    "guide dog", "sit", "down", "stay");
      
      sd.setOwner("Bob");
      Assert.assertEquals("setOwner test",
                         "Bob", sd.getOwner());
      
      sd.setName("Test");
      Assert.assertEquals("setName test",
                           "Test", sd.getName());
      
      sd.setBreed("Lab");
      Assert.assertEquals("setBreed test",
                           "Lab", sd.getBreed());
      
      sd.setWeight(50);
      Assert.assertEquals("setWeight test",
                           50, sd.getWeight(), .0001);
      
      sd.setDays(5);
      Assert.assertEquals("setDays test",
                        5, sd.getDays(), .0001);
      sd.setService("Drug");
      Assert.assertEquals("setService test",
                        "Drug", sd.getService());
      sd.setCommands("heel");
      String[] commands = sd.getCommands();
      Assert.assertEquals("setCommands test",
                        commands, sd.getCommands());
      
   }
   
   /** A test for getCount(). */
   @Test public void getCountTest() {
      
      ServiceDog.resetCount();
      
      ServiceDog sd = new ServiceDog("Jen Baker", "Pepper", "Sheppard", 60, 7,
                                    "guide dog", "sit", "down", "stay");
      
      Assert.assertEquals("getCount test",
                        1, sd.getCount(), .0001);
   }
   
   /** A test for boardingCost(). */
   @Test public void boardingCostTest() {
      
      ServiceDog sd = new ServiceDog("Jen Baker", "Pepper", "Sheppard", 60, 7,
                                    "guide dog", "sit", "down", "stay");
      
      Assert.assertEquals("boardingCost test",
                        133.0, sd.boardingCost(), .0001);
   } 
   
   /** A test for toString(). */
   @Test public void toStringTest() {
      
      ServiceDog sd = new ServiceDog("Jen Baker", "Pepper", "Sheppard", 60, 7,
                                    "guide dog", "sit", "down", "stay");
      
      Assert.assertEquals("toString test",
                        true, sd.toString()
                              .contains("guide dog"));
   }
}




