import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.NoSuchElementException;
//import java.util.InputMismatchException;

public class PetBoardingList {
   
   private String listName;
   private Pet[] petList = new Pet[100];
   private int petCount;
   private String[] excludedRecords = new String[30];
   private int excludedCount;
   private static int listCount = 0;
   
   /**
   * Constructor 
   */
   public PetBoardingList() {   
      listCount++;
   }
   
   /**
   *@return String.
   */
   public String getListName() {
      return listName;
   }
   
   /**
   *@param listNameIn.
   */
   public void setListName(String listNameIn) {
      listName = listNameIn;
   }
   
   /**
   *@return Pet[].
   */
   public Pet[] getPetList() {
      return petList;
   }
   
   /**
   *@param petListIn.
   */
   public void setPetList(Pet[] petListIn) {
      petList = petListIn;
   }
   
   /**
   *@return int.
   */
   public int getPetCount() {
      return petCount;
   }
   
   /**
   *@param petCountIn.
   */
   public void setPetCount(int petCountIn) {
      petCount = petCountIn;
   }
   
   /**
   *@return int.
   */
   public String[] getExcludedRecords() {
      return excludedRecords;
   }
   
   /**
   *@param excludedRecordsIn.
   */
   public void setExcludedRecords(String[] excludedRecordsIn) {
      excludedRecords = excludedRecordsIn;
   }
   
   /**
   *@return int.
   */
   public int getExcludedCount() {
      return excludedCount;
   }
   
   /**
   *@param excludedRecordsIn.
   */
   public void setExcludedCount(int excludedCountIn) {
      excludedCount = excludedCountIn;
   }
   
   /**
   *@return listCount.
   */
   public static int getListCount() {
      return listCount;
   }
   
   /**
   * reset count.
   */
   public static void resetListCount() {
      listCount = 0;
   }
   
   /**  
   * Reads in Pet data from file and creates a 
   * PetList object.
   *
   * @param fileNameIn for fileName to read
   * @throws IOException for file reading
   */
   public void readPetFile(String fileNameIn) throws IOException {
      
      Scanner scanFile = new Scanner(new File(fileNameIn));
      listName = scanFile.nextLine();
      String s = "";
      
      while(scanFile.hasNext()) {
         try {
            s = scanFile.nextLine();
            Scanner petLine = new Scanner(s).useDelimiter(",");
         
            String category = petLine.next();
            String ownerName = petLine.next();
            String petName = petLine.next();
            String breed = petLine.next();
            double weight = Double.parseDouble(petLine.next());
            int days = Integer.parseInt(petLine.next());
                
            switch(category) {
            
               case "D":
                  Dog d = new Dog(ownerName, petName, breed,
                     weight, days);
                  petList[petCount] = d;
                  petCount++;
                  break;
               case "C":
                  int livesLeft = Integer.parseInt(petLine.next());
                  Cat c = new Cat(ownerName, petName, breed,
                     weight, days, livesLeft);
                  petList[petCount] = c;
                  petCount++;
                  break;
               case "S":
                  String[] commands = new String[100];
                  String service = petLine.next();
                  int i = 0;
                  while (petLine.hasNext()) {
                     commands[i] = petLine.next();
                     i++;
                  }
                  commands = Arrays.copyOf(commands, i);
                  ServiceDog sd = new ServiceDog(ownerName, petName, breed,
                     weight, days, service, commands);
                  petList[petCount] = sd;
                  petCount++;
                  break;
               case "H":
                  double exerciseFee = Double.parseDouble(petLine.next());
                  Horse h = new Horse(ownerName, petName, breed,
                     weight, days, exerciseFee);
                  petList[petCount] = h;
                  petCount++;
                  break;
               default:
                  throw new InvalidCategoryException(category);
                 
               
            }
         }
         
         
         
         catch (InvalidCategoryException error) {
            String result = error + "in: " + s;
            excludedRecords[excludedCount] = result;
            excludedCount++;
         }
         
         catch (NumberFormatException error) {
            String result = error + "in: " + s;
            excludedRecords[excludedCount] = result;
            excludedCount++;
         }
         
         catch (NoSuchElementException error) {
            String result = error + "in: " + s;
            excludedRecords[excludedCount] = result;
            excludedCount++;
         }
      }
    
   
   }
            
   
   
   /**
   * Generates report of pets in natural order.
   * @return String.
   */
   public String generateReport() {
      String report = "---------------------------------------\n"+
                      "Pet Boarding Report for Critter Sitter\n" +
                      "---------------------------------------\n\n";
      for (int i = 0; i<petCount; i++) {
      
         report += petList[i] + "\n\n";
         
      }
   
      return report;
      
   }
   
   
   /**
   * Generates report of pets by order of Owner.
   * @return String.
   */
   public String generateReportByOwner() {
      petList = Arrays.copyOf(petList, petCount);
      Arrays.sort(petList);
      
      String report = "---------------------------------------\n"+
                      "Pet Boarding Report for Critter Sitter (by Owner)\n" +
                      "---------------------------------------\n\n";
      for (int i = 0; i < petCount; i++) {
      
         report += petList[i] + "\n\n";
         
      }
   
      return report;
   }
   
   /**
   * Generates report by using PetNameComparator.
   * @return String.
   */
   public String generateReportByPetName() {
      petList = Arrays.copyOf(petList, petCount);
      Arrays.sort(petList, new PetNameComparator());
      
      String report = "---------------------------------------\n"+
                      "Pet Boarding Report for Critter Sitter (by Pet Name)\n" +
                      "---------------------------------------\n\n";
      for (int i = 0; i < petCount; i++) {
      
         report += petList[i] + "\n\n";
      }
   
      return report;
   }
   
   /**
   * Generates report by using BoardingCostComparator.
   * @return String.
   */
   public String generateReportByBoardingCost() {
      petList = Arrays.copyOf(petList, petCount);
      Arrays.sort(petList, new BoardingCostComparator());
      
      String report = "---------------------------------------\n"+
                      "Pet Boarding Report for Critter Sitter (by Boarding Cost)\n" +
                      "---------------------------------------\n\n";
      for (int i = 0; i < petCount; i++) {
      
         report += petList[i] + "\n\n";
      }
   
      return report;
   }
   
   /**
   * Generates report for Excluded Records.
   * @return String.
   */
   public String generateExcludedRecordsReport() {
      String report = "---------------------------------------\n"+
                      "Excluded Records Report\n" +
                      "---------------------------------------\n\n";
      for (int i = 0; i<excludedCount; i++) {
      
         report += excludedRecords[i] + "\n\n";
         
      }
   
      return report;
   }
   
}

         

   
  
