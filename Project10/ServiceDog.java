/**
* Service Dog class.
*/
public class ServiceDog extends Dog {
   
   private String service;
   private String[] commands;
   /***/
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
   public ServiceDog(String ownerNameIn, String petNameIn,
                     String breedIn, double weightIn, int daysIn,
                     String serviceIn, String ... commandsIn) {
            
            super(ownerNameIn, petNameIn, breedIn, weightIn, 
                  daysIn);
                  
      service = serviceIn;
                  
      commands = commandsIn;
   }
   
   /**
   * @return String service.
   */
   public String getService() {
      return service;
   }
   
   /**
   * @param serviceIn .
   */
   public void setService(String serviceIn) {
      service = serviceIn;
   }
   
   /**
   * @return String[] commands.
   */
   public String[] getCommands() {
      return commands;
   }
   
   /**
   * @param commandsIn .
   */
   public void setCommands(String ... commandsIn) {
      commands = commandsIn;
   }
   /**
   * @return Boarding cost.
   */
   public double boardingCost() {
      double cost = (BASE_RATE + weight * 0.05 + commands.length) * days;
      
      return cost;
   }
   /**
   * String object representing ServiceDog.
   * @return result 
   */
   public String toString() {
   if (commands.length > 0) {
      String result = super.toString()
         + "Service: " + getService()
         + "\nCommands: ";
          
      for (int i = 0; i < commands.length; i++) {
         result += (commands[i] + " ");
      }
      return result;
   }
   
   else {
      String result = super.toString()
         + "Service: " + getService();
      return result;
   }
   }
}
            
