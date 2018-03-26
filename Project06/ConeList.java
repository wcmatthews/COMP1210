import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
* Creates an Array List of Cone Objects.
*
*/
public class ConeList {
   private String listName;
   private ArrayList<Cone> cList;
   
   /** Constructor.
    * @param listNameIn 
    * @param cListIn 
    *
    */
   public ConeList(String listNameIn, ArrayList<Cone> cListIn) {
      
      listName = listNameIn;
      cList = cListIn;
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
      return cList.size();
   }
   /** Total Base Perimeter.
    * @return double totalBasePerimeter
    */
   public double totalBasePerimeter() {
      double total = 0;
      
      int index = 0;
      while (index < cList.size()) {
         total += cList.get(index).basePerimeter();
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
      while (index < cList.size()) {
         total += cList.get(index).baseArea();
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
      while (index < cList.size()) {
         total += cList.get(index).slantHeight();
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
      while (index < cList.size()) {
         total += cList.get(index).sideArea();
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
      while (index < cList.size()) {
         total += cList.get(index).surfaceArea();
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
      while (index < cList.size()) {
         total += cList.get(index).volume();
         index++;
      }
      
      return total;
   }
   /** Average Surface Area.
    * @return double averageSurfaceArea
    */

   public double averageSurfaceArea() {
      double sum = 0;
      
      for (int i = 0; i < cList.size(); i++) {
         sum = sum + cList.get(i).surfaceArea();
      }
      
      double average = 0;
      if (cList.size() > 0) {
         average = sum / cList.size();
      }
      return average;
   }
   /** Average Volume.
    * @return double averageVolume
    */

   public double averageVolume() {
      double sum = 0;
      
      for (int i = 0; i < cList.size(); i++) {
         sum = sum + cList.get(i).volume();
      }
      
      double volume = 0;
      if (cList.size() > 0) {
         volume = sum / cList.size();
      }
      return volume;
   }
   /** To String.
    * @return String toString
    */
   public String toString() {
      String result = "\n" + listName + "\n";
      int index = 0;
      while (index < cList.size()) {
         result += "\n" + cList.get(index) + "\n"; 
         index++;  
      }   
      return result;
   }
   /** Summary.
    * @return String summaryInfo
    */
   public String summaryInfo() {
      String result = "";
      result += "----- Summary for " + getName() + " -----";
      result += "\nNumber of Cones: " + numberOfCones();
      result += "\nTotal Base Perimeter: " + totalBasePerimeter();
      result += "\nTotal Base Area: " + totalBaseArea();
      result += "\nTotal Slant Height: " + totalSlantHeight();
      result += "\nTotal Side Area: " + totalSideArea();
      result += "\nTotal Surface Area: " + totalSurfaceArea();
      result += "\nTotal Volume: " + totalVolume();
      result += "\nAverage Surface Area: " + averageSurfaceArea();
      result += "\nAverage Volume: " + averageVolume();
      
      return result;
   
   }
   
   public ArrayList getArrayList() {
      ArrayList<Cone> cList = new ArrayList<Cone>();
      
      return cList;
   }
   
   public ConeList readFile(String fileNameIn) throws IOException {
   
      Scanner scanFile = new Scanner(new File(fileNameIn));
      ArrayList<Cone> myList = new ArrayList<Cone>();
      String cListName = "";
      String label = "";
      double height = 0, radius = 0;
      
      listName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         radius = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
         
         Cone c = new Cone(label, height, radius);
         myList.add(c);
      }
      
      ConeList cL = new ConeList(listName, myList);
      
      return cL;
   }
   
   public void addCone(String labelIn, double heightIn, double radiusIn) {
      
      Cone c = new Cone(labelIn, heightIn, radiusIn);
      
      cList.add(c);
   }
   
   public Cone findCone(String labelIn) {
      for (Cone c : cList) {
         if(c.getLabel().equalsIgnoreCase(labelIn)) {
            return c;
         }
      }
      return null;
   }
   
   public boolean deleteCone(String labelIn) {      
      boolean result = false;
      int index = -1;
      for (Cone c : cList) {
         if(c.getLabel().equalsIgnoreCase(labelIn)) {
            index = cList.indexOf(c);
            break;
         }
      }
      
      if (index >= 0) {
         cList.remove(index);
         result = true;
      }
      return result;
   }
   
   public boolean editCone(String label, double height, double radius){
      
 
      boolean result = false;
      for (Cone c : cList) {
         if (c.getLabel().equalsIgnoreCase(label)) {
         c.setHeight(height);
         c.setRadius(radius);
         result = true;
         break;
      }
   }
   
   return result;
            
      
   }
}
         
   

         





