import java.util.Scanner;

public class user {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String userName, password,reset, newPassword;

        System.out.print("Enter Your User Name: ");
        userName=input.nextLine();
        System.out.print("Enter Your Password: ");
        password=input.nextLine();

        if (userName.equals("eralp")  && password.equals("java123")){
            System.out.print("Acces Verified");
        }else{
            System.out.print("You've entered the wrong password. If you want to reset it choose \"yes\" if you don't choose \"no\"");
            reset=input.nextLine();

            if (reset.equals("no")){
                System.out.print("Entry Ended");
            }
            else if (reset.equals("yes")){
                System.out.print("Enter your new password: ");
                newPassword= input.nextLine();

                if (newPassword.equals("java123")){
                    System.out.print("Try Again");
                }
                else {
                    System.out.print("Your password has been changed");
                }
            }
            else{
                System.out.print("You made the  wrong choice");
            }
        }
    }
}
