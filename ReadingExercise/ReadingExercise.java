package ReadingExercise;

import java.util.Arrays;

public class ReadingExercise {
    public static void main (String[] args) {
        var a = new int[] {1,3,5,8,9};
        var b = new int[] {2,3,4,7,8};
        var c = yup(a, b);

        System.out.println("Input 1: " + Arrays.toString(a));
        System.out.println("Input 2: " + Arrays.toString(b));
        System.out.println("Output: " +  Arrays.toString(c));
    }


    /*
     * The point of this method is to demonstrate how important
     * naming is when working with other developers (and yourself)
     * 
     * Read through this method as best as you can and try
     * to understand what it does. You can also change the
     * 'a' and 'b' arrays in the main method to test further.
     * 
     * Then, change variable names and add comments so that
     * it's more obvious what the code does. Don't forget
     * to change the method name too.
     * 
     * Keep in mind naming conventions you might have seen
     * for things like input variables, return variables,
     * or iterating/index variables
     */
    public static int[] yup(int[] blup, int[] zup) {
        var blap = new int[blup.length + zup.length];

        var blip = 0;
        var zap = 0;

        for(int zip = 0; zip < blap.length; zip++) {
            if (blip >= blup.length) {
                blap[zip] = zup[zap];
                zap = zap + 1;
            }
            else if (zap >= zup.length) {
                blap[zip] = blup[blip];
                blip = blip + 1;
            }
            else {
                var zop = blup[blip];
                var blop = zup[zap];

                if (zop < blop) {
                    blap[zip] = zop;
                    blip = blip + 1;
                }
                else {
                    blap[zip] = blop;
                    zap = zap + 1;
                }
            }
        }

        return blap;
    }
}
