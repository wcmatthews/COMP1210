import java.text.DecimalFormat;
/**
* Abstract class for various pets.
*/
public abstract class Pet  {
   
   protected String ownerName, petName, breed;
   protected double weight;
   protected int days;
   protected static int count = 0;
   
   /**
   * Pet constructor.
   * @param ownerNameIn Name of owner.
   * @param petNameIn Name of pet.
   * @param breedIn Breed of pet.
   * @param weightIn Weight of pet.
   * @param daysIn Days of stay.
   */
   public Pet(String ownerNameIn, String petNameIn, String breedIn,
            double weightIn, int daysIn) {
            
      ownerName = ownerNameIn;
      petName = petNameIn;
      breed = breedIn;
      weight = weightIn;
      days = daysIn;
      
      count++;
   }
   
   /**
   * @return ownerName.
   */
   public String getOwner() {
      return ownerName;
   }
   
   /**
   * @param ownerNameIn .
   */
   public void setOwner(String ownerNameIn) {
      ownerName = ownerNameIn;
   }
   
   /**
   * @return petName.
   */
   public String getName() {
      return petName;
   }
   
   /**
   * @param petNameIn .
   */
   public void setName(String petNameIn) {
      petName = petNameIn;
   }
   
   /**
   * @return breed.
   */
   public String getBreed() {
      return breed;
   }
   
   /**
   * @param breedIn .
   */
   public void setBreed(String breedIn) {
      breed = breedIn;
   }
   
   /**
   * @return weight.
   */
   public double getWeight() {
      return weight;
   }
   
   /**
   * @param weightIn .
   */
   public void setWeight(double weightIn) {
      weight = weightIn;
   }
   
   /**
   * @return days.
   */
   public int getDays() {
      return days;
   }
   
   /**
   * @param daysIn .
   */
   public void setDays(int daysIn) {
      days = daysIn;
   }
   /**
   * @return count.
   */
   public static int getCount() {
      return count;
   }
   /**
   * Reset count to zero.
   */
   public static void resetCount() {
      count = 0;
   }
   /**
   * @return double. Abstract.
   */
   public abstract double boardingCost();
   /**
   *@return String representing pet object.
   */
   public String toString() {
   
      DecimalFormat fmt = new DecimalFormat("$#,##0.00");
   
      String output = "Owner: " + getOwner() + "   "
                  + "Pet: " + getName() + "   "
                  + "Days: " + getDays() + "   "
                  + "Boarding Cost: " + fmt.format(boardingCost())
                  + "\n" + this.getClass().toString().substring(6) + ": " 
                  + getBreed() + "   "
                  + "Weight: " + getWeight() + " lbs   ";
                  
      return output;
   }
                  
   
   
}
   