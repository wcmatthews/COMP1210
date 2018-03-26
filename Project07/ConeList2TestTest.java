import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class ConeList2TestTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** Test for getName(). */
   @Test public void getnameTest() {
      
      Cone[] cArray = new Cone[20];
      cArray[0] = new Cone("c1", 4, 4);
      cArray[1] = new Cone("c2", 5, 5);
      cArray[2] = new Cone("c3", 3, 3);
      
      ConeList2 list = new ConeList2("Test List", cArray, 3);
      
      Assert.assertEquals("getName test",
                        "Test List", list.getName());
   }



  
  }
