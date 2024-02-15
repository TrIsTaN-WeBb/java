public class Sorting {

//Tristan Webb tristan.webb@malad.us

//for CTE software development 1

//instructor Mr Gross
    
    public static void main(String[] args){
        int[] arrayToSort={1,3,4,5,1,23,57,126,4,543,345,23,12,45,67,97};// this creates the array.

        boolean isSorted=false; // This signals when the array is sorted.
        int indexToSwap=0;  // placeholder for the index of the array
        int sortLength=arrayToSort.length-1; // placeholder for how much of the array needs sorted

        System.out.println("Unsorted Array:");
        printArray(arrayToSort); // Print out the unsorted array.

        while (!isSorted) {
            
            //check to see if this item in the array is sorted
            if(arrayToSort[indexToSwap]>arrayToSort[indexToSwap+1]){
                arrayToSort=swapTwoArrayElements(arrayToSort, indexToSwap);
            }
            
            indexToSwap++; //to increment the index

            //check to see if we've gone through the whole array
            if (indexToSwap==sortLength) {
                indexToSwap=0; //set indexToSwap to zero to start over at the beginning of the array
                sortLength--; //decrease the amount of the array that is sorted because the last item in the list doesn't need to be looked at anymore

                //check to see if the entire list has been sorted
                if (sortLength==1){
                    isSorted=true; //exit the loop
                }
            
            }
        }

        System.out.println("Sorted Array:");
        printArray(arrayToSort); // Print out the sorted array.

    }

    //Swap function by kimg@techtrepacademy.com
    //this function will take a array of ints and the lower index as an int and then return the array with the two items swapped.

    static int[] swapTwoArrayElements(int[] arrayToSwap, int lowerIndex){

        int temp;

        temp=arrayToSwap[lowerIndex];

        arrayToSwap[lowerIndex]=arrayToSwap[lowerIndex+1];

        arrayToSwap[lowerIndex+1]=temp;

        return arrayToSwap;

    }

    // Function to print out an array.
    static boolean printArray(int[] arrayToPrint){
        
        //using a for loop, print out the values of an array
        for(int i=0; i<arrayToPrint.length; i++){
            System.out.println(arrayToPrint[i]);
        }

        return true; // to satisfy the function requirements (not used)
    }
}