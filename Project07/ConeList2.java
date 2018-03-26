//import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
/**
* Creates an Array List of Cone Objects.
*
*/
public class ConeList2 {
   private String listName;
   private Cone[] list = new Cone[100];
   private int numberOfCones = 0;
   
   /** Constructor.
    * @param listNameIn name of Array.
    * @param listIn Array.
    * @param numberOfConesIn number of cones in array.
    */
   public ConeList2(String listNameIn, Cone[] listIn,
                          int numberOfConesIn) {
      
      listName = listNameIn;
      list = listIn;
      numberOfCones = numberOfConesIn;
   }
   
   /** Accessor.
    * @return String getName
    */
   public String getName() {
      return listName;
   }
   /** Number of Cones.
    * @return int numberOfCones
    */
   public int numberOfCones() {
      return numberOfCones;
   }
   /** Total Base Perimeter.
    * @return double totalBasePerimeter
    */
   public double totalBasePerimeter() {
      double total = 0;
      
      int index = 0;
      while (index < numberOfCones) {
         total += list[index].basePerimeter();
         index++;
      }
      
      return total;
   }
   /** Total Base Area.
    * @return double totalBaseArea
    */

   public double totalBaseArea() {
      double total = 0;
      
      int index = 0;
      while (index < numberOfCones) {
         total += list[index].baseArea();
         index++;
      }
      
      return total;
   }
   /** Total Slant Height.
    * @return double totalSlantHeight
    */

   public double totalSlantHeight() {
      double total = 0;
      
      int index = 0;
      while (index < numberOfCones) {
         total += list[index].slantHeight();
         index++;
      }
      
      return total;
   }
   /** Total Side Area.
    * @return double  totalSideArea
    */

   public double totalSideArea() {
      double total = 0;
      
      int index = 0;
      while (index < numberOfCones) {
         total += list[index].sideArea();
         index++;
      }
      
      return total;
   }
   /** Total Surface Area.
    * @return double totalSurfaceArea
    */

   public double totalSurfaceArea() {
      double total = 0;
      
      int index = 0;
      while (index < numberOfCones) {
         total += list[index].surfaceArea();
         index++;
      }
      
      return total;
   }
   /** Total Volume.
    * @return double totalVolume
    */

   public double totalVolume() {
      double total = 0;
      
      int index = 0;
      while (index < numberOfCones) {
         total += list[index].volume();
         index++;
      }
      
      return total;
   }
   /** Average Surface Area.
    * @return double averageSurfaceArea
    */

   public double averageSurfaceArea() {
      double sum = 0;
      
      for (int i = 0; i < numberOfCones; i++) {
         sum = sum + list[i].surfaceArea();
      }
      
      double average = 0;
      if (numberOfCones > 0) {
         average = sum / numberOfCones;
      }
      return average;
   }
   /** Average Volume.
    * @return double averageVolume
    */

   public double averageVolume() {
      double sum = 0;
      
      for (int i = 0; i < numberOfCones; i++) {
         sum = sum + list[i].volume();
      }
      
      double volume = 0;
      if (numberOfCones > 0) {
         volume = sum / numberOfCones;
      }
      return volume;
   }
   /** To String.
    * @return String toString
    */
   public String toString() {
      String result = "\n" + listName + "\n";
      int index = 0;
      while (index < numberOfCones) {
         result += "\n" + list[index] + "\n"; 
         index++;  
      }   
      return result;
   }
   /** Summary.
    * @return String summaryInfo
    */
   public String summaryInfo() {
      DecimalFormat fmt = new DecimalFormat("###,##0.0##");
   
      String result = "";
      result += "----- Summary for " + getName() + " -----";
      result += "\nNumber of Cones: " + numberOfCones();
      result += "\nTotal Base Perimeter: " + fmt.format(totalBasePerimeter());
      result += "\nTotal Base Area: " + fmt.format(totalBaseArea());
      result += "\nTotal Slant Height: " + fmt.format(totalSlantHeight());
      result += "\nTotal Side Area: " + fmt.format(totalSideArea());
      result += "\nTotal Surface Area: " + fmt.format(totalSurfaceArea());
      result += "\nTotal Volume: " + fmt.format(totalVolume());
      result += "\nAverage Surface Area: " + fmt.format(averageSurfaceArea());
      result += "\nAverage Volume: " + fmt.format(averageVolume());
      
      return result;
   
   }
   /**
   * @return list
   */
   public Cone[] getList() {
    
      return list;
   }
   
  /**  
   * Reads in cone data from file and creates a 
   * ConeList2 object.
   *
   * @param fileNameIn for fileName to read
   * @return ConeList2
   * @throws IOException for file reading
   */   

