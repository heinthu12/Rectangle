
/**
 * クラス exercise5 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
import java.awt.*;
public class exercise5{
  public static void shiftBox(Rectangle box,int a,int b){
        //We add the distance we want to shift the rectangle by on the x coordinate plus 3
        box.x = box.x + a;
        //we add the distance we want to shift the rectangle by on the y coordinate plus 5
        box.y = box.y + b;
        
   }
    //Create a method called createRectangle
   public static Rectangle createRectangle(int x,int y,int width,int height){
      //Return the rectangle Object
      return new Rectangle(x,y,width,height);
   }
     // Main method
   public static void main(String[] args){
       //Make sure your shiftBox method works by using a box with the following attributes:
       //box.x = 7 and box.y = 30; box.width is 23 and box.height is 5.
        Rectangle box = createRectangle(7,30,23,5); 
        //print before move the box coordinate point
        System.out.println(createRectangle(7,30,23,5));
        //after point
        shiftBox(box,3,5);
        System.out.print(box);
   }
}