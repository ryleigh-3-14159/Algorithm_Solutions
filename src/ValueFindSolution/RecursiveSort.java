package ValueFindSolution;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*Complexity of solution lies at O(log(n)) for
both recursive solution and non-recursive solution */

public class RecursiveSort {

    public static void main(String[] args) {

        Random rand = new Random();
        int randNum = rand.nextInt(100);
        int chosenElement = rand.nextInt(randNum);
        String assertion = "incorrect";

        List<Integer> numbers = new ArrayList<Integer>();

        for(int i = 0; i <= randNum; i++) {
            numbers.add(i);
        }

//        **Uncomment for loop solution**
//        int output = chosenElement(numbers, chosenElement);

        //initializes middle of the array
        int middle = (numbers.size() - 1) / 2;

        int output = recursiveSolution(0, numbers.size() - 1, middle, chosenElement, numbers);
        if(output == chosenElement) { assertion = "correct"; }

        System.out.println("The length of the array is " + randNum +
                ".\nThe chosen element was " + chosenElement + ".\nThe output of the method was " + output + ", which is " + assertion);

    }

    public static int recursiveSolution(int low, int high, int mid, int num, List<Integer> ls) {
        if(ls.get(mid) == num) { return mid; }
        mid = (low + high) / 2;
        if(ls.get(mid) < num) { low = mid + 1; }
        else if (ls.get(mid) > num) { high = mid - 1; }
        return recursiveSolution(low, high, mid, num, ls);


    }

//    **UNCOMMENT THIS FOR A NON-RECURSIVE SOLUTION**
//    public static int chosenElement(List<Integer> ls, int n) {
//        int beginning = 0;
//        int end = ls.size() - 1;
//        int mid = 0;
//        while(beginning <= end) {
//            mid = (beginning + end) / 2;
//            if (ls.get(mid) == n) {
//                return mid;
//            }
//            else if(ls.get(mid) < n) {
//                beginning = mid + 1;
//            }
//            else {
//                end = mid - 1;
//            }
//        }
//        return mid;
//    }

}
