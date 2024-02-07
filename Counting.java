public class Counting {
    public static void main(String[] args) {
        String type = "";
        int total = 0;

        //to cycle through from 1 to 100, determine if the number is even or odd, print out the number and its type, and add it to a running total
        for (int i=1;i<=100;i++){

            //to determine if the number is even or odd
            if (i%2 == 0) {
                type = "even";
            }else {
                type = "odd";
            }

            //to add the number to a running total
            total = i + total;

            //to print out the number and its type
            System.out.println(i + "\t" + type);
        }
        
        //to print out the running total of all of the numbers
        System.out.println("total = " + total);
    }
    
}
