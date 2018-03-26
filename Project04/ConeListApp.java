import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class ConeListApp {

/**
 * 
 * @param args - is not used.
 * @throws IOException from scanning input file.
 */
   public static void main(String[] args) throws IOException
   {
      ArrayList<Cone> myList = new ArrayList<Cone>();
      String coneListName = "";
      String label = "";
      double radius = 0;
      double height = 0;
      
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();

      Scanner scanFile = new Scanner(new File(fileName));
   
      coneListName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         radius = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
                  
         Cone t = new Cone(label, radius, height);
         myList.add(t);           
      }
      
      ConeList myConeList = new ConeList(coneListName, myList);
   
      System.out.println(myConeList);
      
      System.out.println(myConeList.summary());                          
   }


  
}