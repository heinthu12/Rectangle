
/**
 * クラス exercise3 の注釈をここに書きます.
 * 
 * @author (Hein Thu)
 * @version (2019/12/06)
 */
import java.awt.Rectangle;
public class exercise3{
   //Create a method called createRectangle
   public static Rectangle createRectangle(int x,int y,int width,int height){
      //Return the rectangle Object
      return new Rectangle(x,y,width,height);
   }
     public static void main(String[] args){
            //Print and declare your rectangle objects
            System.out.print(createRectangle(20,80,20,15));
      }
}
