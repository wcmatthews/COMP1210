import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/** Test Class for ConeList2. */
public class ConeList2Test {


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
   
   /** Test for numberOfCones(). */
   @Test public void numberOfConesTest() {
      
      Cone[] cArray = new Cone[20];
      cArray[0] = new Cone("c1", 4, 4);
      
      ConeList2 list = new ConeList2("Test List", cArray, 1);
      
      Assert.assertEquals("numberOfCones test",
                         1, list.numberOfCones());
   }
   
   /** Test for totalBasePerimeter(). */
   @Test public void totalBasePerimeterTest() {
   
      Cone[] cArray = new Cone[20];
      cArray[0] = new Cone("c1", 4, 4);
      cArray[1] = new Cone("c2", 5, 5);
      cArray[2] = new Cone("c3", 3, 3);
      
      ConeList2 list = new ConeList2("Test List", cArray, 3);

      Assert.assertEquals("totalBasePerimeter test",
                        75.3982, list.totalBasePerimeter(), .0001);
   }
   
   /** Test for totalBaseArea(). */
   @Test public void totalBaseAreaTest() {
   
      Cone[] cArray = new Cone[20];
      cArray[0] = new Cone("c1", 4, 4);
      cArray[1] = new Cone("c2", 5, 5);
      cArray[2] = new Cone("c3", 3, 3);
      
      ConeList2 list = new ConeList2("Test List", cArray, 3);
      
      Assert.assertEquals("totalBaseArea test",
                        157.0796, list.totalBaseArea(), .0001);
   }
   
   /**Test for totalSlantHeight(). */
   @Test public void totalSlantHeightTest() {
   
      Cone[] cArray = new Cone[20];
      cArray[0] = new Cone("c1", 4, 4);
      cArray[1] = new Cone("c2", 5, 5);
      cArray[2] = new Cone("c3", 3, 3);
      
      ConeList2 list = new ConeList2("Test List", cArray, 3);

      Assert.assertEquals("totalSlantHeight test",
                        16.9706, list.totalSlantHeight(), .0001);
   }
   
   /** Test for totalSideArea(). */
   @Test public void totalSideAreaTest() {
   
      Cone[] cArray = new Cone[20];
      cArray[0] = new Cone("c1", 4, 4);
      cArray[1] = new Cone("c2", 5, 5);
      cArray[2] = new Cone("c3", 3, 3);
      
      ConeList2 list = new ConeList2("Test List", cArray, 3);

      Assert.assertEquals("totalSideArea test",
                      222.1441, list.totalSideArea(), .0001);
   }
   
   /** Test for totalSurfaceArea(). */
   @Test public void totalSurfaceAreaTest() {
   
      Cone[] cArray = new Cone[20];
      cArray[0] = new Cone("c1", 4, 4);
      cArray[1] = new Cone("c2", 5, 5);
      cArray[2] = new Cone("c3", 3, 3);
      
      ConeList2 list = new ConeList2("Test List", cArray, 3);

      Assert.assertEquals("totalSurfaceArea test",
                        379.2238, list.totalSurfaceArea(), .0001);
   }
   
   /** Test for totalVolume(). */
   @Test public void totalVolumeTest() {
   
      Cone[] cArray = new Cone[20];
      cArray[0] = new Cone("c1", 4, 4);
      cArray[1] = new Cone("c2", 5, 5);
      cArray[2] = new Cone("c3", 3, 3);
      
      ConeList2 list = new ConeList2("Test List", cArray, 3);

      Assert.assertEquals("totalVolume test",
                        226.1947, list.totalVolume(), .0001);
   }
   
   /** Test for averageSurfaceArea(). */
   @Test public void averageSurfaceAreaTest() {
   
      Cone[] cArray = new Cone[20];
      cArray[0] = new Cone("c1", 4, 4);
      cArray[1] = new Cone("c2", 5, 5);
      cArray[2] = new Cone("c3", 3, 3);
      
      ConeList2 list = new ConeList2("Test List", cArray, 3);

      Assert.assertEquals("averageSurfaceArea test",
                        126.4079, list.averageSurfaceArea(), .0001);
      
      ConeList2 list2 = new ConeList2("Test List", null, 0);
      Assert.assertEquals("averageSurfaceArea test",
                           0, list2.averageSurfaceArea(), .0001);
   }
   
