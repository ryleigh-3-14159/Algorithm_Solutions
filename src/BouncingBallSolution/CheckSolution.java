package BouncingBallSolution;


public class CheckSolution {
    public static void main(String[] args) {
        System.out.println(assertEquals(15, BouncingBall.bouncingBall(30, 0.66, 1.5)));

    }

    public static boolean assertEquals(int correct, int answer) {
        if (correct != answer) {
            return false;
        }
        return true;
    }
}
