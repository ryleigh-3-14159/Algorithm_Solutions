package BouncingBallSolution;

public class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {

        if (h > 0 && 0 < bounce && bounce < 1 && window < h) {
            return 1 + 2 * (int) Math.floor(Math.log(window / h) / Math.log(bounce));
        }
        else {
            return -1;
        }

//  **optional solution (simplified)**
        
//        if (h <= 0 || bounce <= 0 || bounce > 1 || window >= h) { return -1; }
//
//        int count = 0;
//
//        while(h > window) {
//            count += 2;
//            h = bounce * h;
//        }
//
//        return count - 1;
    }


}