   /** Test for averageVolume(). */
   @Test public void averageVolumeTest() {
   
      Cone[] cArray = new Cone[20];
      cArray[0] = new Cone("c1", 4, 4);
      cArray[1] = new Cone("c2", 5, 5);
      cArray[2] = new Cone("c3", 3, 3);
      
      ConeList2 list = new ConeList2("Test List", cArray, 3);

      Assert.assertEquals("averageVolume test",
                        75.3982, list.averageVolume(), .0001);
                        
      ConeList2 list2 = new ConeList2("Test List", null, 0);
      Assert.assertEquals("averageVolume test",
                           0, list2.averageVolume(), .0001);
   }
   
   /** Test for toString(). */
   @Test public void toStringTest() {
   
      Cone[] cArray = new Cone[20];
      cArray[0] = new Cone("c1", 4, 4);
      cArray[1] = new Cone("c2", 5, 5);
      cArray[2] = new Cone("c3", 3, 3);
      
      ConeList2 list = new ConeList2("Test List", cArray, 3);

      Assert.assertEquals("toString test",
                        true,
                        list.toString().
                           contains("base perimeter = 25.133 units"));
   }
   
   /** Test for summaryInfo(). */
   @Test public void summaryInfoTest() {
      
      Cone[] cArray = new Cone[20];
      cArray[0] = new Cone("c1", 4, 4);
      cArray[1] = new Cone("c2", 5, 5);
      cArray[2] = new Cone("c3", 3, 3);
      
      ConeList2 list = new ConeList2("Test List", cArray, 3);

      Assert.assertEquals("summaryInfo test",
                        true,
                        list.summaryInfo().
                           contains("Summary for Test List"));
   }
   
   /** Test for getList(). */
   @Test public void getListTest() {
   
      Cone[] cArray = new Cone[20];
      cArray[0] = new Cone("c1", 4, 4);
      cArray[1] = new Cone("c2", 5, 5);
      cArray[2] = new Cone("c3", 3, 3);
      
      ConeList2 list = new ConeList2("Test List", cArray, 3);

      Assert.assertEquals("getList test",
                        cArray, list.getList());
   }
   
   /** Test for readFile(). 
   * @throws IOException for reading a file.
   */
   @Test public void readFileTest() throws IOException {
   
      Cone[] cArray = new Cone[20];
      cArray[0] = new Cone("c1", 4, 4);
      cArray[1] = new Cone("c2", 5, 5);
      cArray[2] = new Cone("c3", 3, 3);
      
      ConeList2 list = new ConeList2("Test List", null, 0);
      list = list.readFile("cone_1.dat");

      Assert.assertEquals("readFile test",
                        "Cone List 1", list.getName());
   }
   
   /** Test for addCone(). */
   @Test public void addConeTest() {
   
      Cone[] cArray = new Cone[20];
      cArray[0] = new Cone("c1", 4, 4);
      cArray[1] = new Cone("c2", 5, 5);
      cArray[2] = new Cone("c3", 3, 3);
      
      ConeList2 list = new ConeList2("Test List", cArray, 3);

      Cone c = new Cone("c4", 6, 6);
      list.addCone("c4", 6, 6);
      Cone[] cA = list.getList();
      
      Assert.assertEquals("addCone test",
                        c, cA[3]);
   }
   
   /** Test for deleteCone(). */
   @Test public void deleteConeTest() {
   
      Cone[] cArray = new Cone[20];
      cArray[0] = new Cone("c1", 4, 4);
      cArray[1] = new Cone("c2", 5, 5);
      cArray[2] = new Cone("c3", 3, 3);
      
      ConeList2 list = new ConeList2("Test List", cArray, 3);
      
      Assert.assertEquals("deleteCone true test",
                        cArray[0], list.deleteCone("c1"));
                        
      Assert.assertEquals("deleteCone test",
                           cArray[3], list.deleteCone(null));
   }
   
