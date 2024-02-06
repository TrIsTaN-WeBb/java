public class CountingArrays {
    public static void main(String[] args) {
        int[] array = new int[100];
        String type = "";
        int total = 0;

        //to store the numbers from 1-100 inside of an array
        for (int i=1;i<=100;i++){
            array[i-1]=i;
        }

        //to print out each number stored in the array, whether it is even or odd, and the overall total
        for (int i=0;i<array.length;i++){

            //to check each number in the array for even or odd
            if (array[i]%2 == 0) {
                type = "even";
            }else {
                type = "odd";
            }

            //to add each number in the array to a total
            total += array[i];

            //to print the value stored in the array and whether it is even or odd
            System.out.println(array[i] + "\t" + type);
        }
        
        //to print the total of all of the numbers in the array
        System.out.println("total = " + total);
    }
    
}
