import java.util.Scanner;
/**
*  Program accepts input values to determine
*  the different qualities of a right cone.
*  
*  @author Collin Matthews
*  @version 09/22/2016
*/ 

public class ConeApp
{
 /**
 *
 *  Uses user input values for radius, height, and label
 *  with these values it gives you information based on
 *  a cone with the corresponding user inputted values.
 * 
 *  @param args Command-line arguments (unused)
 */
   public static void main(String[] args)
   {
   
      String strLabel, strHeight, strRadius;
   
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter label, height, and radius for a cone.");
   
      System.out.print("\tlabel: ");
      strLabel = input.nextLine();
      System.out.print("\theight: ");
      strHeight = input.nextLine();
      double height2 = Double.parseDouble(strHeight);
   
      if (height2 <= 0) 
      {
         System.out.println("Error: height must be greater than 0");
         System.exit(0);
      }
      System.out.print("\tradius: ");
      strRadius = input.nextLine();
      double radius2 = Double.parseDouble(strRadius);
   
      if (radius2 <= 0)
      {   
         System.out.println("Error: radius must be greater than zero");
         System.exit(0);   
      
      }
      
      Cone cone = new Cone(strLabel, height2, radius2);
      
      System.out.println(cone);
   
   }
   
} 
   
