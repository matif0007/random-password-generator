import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;


interface passwordgenrator{
    String generatepassword(int length);
}


class RandomPasswordGenerator implements passwordgenrator {

    @Override
    public  String generatepassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" + "0123456789" + "!@#$%^&*";

        Random rand = new Random();
        String password = "";

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(characters.length());
            password += characters.charAt(index);
        }

        return password;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        passwordgenrator pg=new RandomPasswordGenerator();
char choice;
do {
    System.out.println("CHOOSE AN OPTION");
    System.out.println("A.generate a password");
    System.out.println("B.exit");
choice=sc.next().charAt(0);



switch (choice) {
    case 'a':
    try {
        System.out.print("Enter password length: ");
        int length = sc.nextInt();
        if (length <= 0) {
            System.out.println("enter a positive interger");
        } else {
            String password =pg.generatepassword(length);
            System.out.println("Generated Password: " + password);
        }//if, else
    } catch (InputMismatchException e) {
        System.out.println("please enter number only");
    }
    break;

    case 'b':
        System.out.println("ALLAH HAFIZ");
break;
    default:
        System.out.println("invalid option");
}//switch
}while (choice!='b');
sc.close();
    }//main
}//public


