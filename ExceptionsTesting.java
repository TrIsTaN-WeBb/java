//Tristan Webb tristan.webb@malad.us
//for CTE software development 1
//instructor Mr Gross

public class ExceptionsTesting {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // an array of numbers

        try {
            System.out.println(array[5]); //is supposed to attempt to print a number that is outside of the array, creating an exception
        }
        catch (ArrayIndexOutOfBoundsException e){ //catches the array index exception
            System.out.println("Array out of bounds"); //prints the exception
        }

        try{
            array[0] = 89/0; //is supposed to create an exception by attempting to set a value in the array to a number divided by zero 
        }
        catch(ArithmeticException e){ //catches the division exception
            System.out.println("Can't divide by zero"); //prints the exception
        }

        System.out.println("Program caught errors and closed without crashing."); //prints out that the program continued regardless of the exceptiong
    }

}
