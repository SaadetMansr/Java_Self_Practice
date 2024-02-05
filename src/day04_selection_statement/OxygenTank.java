package day04_selection_statement;

public class OxygenTank {

    public static void main(String[] args) {

        int number = 80;
        String result = "";

        if (number >= 90) {
            result = "Your tank is full";
        } else if (number >= 80) {
            result = "Still okay";
        } else if (number >= 70) {
            result = "Don't go too far";
        } else if (number >= 60) {
            result = "Start to head back";
        } else {
            result = "Be careful now you at 50%";
        }

        System.out.println(result);

    }

}


