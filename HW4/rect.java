import java.awt.Rectangle;
import java.awt.Point;


public class rect {
    public static void main(String[] args){
        Point p = new Point(3,4);
        Rectangle box = new Rectangle (0,0,100,200);

        try{
           System.out.println(rectmovleft(p, box));

        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }

    }
    public static Point rectmovleft(Point box, Rectangle p) throws IllegalArgumentException{
        if(p.x < 0){
            throw new IllegalArgumentException("Usage: input x is not legal");
        }
        box.x = box.x + p.x;
        box.y = box.y + p.y;

        return box;
    }


	}
