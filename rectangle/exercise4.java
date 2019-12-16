/**
 * クラス exercise4 の注釈をここに書きます.
 * 
 * @author (Hein Thu)
 * @version (2019/12/06)
 */
import java.awt.*;
public class exercise4{
    //create a method called findCenter that takes a object as aparameter
   public static Point findCenter(Rectangle box){
       //we find half the distance from the leftmost line on the x coordinate 
      int x = box.x + box.width/2;
      //we find  half the distance from the bottom line on the y coordinate
      int y = box.y + box.height/2;
      //return a point parameter
      return new Point(x,y);
    
   }
   public static void main(String[] args){
       //using ex3 constructor
       Rectangle box = exercise3.createRectangle(20,80,50,30);
       //print find center
       System.out.print(findCenter(box));
   }
}
