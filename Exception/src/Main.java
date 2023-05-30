import java.util.Scanner;

public class Main {
    public static int[] arr = new int[]{1,2,3,4,5,6,7};

    public static Scanner scanner = new Scanner(System.in);
    static String str = scanner.nextLine();
    public static void main(String[] args) {

        try {
            NumCheck.printResult();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            NumCheck2.printResult2();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    static class NumCheck {

        public static void printResult() throws ArrayException {
            if (arr.length < 8) {
                System.out.println("zapis yspeshno dobavlena");
            } else
                throw new ArrayException("bolshoe chislo", arr.length);
        }


    }static class NumCheck2 {

        public static void printResult2() throws StringException {
            if (str == "") {
                System.out.println("zapis yspeshno dobavlena");
            } else
                throw new StringException("bolshoe chislo", str);
        }


    }


}

