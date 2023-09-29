import java.util.Scanner;
class TrainReservation
{
    private static final String login_Username = "User_Name";
    private static final String User_Password = "Name_User123";
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ONLINE RESERVATION SYSTEM");
        System.out.print("Please enter your Login Credentials(Username): ");
        String login_cred = sc.nextLine();
        System.out.print("Please enter your Password: ");
        String passWord = sc.nextLine();
        if (login_cred.equals(login_Username) && passWord.equals(User_Password)) 
        {
            System.out.println("You are Successfully Logged In");
            boolean reserveForms = true;
            while (reserveForms)
            {
                System.out.println("    *** MENU ***    ");
                System.out.println("1.FORM FOR RESERVATION");
                System.out.println("2.FORM FOR CANCELLATION");
                System.out.println("3.EXIT");
                System.out.print("Please enter your Choice of Option:");
                int options = sc.nextInt();
                sc.nextLine();
                switch (options)
                {
                    case 1:
                        registration_form();
                        break;
                    case 2:
                        cancellation_form();
                        break;
                    case 3:
                        reserveForms = false;
                        System.out.println("Thank You!! Come Visit Us again!");
                        break;
                    default:
                        System.out.println("PLEASE TRY AGAIN");
                }
            }
        } 
         else 
        {
            System.out.println("INVALID USERNAME OR PASSWORD OR NO USER FOUND");
            System.out.println("Please Try again!!");
        }
        sc.close();
    }

    private static void registration_form()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n"+"  ***REGISTRATION_FORM***  "+"\n");
        System.out.print("Please enter Number of Passengers:");
        int noP= sc.nextInt();
        System.out.println("Enter Number of Adults:");
        int A=sc.nextInt();
        System.out.println("Enter number of children:");
        int ch=sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter passenger Name/Names:");
        for(int i=1;i<=noP;i++)
        {
        String pass_Name = sc.nextLine();
        }
        System.out.print("Please enter the train number: ");
        int train_number = sc.nextInt();
        sc.nextLine();
        System.out.print("Please enter Date of journey: ");
        String d_o_j = sc.nextLine();
        System.out.print("Please enter the type of the class you want to travel (Sleeper/1AC/2AC/3AC): ");
        String class_Coach= sc.nextLine();
        System.out.print("Please enter the Boarding Station: ");
        String board_point = sc.nextLine();
        System.out.print("Please enter the Destination: ");
        String destination = sc.nextLine();
        System.out.println("Congratulations, You Have Successfully booked a ticket"+"\n"+"Enjoy your Trip!!!");
        System.out.println();
        //sc.close();
   }

    private static void cancellation_form() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n"+" *** TICKET CANCELLATION_FORM ***  "+"\n");
        System.out.print("Please Enter Your PNR Number :");
        String PNR_NUM = sc.nextLine();
        System.out.println("Your Ticket Is Successfully Cancelled");
        //sc.close();
    }
}