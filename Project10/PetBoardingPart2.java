import java.io.IOException;

/** Driver Class*/
public class PetBoardingPart2 {

   public static void main(String[] args) throws IOException {
            
      if (args.length == 0) {
         System.out.println("File name expected as command line argument." +
                        "\nProgram ending.");
      }
      
      else { 
        PetBoardingList petList = new PetBoardingList();
        petList.readPetFile(args[0]);
      
        System.out.println(petList.generateReport());
        System.out.println(petList.generateReportByOwner());
        System.out.println(petList.generateReportByPetName());
        System.out.println(petList.generateReportByBoardingCost());
        System.out.println(petList.generateExcludedRecordsReport());
     }

   }
}