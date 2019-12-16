
/**
 * クラス exercise2 の注釈をここに書きます.
 * 
 * @author (Hein Thu)
 * @version (2019/12/06)
 */
import java.awt.Rectangle;
public class exercise2{
   //Create a method called createRectangle
   public static void createRectangle(int x,int y,int width,int height){
       //creatre rectangle
      Rectangle z = new Rectangle(x,y,width,height);
       //call your printmethod
      printRectangle(z);
   }
   //Cereate a method called printRectangle and print it
    public static void printRectangle(Rectangle s){
        System.out.print(s);
    }
        public static void main(String[] args){
            //call your createRectangle and declare to x,y,width,height
            /*int x = 50;
            int y = 75;
            int width = 20;
            int height = 15;*/
            createRectangle(50,75,20,15);
        }
}