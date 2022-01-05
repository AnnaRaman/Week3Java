package com.spartaglobal.aor.calculator.algs;

public class BubbleSort {
    private int numComps = 0;
    private int numSwaps = 0;
    boolean done = false;

    public int getNumComps() {
        return numComps;
    }

    public int getNumSwaps() {
        return numSwaps;
    }

    public int[] sort(int[] theArray){
        numComps = 0;
        numSwaps = 0;
        int max = theArray.length -1;
        int i=0;
        while(!done && i < theArray.length - 1) {
            done = true;
            for (int j=0; j <max; j++) {
                numComps++;
                if(theArray[j] > theArray[j+1]) {
                    var temp = theArray[j];
                    theArray[j] = theArray[j+1];
                    theArray[j+1] = temp;
                    numSwaps ++;
                    done = false;
                }
            }
            max--;
        }
        return theArray;
    }
}
