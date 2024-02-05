package day04_selection_statement;

public class ChooseLanguage {

    public static void main(String[] args) {

        int number = 1;

        if(number == 1){
            System.out.println("Hello, thank you for your call");
        } else if (number == 2) {
            System.out.println("Hola, gracias por llamar");
        }else if (number == 3) {
            System.out.println("Merhaba, aradığınız için teşekkürler");
        }else if (number == 4) {
            System.out.println("Привет, спасибо за ваш звонок");
        }else{
            System.out.println("Merci, pour votre appel");
        }

    }

}


