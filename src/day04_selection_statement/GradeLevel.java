package day04_selection_statement;

public class GradeLevel {

    public static void main(String[] args) {

        byte number = 15;
        String gradeLevel = "";

        boolean validNumber = number >= 1 && number <= 18;

        if (validNumber) { // 1 ~ 18

            if (number >= 17) {
                gradeLevel = "Grad School";
            } else if (number >= 13) {
                gradeLevel = "College";
            } else if (number >= 9) {
                gradeLevel = "High School";
            } else if (number >= 6) {
                gradeLevel = "Middle School";
            } else if (number >= 1) {
                gradeLevel = "Elementary School";
            }

        } else {
            gradeLevel = "Invalid Grade Level";
        }


        System.out.println(gradeLevel);

    }
    }

