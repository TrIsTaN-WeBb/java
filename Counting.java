public class Counting {
    public static void main(String[] args) {
        String type = "";
        int total = 0;

        for (int i=1;i<=100;i++){
            if (i%2 == 0) {
                type = "even";
            }else {
                type = "odd";
            }
            total = i + total;
            System.out.println(i + "\t" + type);
        }
        
        System.out.println("total = " + total);
    }
    
}
