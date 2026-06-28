public class TastBoats{
  public static void main(String args[]){
    Boat b1 = new Boat();
    SailBoat b2 = new SailBoat();
    Rowboat b3 = new Rowboat();
    b2.setLength(6745);
    b1.move();
    b2.move();
    b3.move();
        
  }

}
public class Boat{
  private int length ;
  
  public void setLength(int len){
   length = len;
  }
  public int getLength(){
 
  return length;
  }

    public void move() {
  System.out.println("Drift ");

    }
}

 public class Rowboat extends Boat {
     
      public void rowTheBoat(){
      System.out.println("stroke natasha");
      }



 }

public class SailBoat extends Boat{
   public void move(){
   System.out.println("hoist sail");
   }


}