   public ConeList2 readFile(String fileNameIn) throws IOException {
   
      Scanner scanFile = new Scanner(new File(fileNameIn));
      Cone[] myList = new Cone[100];
      String cListName = "";
      int numCones = 0;
      String label = "";
      double height = 0, radius = 0;
      
      listName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         height = Double.parseDouble(scanFile.nextLine());
         radius = Double.parseDouble(scanFile.nextLine());
         
         Cone c = new Cone(label, height, radius);
         myList[numCones] = c;
         numCones++;
      }
      
      ConeList2 cL = new ConeList2(listName, myList, numCones);
      
      return cL;
   }
   /**  
   * Add a Cone object to the list.
   * 
   * @param labelIn Label of cone.
   * @param heightIn Height of cone.
   * @param radiusIn Radius of cone.
   */   
   public void addCone(String labelIn, double heightIn, double radiusIn) {
      
      Cone c = new Cone(labelIn, heightIn, radiusIn);
      list[numberOfCones] = c;
      numberOfCones++;
   }
   /**
   * Finds a cone and shows it's information.
   * 
   * @param labelIn Label of cone.
   * @return Cone object if found, null if not.
   */
   public Cone findCone(String labelIn) {
      for (int i = 0; i < numberOfCones; i++) {
         if (list[i].getLabel().equalsIgnoreCase(labelIn)) {
            return list[i];
         }
      }
      return null;
   }
   /**
   * Deletes a Cone from the list.
   *   
   * @param labelIn for label.
   * @return Cone object if found then deleted.
   */   
   public Cone deleteCone(String labelIn) {      
      Cone result = null;
      int index = -1;
      for (int i = 0; i < numberOfCones; i++) {
         if (list[i].getLabel().equalsIgnoreCase(labelIn)) {
            result = list[i];
            
            for (int j = i; j < numberOfCones - 1; j++) {
               list[j] = list[j + 1];
            }
            list[numberOfCones - 1] = null;
            numberOfCones--;
            break;
         }
      }
      
      return result;
   }
   /**
    * Finds a cone in the Array, changes height and radius.
    *
    * @param label Label of cone.
    * @param height Height of cone.
    * @param radius Radius of cone.
    * @return true if Cone is found and values are changed.
    */     
   public boolean editCone(String label, double height, double radius) {
      
   
      boolean result = false;
      for (int i = 0; i < numberOfCones; i++) {
         if (list[i].getLabel().equalsIgnoreCase(label)) {
            list[i].setHeight(height);
            list[i].setRadius(radius);
            result = true;
            break;
         }
      }
   
      return result;
            
      
   }
   /**
   * Find cone with smallest height in list.
   * @return Cone.
   */
   public Cone findConeWithSmallestHeight() {
      
      if (numberOfCones <= 0) {
         return null;
      }
      
      double smallest = list[0].getHeight();
      Cone smallCone = list[0];
      int index = 0;
      while (index < numberOfCones) {
         if (!(smallest < list[index].getHeight())) {
            smallest = list[index].getHeight();
            smallCone = list[index];
         }
         index++;
      }
      
      return smallCone;
   }
   
   /**
   * Find cone with largest height in list.
   * @return Cone.
   */

   public Cone findConeWithLargestHeight() {
      
      if (numberOfCones <= 0) {
         return null;
      }
      
      double largest = list[0].getHeight();
      Cone largeCone = list[0];
      int index = 0;
      while (index < numberOfCones) {
         if (largest < list[index].getHeight()) {
            largest = list[index].getHeight();
            largeCone = list[index];
         }
         index++;
      }
      
      return largeCone;
   }
   
   /**
   * Find cone with smallest radius in list.
   * @return Cone.
   */

   public Cone findConeWithSmallestRadius() {
      
      if (numberOfCones <= 0) {
         return null;
      }
      
      double smallest = list[0].getRadius();
      Cone smallCone = list[0];
      int index = 0;
      while (index < numberOfCones) {
         if (!(smallest < list[index].getRadius())) {
            smallest = list[index].getRadius();
            smallCone = list[index];
         }
         index++;
      }
      
      return smallCone;
   }
   
   /**
   * Find cone with largest radius in list.
   * @return Cone.
   */
   public Cone findConeWithLargestRadius() {
      
      if (numberOfCones <= 0) {
         return null;
      }
      
      double largest = list[0].getRadius();
      Cone largeCone = list[0];
      int index = 0;
      while (index < numberOfCones) {
         if (largest < list[index].getRadius()) {
            largest = list[index].getRadius();
            largeCone = list[index];
         }
         index++;
      }
      
      return largeCone;
   }

} 
         
   

         





