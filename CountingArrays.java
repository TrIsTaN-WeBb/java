public class CountingArrays {
    public static void main(String[] args) {
        int[] array = new int[100];
        String type = "";
        int total = 0;

        for (int i=1;i<=100;i++){
            array[i-1]=i;
        }

        for (int i=0;i<array.length;i++){
            if (array[i]%2 == 0) {
                type = "even";
            }else {
                type = "odd";
            }
            total += array[i];
            System.out.println(array[i] + "\t" + type);
        }
        
        System.out.println("total = " + total);
    }
    
}
