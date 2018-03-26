import java.text.DecimalFormat;
/**
 * Provides a cone with a label, radius and height.
 */
public class Cone {

   private String label;
   private double height, radius;
   
   private static int count = 0;
/**
*  Initializes a cone object given the label, height
*  and radius.
*  
*  @param labelIn Label of cone.
*  @param heightIn Height of cone.
*  @param radiusIn radius of cone.
*/
   public Cone(String labelIn, double heightIn, double radiusIn) 
   {
      setLabel(labelIn);
      setHeight(heightIn);
      setRadius(radiusIn); 
      
      count++;  
   }
   
   /**
   * @return label
   */
   public String getLabel() {
      return label;
   }
   /**
   * @param labelIn to replace old label
   * @return true if trimmed label isn't null
   */
   public boolean setLabel(String labelIn) {
   
      if (labelIn != null)
      {
         label = labelIn.trim();
         
         return true;
      }
      
      else 
      {
         return false;
      }
         
   }
   
   /**
   * @return height
   */
   public double getHeight() {
   
      return height;
   }
   
   /**
   * @param heightIn to replace old interest
   * @return true if height > 0
   */
   public boolean setHeight(double heightIn) {
   
      if (heightIn > 0) 
      {
         height = heightIn;
         return true;
      }
      
      else 
      {
         return false;
      }
   }
   
   /**
   * @return radius
   */
   public double getRadius() {
   
      return radius;
   }
   
   /**
   * @param radiusIn replaces old radius
   * @return true if applied, otherwise false.
   */
   public boolean setRadius(double radiusIn) {
   
      if (radiusIn > 0)
      {
         radius = radiusIn;
         return true;
      }
      
      else
      {
         return false;
      }
   
   }
   /**
   * @return calculated base perimeter
   */
   public double basePerimeter() {
   
      double basePerimeter = Math.PI * 2 * radius;
      
      return basePerimeter;
   }
   /**
   * @return calculated base area
   */
   public double baseArea() {
   
      double baseArea = Math.PI * Math.pow(radius, 2);
      
      return  baseArea;
   
   }
   /**
   * @return calculated slant height
   */
   public double slantHeight() {
   
      double slantHeight = Math.sqrt(Math.pow(radius, 2) 
                           + (Math.pow(height, 2)));
      
      return slantHeight;
   
   }
   /**
   * @return calculated side area
   */
   public double sideArea() {
   
      double sideArea = Math.PI * radius * (Math.sqrt(Math.pow(radius, 2) 
                        + (Math.pow(height, 2))));
      
      return sideArea;
   
   }
   /**
   * @return calculated surface area
   */
   public double surfaceArea() {
   
      double surfaceArea = Math.PI * radius * (radius 
                           + (Math.sqrt(Math.pow(radius, 2) 
                              + (Math.pow(height, 2)))));
      
      return surfaceArea;
   
   }
   /**
   * @return calculated volume
   */
   public double volume() {
   
      double volume = (Math.PI * Math.pow(radius, 2) * height) / 3;
      
      return volume;
   
   }
   /**
   * @return String representing cone object
   */
   public String toString() {
   
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
   
      String output = "\"" + getLabel() + "\"" + " is a cone with height = " 
                  + fmt.format(height) 
                  + " units and radius = " 
                  + fmt.format(radius) + " units,"
                  + "\nwhich has a base perimeter = " 
                  + fmt.format(basePerimeter()) 
                  + " units, base area = " + fmt.format(baseArea()) 
                  + " square units,"
                  + "\nslant height = " + fmt.format(slantHeight()) 
                  + " units, side area = " 
                  + fmt.format(sideArea()) + " square units,"
                  + "\nsurface area = " + fmt.format(surfaceArea()) 
                  + " square units, and volume = " + fmt.format(volume()) 
                  + " cubic units.";
      return output;
   
   }
   /**
   * Return count.
   * @return count.
   */
   public static int getCount() {
      return count;
   }
   /**
   * Resest count to zero.
   */
   public static void resetCount() {
      count = 0;
   }
   /**
   *@return boolean.
   *@param obj Object.
   */
   public boolean equals(Object obj) {
      if (!(obj instanceof Cone)) {
         return false;
      }
      else {
         Cone c = (Cone) obj;
         return (label.equalsIgnoreCase(c.getLabel())
                  && Math.abs(height - c.getHeight()) < .00001
                  && Math.abs(radius - c.getRadius()) < .00001);
      }
   }
  /**
  *@return int.
  */
   public int hashCode() {
      return 0;
   }
}
