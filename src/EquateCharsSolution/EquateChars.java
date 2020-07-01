package EquateCharsSolution;

import java.util.Arrays;

public class EquateChars {

    public static void main(String[] args) {
        boolean assertion = false;
        char missing = 'Z';
        char[] input = new char[]{'q', 'r', 's', 'u'};
        missing = 't';

        char output = findMissingLetter(input);

        if(input[0] == 'A') {
            output = Character.toUpperCase(output);
        }
        if (output == 'T') { assertion = true;}
        System.out.println("The missing letter was " + missing + ", and the output was " + output + " which was " + assertion);
    }


    public static char findMissingLetter(char[] array){

        char[] newArray = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
                    'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                    'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        int place = Arrays.asList(newArray).indexOf(array[0]);

        for(int i = 0; i <= array.length; i++) {
                if(newArray[place] != array[i]) { return newArray[place];}
                place++;
        }

        return 'Z';
    }
}

