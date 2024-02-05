package day05_loops;

public class FINRA {

    public static void main(String[] args) {

        String result = "";

        for (int i = 1; i < 101; i++) {

            if (i % 15 == 0) {
                System.out.print("FINRA ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else {
                System.out.print(i + " ");
            }

        }

        System.out.println(result);

    }
    }

