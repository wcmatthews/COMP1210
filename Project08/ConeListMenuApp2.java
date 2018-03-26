import java.util.Scanner;
import java.io.IOException;

/**  */
public class ConeListMenuApp2
{
/**
 * 
 * @param args - is not used.
 * @throws IOException from scanning input file.
 */
   public static void main(String[] args) throws IOException
   {
      String cListName = "no list name";
      Cone[] myList = new Cone[100];
      ConeList2 myCList = new ConeList2(cListName, myList, 0);
      String fileName = "no file name";
      
      String label;
      double height, radius;   
      
      String code = "";
   
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Cone List System Menu\n"
                       + "R - Read in File and Create Cone List\n"
                       + "P - Print Cone List\n" 
                       + "S - Print Summary\n"
                       + "A - Add Cone\n"   
                       + "D - Delete Cone\n"   
                       + "F - Find Cone\n"
                       + "E - Edit Cone\n"
                       + "Q - Quit");
   
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch(codeChar) {
            case 'R':
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
            
               myCList = myCList.readFile(fileName);
            
               System.out.println("\tFile read in and "
                              + "Cone List created\n");
               break; 
                    
            case 'P':
               System.out.println(myCList);
               break;
               
            case 'S':
               System.out.println("\n" 
                                    + myCList.summaryInfo() + "\n");
               break;
         
            case 'A':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scan.nextLine());
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(scan.nextLine());
            
               myCList.addCone(label, height, radius);
               System.out.println("\t*** Cone added ***\n");
               break;   
               
            case 'D':
               System.out.print("\tLabel: ");
               label = (scan.nextLine());
              
            
               if (myCList.deleteCone(label) != null) {
                  System.out.println("\t\"" + label + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break; 
            
            case 'F':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (myCList.findCone(label) != null) {
                  System.out.println(myCList.findCone(label));
               } 
               
               else {
                  System.out.println("\"" + label + "\" not found");
               } break;
               
            case 'E': 
              System.out.print("\tLabel: ");
              label = scan.nextLine();
              System.out.print("\tHeight: ");
              height = Double.parseDouble(scan.nextLine());
              System.out.print("\tRadius: ");
              radius = Double.parseDouble(scan.nextLine());

              
              if (myCList.editCone(label, height, radius)) {
               System.out.println("\"" + label + "\" successfully edited");
               }
              
              else {
             
               System.out.println("\"" + label + "\" not found");
               }
               break;
               
                  
            case 'Q':
               break;
               
            default:
             
         }
      
      } while (!code.equalsIgnoreCase("Q"));
      
      
   }
}
