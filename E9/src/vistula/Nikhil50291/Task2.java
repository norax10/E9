package vistula.Nikhil50291;


public class Task2 {

    public static void main(String[ ] args) {
        int[] Nikhil50291 = new int[]{1, 2, 3, 6, 8, 21};
        System.out.println(Nikhil50291[7]);


        try {
            Nikhil50291 = new int[]{1, 2, 3, 6 , 8 , 21};

            System.out.println(Nikhil50291[7]);
        } catch (Exception e) {
            System.out.println("Something is off.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }


    }
}
