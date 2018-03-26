import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Test class.
*/
public class PetBoardingPart3Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Test for main method. */
   @Test public void mainTest() {
      PetBoardingPart3 pbp = new PetBoardingPart3();
      PetBoardingList.resetListCount();
      
      String[] args1 = {}; //an empty String[]
      PetBoardingPart3.main(args1);
      Assert.assertEquals("Pet Boarding List count should be 0",
                     0, PetBoardingList.getListCount());
   }
   
}
