public class HW4 {
    public static void main(String[] args) {
        Point p = new Point(3,4);
        Rectangle box = new Rectangle(0, 0, 100, 200);

        try {
            rectmovleft(box, p);
            System.out.println("x = " + box.x + ", y = " + box.y);
            System.out.println("width: " + box.width +" height: " + box.height);
        } catch (IllegalArgumentException e) {
            System.out.println( e.getMessage());
            System.out.println("Please change the x value of your variable p to be a positive number");

        }
    }

    public static void rectmovleft(Rectangle box, Point p) {
        if (p.x < 0) {
            throw new IllegalArgumentException("Usage: input x is not legal");
        }

        box.x = box.x + p.x;
        box.y = box.y + p.y;
    }
    static class Point {
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
     static class Rectangle{
        public int x;
        public int y;
        public int width;
        public int height;
        public Rectangle(int x, int y, int width, int height){
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }
    }

}
