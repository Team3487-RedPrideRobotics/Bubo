package ListSorter;

import java.util.ArrayList;
import java.util.List;

public class Sorter {

    public static List<Integer> Sort(List<Integer> input) {
        var output = new ArrayList<Integer>();

        /*
         * You're goal here is to take an input list of numbers and sort them.
         * For example, if I made input = {4,2,7}, then output should be {2,4,7}
         * 
         * The two main methods you'll need are input.get(i) and output.add(x)
         * 
         * For input.get(i), 'i' is the index of the item you want (starting with 0)
         * So for example, if input = {4,2,7}, then input.get(0) = 4, and input.get(2) =
         * 7
         * 
         * For output.add(x), x is the value you want to add to output
         * For example, imagine that output = {6}. If you call output.add(1), NOW output
         * = {6,1}
         * 
         * To help you get started, here's a small hint:
         * You'll need to loop through input at least once, so a 'for' loop is a good
         * place to start
         * 
         * You can tell when everything is working by running the tests in
         * SorterTest.java
         * You can also look at that code to see what isn't working yet
         */
        List<Integer> mutableList = new ArrayList<>(input); // Input is not mutable, so we have to take a list of input

        int testValue = mutableList.size(); // testValue is to make sure we can keep the ammount of times we have to
                                            // loop through the list

        for (int i = 0; i < testValue; i++) { // start the sorter
            int smallNumber = mutableList.get(0); // smallNumber is the variable that takes the smallest number, it will
                                                  // start with the first number
            int push = 0; // push basically gives the index of the smallest Number so we can remove it

            for (int n = 0; n < mutableList.size(); n++) { // this is where the main sorter is, it goes through
                                                           // mutableList to find the smallest values

                if ((smallNumber > mutableList.get(n))) { // if the value at where n is on mutableList is bigger than
                                                          // smallNumber...
                    smallNumber = mutableList.get(n); // smallNumber will steal that value
                    push = n; // and push will target it to be removed
                }
            }
            output.add(smallNumber); // and then, we add it to output
            mutableList.remove(push); // and remove the smallest number on mutableList
        }

        return output;
    }
}