   /** Test for findCone(). */
   @Test public void findConeTest() {
   
      Cone[] cArray = new Cone[20];
      cArray[0] = new Cone("c1", 4, 4);
      cArray[1] = new Cone("c2", 5, 5);
      cArray[2] = new Cone("c3", 3, 3);
      
      ConeList2 list = new ConeList2("Test List", cArray, 3);

      Assert.assertEquals("findCone test",
                        cArray[1], list.findCone("c2"));
                        
      Assert.assertEquals("findCone test",
                           cArray[3], list.findCone(null));
   }
   
   /** Test for editCone(). */
   @Test public void editConeTest() {
      
      Cone[] cArray = new Cone[20];
      cArray[0] = new Cone("c1", 4, 4);
      cArray[1] = new Cone("c2", 5, 5);
      cArray[2] = new Cone("c3", 3, 3);
      
      ConeList2 list = new ConeList2("Test List", cArray, 3);

      Assert.assertEquals("editConeTest", true,
                         list.editCone("c1", 6, 6));
                         
      Assert.assertEquals("editConeTest", false,
                        list.editCone("c5", 2, 2));
   }
   
   /** Test for findConeWithSmallestHeight(). */
   @Test public void findConeWithSmallestHeightTest() {
   
      Cone[] cArray = new Cone[20];
      cArray[0] = new Cone("c1", 4, 4);
      cArray[1] = new Cone("c2", 5, 5);
      cArray[2] = new Cone("c3", 3, 3);
      
      ConeList2 list = new ConeList2("Test List", cArray, 3);

      Assert.assertEquals("findConeWithSmallestHeight test",
                        cArray[2], list.findConeWithSmallestHeight());
      
      ConeList2 list2 = new ConeList2("Test List", null, 0);
      Assert.assertEquals("findConeWithSmallestHeight test",
                           null, list2.findConeWithSmallestHeight());
   }
   
   /** Test for findConeWithLargestHeight(). */
   @Test public void findConeWithLargestHeightTest() {
   
      Cone[] cArray = new Cone[20];
      cArray[0] = new Cone("c1", 4, 4);
      cArray[1] = new Cone("c2", 5, 5);
      cArray[2] = new Cone("c3", 3, 3);
      
      ConeList2 list = new ConeList2("Test List", cArray, 3);

      Assert.assertEquals("findConeWithLargestHeight test",
                        cArray[1], list.findConeWithLargestHeight());
      
      ConeList2 list2 = new ConeList2("Test List", null, 0);
      Assert.assertEquals("findConeWithLargestHeight test",
                           null, list2.findConeWithLargestHeight());

   }
   
   /** Test for findConeWithSmallestRadius(). */
   @Test public void findConeWithSmallestRadiusTest() {
   
      Cone[] cArray = new Cone[20];
      cArray[0] = new Cone("c1", 4, 4);
      cArray[1] = new Cone("c2", 5, 5);
      cArray[2] = new Cone("c3", 3, 3);
      
      ConeList2 list = new ConeList2("Test List", cArray, 3);

      Assert.assertEquals("findConeWithSmallestRadius test",
                        cArray[2], list.findConeWithSmallestRadius());
                        
      ConeList2 list2 = new ConeList2("Test List", null, 0);
      Assert.assertEquals("findConeWithSmallestRadius test",
                           null, list2.findConeWithSmallestRadius());

   }
   
   /** Test for findConeWithLargestRadius(). */
   @Test public void findConeWithLargestRadiusTest() {
   
      Cone[] cArray = new Cone[20];
      cArray[0] = new Cone("c1", 4, 4);
      cArray[1] = new Cone("c2", 5, 5);
      cArray[2] = new Cone("c3", 3, 3);
      
      ConeList2 list = new ConeList2("Test List", cArray, 3);

      Assert.assertEquals("findConeWithLargestRadius test",
                        cArray[1], list.findConeWithLargestRadius());
                        
      ConeList2 list2 = new ConeList2("Test List", null, 0);
      Assert.assertEquals("findConeWithLargestRadius test",
                           null, list2.findConeWithLargestRadius());

   }
}
