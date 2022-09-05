public class Main{

    public static void main(String[]args) {
        // GREAT JOB! :D
        System.out.println("Group Project YAY!!");
        System.out.println("Hello World! ");
        System.out.println(fahrenheit2celsius(32));

        
    }
    public static double fahrenheit2celsius(int farhenheit)
    {
        double celsius=0.0;
        celsius= farhenheit -32;
        celsius*= (5/9);
        return (double) celsius;

    }


}