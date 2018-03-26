import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** Test Class for Cone. */
public class ConeTest {

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** A test of getters. */
   @Test public void gettersTest() {
      
      Cone c = new Cone("Tester", 4.0, 5.0);
      
      Assert.assertEquals("getLabel test",
                           "Tester", c.getLabel());
      Assert.assertEquals("getHeight test",
                           4.0, c.getHeight(), .0001);
      Assert.assertEquals("getRadius test",
                           5.0, c.getRadius(), .0001);
   }
   
   /** A test for setLabel. */
   @Test public void setLabelTest() {
      
      
      Cone c1 = new Cone("Tester", 5, 5);
      //true setLabel test.
      Assert.assertEquals("setLabel test",
                           true, c1.setLabel("Test"));
      //fale setLabel test.                   
      Assert.assertEquals("false setLabel test",
                           false, c1.setLabel(null));
                     
   }
   
   /** A test for setHeight. */
   @Test public void setHeightTest() {
      
      
      Cone c = new Cone("Tester", 4, 4);
      //true setHeight test.
      Assert.assertEquals("setHeight test",
                        true, c.setHeight(3));
      //false setHeight test.
      Assert.assertEquals("false setHeight test", 
                        false, c.setHeight(0));
   }
   
   /** A test for setRadius. */
   @Test public void setRadiusTest() {
      
      
      Cone c = new Cone("Tester", 4, 4);
      //true setRadius test.
      Assert.assertEquals("setRadius test",
                        true, c.setRadius(3));
      //false setRadius test.
      Assert.assertEquals("false setRadius test", 
                        false, c.setRadius(0));
   }

   /** A test for basePerimeter(). */
   @Test public void basePerimeterTest() {
   
      Cone c = new Cone("Tester", 5, 5);
      
      Assert.assertEquals("basePerimeter test",
                           31.4159, c.basePerimeter(), .0001);
   }
   
   /** A test for baseArea(). */
   @Test public void baseAreaTest() {
   
      Cone c = new Cone("Tester", 4, 4);
      
      Assert.assertEquals("baseArea test",
                           50.2655, c.baseArea(), .0001);
   }
   
   /** A test for slantHeight(). */
   @Test public void slantHeightTest() {
   
      Cone c = new Cone("Tester", 4, 4);
      
      Assert.assertEquals("slantHeight test",
                           5.6569, c.slantHeight(), .0001);
   }
   
   /** A test for sideArea(). */
   @Test public void sideAreaTest() {
         
      Cone c = new Cone("Tester", 4, 4);
         
      Assert.assertEquals("sideArea test",
                              71.0861, c.sideArea(), .0001);
   }
   
   /** A test for surfaceArea(). */
   @Test public void surfaceAreaTest() {
   
      Cone c = new Cone("Tester", 4, 4);
      
      Assert.assertEquals("surfaceArea Test",
                           121.3516, c.surfaceArea(), .0001);
   }
   
   /** A test for volume(). */
   @Test public void volumeTest() {
   
      Cone c = new Cone("Tester", 4, 4);
      
      Assert.assertEquals("volume test",
                           67.0206, c.volume(), .0001);
   }
   
   /** A test for toString(). */
   @Test public void toStringTest() {
   
      Cone c = new Cone("Tester", 4, 4);
      
      Assert.assertEquals("toString test",
                        true,
                        c.toString()
                           .contains("\"Tester\" is a cone with height"));
   }
   
   /** A test for getCount(). */
   @Test public void getCountTest() {
      
      Cone.resetCount();
      
      Cone c = new Cone("Tester", 4, 4);
      
      Assert.assertEquals("getCount test", 
                        1, c.getCount(), .0001);
   }
   
   /** A test for equals(). */
   @Test public void equalsTest() {
      
      Cone c1 = new Cone("Tester", 4, 4);
      Cone c2 = new Cone("Tester", 4, 4);
      Assert.assertEquals("equals test",
                        true, c1.equals(c2));
      
      c2 = new Cone("Test", 4, 4);
      Assert.assertEquals("equals false test",
                        false, c1.equals(c2));
                        
      c2 = new Cone("Tester", 5, 4);
      Assert.assertEquals("equals false test",
                        false, c1.equals(c2));
      
      c2 = new Cone("Tester", 4, 5);
      Assert.assertEquals("equals false test",
                        false, c1.equals(c2));
                        
      Assert.assertEquals("equals false test",
                        false, c1.equals("obj"));
                        
      Assert.assertEquals("equals false test",
                        0, c1.hashCode());
   }
      
      
                           
}