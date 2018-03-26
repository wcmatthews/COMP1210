/**
* Service Dog class.
*/
public class ServiceDog extends Dog {
   
   private String service;
   private String[] commands;
   public static final double BASE_RATE = 13;
   
   /**
   * Service Dog constructor.
   * @param ownerNameIn Name of owner.
   * @param petNameIn Name of pet.
   * @param breedIn Breed of pet.
   * @param weightIn Weight of pet.
   * @param daysIn Days of stay.
   * @param serviceIn Service type.
   * @param commandsIn List of commands.
   */
   public ServiceDog(String ownerNameIn, String petNameIn, String breedIn,
            double weightIn, int daysIn, String serviceIn, String ... commandsIn) {
            
            super(ownerNameIn, petNameIn, breedIn, weightIn, 
                  daysIn);
                  
            String service = serviceIn;
                  
            String[] commands = commandsIn;
   }
   
}
            
