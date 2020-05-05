package java_PointMoveablePoint;

import com.sun.deploy.net.DownloadException;

public class Main {
    public static void main(String[] args) {
        Point point=new Point(4.4f,5.5f);
        System.out.println("point: "+point.toString());

        //

//        MoveBalePoint moveBalePoint=new MoveBalePoint(point.getX(),point.getY(),6.6f,7.7f);
//        moveBalePoint.move();
//        moveBalePoint.toString();
         MoveBalePoint moveBalePoint= new MoveBalePoint(5.5f, 6.6f, 3.2f, 1.2f);
        System.out.println("Movable point before: "+moveBalePoint.toString());
        moveBalePoint.move();
        System.out.println("Movable point after: "+moveBalePoint.toString());

    }
}
