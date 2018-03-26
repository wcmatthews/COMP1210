/**
* Cat class.
*/
public class Cat extends Pet {
   
   private int livesLeft;
   
   /***/
   public static final double BASE_RATE = 10;
   
   /**
   * Initializes a cat with information pertaining
   * to its stay at the boarding school.
   * @param ownerName Name of owner.
   * @param petName Name of pet.
   * @param breed Breed of pet.
   * @param weight Weight of pet.
   * @param days Days of stay.
   * @param livesLeftIn Cat lives.
   */
   public Cat(String ownerName, String petName, String breed,
            double weight, int days, int livesLeftIn) {
            
            super(ownerName, petName, breed, weight, 
                  days);
      livesLeft = livesLeftIn;
   }
   
   /**
   * @return livesLeft.
   */ 
   public int getLivesLeft() {
      return livesLeft;
   }
   
   /**
   * @param livesLeftIn .
   */
   public void setLivesLeft(int livesLeftIn) {
      livesLeft = livesLeftIn;
   }
   
   /**
   * @return Boarding cost.
   */
   public double boardingCost() {
      double cost = (BASE_RATE + weight * 0.10) * days * (9.0 / livesLeft);
      
      return cost;
   }
   /**
   *@return String representing cat.
   */
   public String toString() {
      return super.toString()
         + "Lives Left: " + getLivesLeft();
   }
   
   
}