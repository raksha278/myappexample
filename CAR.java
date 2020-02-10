import java.util.Scanner;
public class CAR {
   public static int customer_type,oldcartrade;

   public static float total_prize,admin ;

    public static void main(String[] args) {

        Scanner n =new Scanner(System.in);
        System.out.println("are you an existing customer\n press 1 if yes \n press 2 if not ");
        customer_type=n .nextInt();
        System.out.println(" Do you have an old car to trade in ?\n 1.Yes\n2.No");
        oldcartrade=n.nextInt();
        if (oldcartrade==1){
        System.out.println("[ADMIN PRIVILEGES]\nEnter the prize of the old car:");
        admin = n.nextFloat();
        }

        selectmodel();


        extra();

        System.out.println(" total price is" + total_prize+"\n\n");
        System.out.println("what modes of payment are u willing to make with?\n1.one shot payment\n2.EMI\n");
        int payment=n.nextInt();
        if(payment==1){
        float cashback=(float)(0.01*total_prize);


            System.out.println("would u prefer to get a\n1. 1% discount or\n2. choose any one extra luxury for free");
            int opt =n.nextInt();
            if(opt==1) {
                System.out.println("the cashback amount is :" + cashback);
                total_prize -= cashback;
                System.out.println("total price is " +total_prize);
            }
            if (opt==2)
            {
                int luxury_seats = 45000;
                int satellite_navigation = 5500;
                int parking_sensors = 10000;
                int bluetooth_connectivity = 350;
                int sound_system = 1000;


                int select;
                System.out.println("select the extra luxuries options required");
                System.out.println("select\n 0 luxury seats\n1 satellite navigation\n2 parking sensors\n3 bluetooth connectivity\n4 sound system\n");
                Scanner sc = new Scanner(System.in);
                select = sc.nextInt();
                if (select==0)
                {
                    System.out.println("price is :"+luxury_seats);
                    System.out.println("cashback is : "+cashback);
                    System.out.println("total price is :"+total_prize);

                }
                if(select==1){
                    System.out.println("price is :"+satellite_navigation);
                    System.out.println("cashback is : "+cashback);
                    System.out.println("total price is :"+total_prize);
                }
                if(select==2){
                    System.out.println("price is :"+parking_sensors);
                    System.out.println("cashback is : "+cashback);
                    System.out.println("total price is :"+total_prize);
                }
                if(select==3){
                    System.out.println("price is :"+bluetooth_connectivity);
                    System.out.println("cashback is : "+cashback);
                    System.out.println("total price is :"+total_prize);
                }
                if(select==4){
                    System.out.println("price is :"+sound_system);
                    System.out.println("cashback is : "+cashback);
                    System.out.println("total price is :"+total_prize);
                }
if(select>4){
    System.out.println(" invalid entry");
}

            }



        }
        if(payment==2){
            System.out.println("enter the number of months\n note:no interest till four years(48months) and the interest will be" +
                    "5% per month thereafter till 7 years(84months)\n");
            int months=n.nextInt();
            if (months<49)
            {

                System.out.println("total emi per month is :"+ (total_prize/months));
                System.out.println("total price is :"+total_prize);
            }
            else if (months >48 && months < 85) {
                months -= 48;
                for (int i = 0; i < months; i++) {
                    total_prize += (0.05 * total_prize);
                    System.out.println(" total price is "+total_prize);
                }
            }
                else
                System.out.println(" emi options are available only for seven years");
            }







    }


    public static void selectmodel() {

        System.out.println("enter the model required");
        System.out.println("enter\n 1 for hatchback\n 2 for saloon\n 3 for estate");
        Scanner sc = new Scanner(System.in);
        int model = sc.nextInt();


        if (customer_type == 1 && model == 1) {
            total_prize = 535000;
            System.out.println("the car selected is hatchback");
            System.out.println("the price of the car is 5.35lakh");

            total_prize = (float)  ((0.9) * total_prize) ;
            total_prize -= admin;
            System.out.println("total price is " + total_prize);
        }
         if (customer_type == 2 && model == 1) {
            System.out.println("the car selected is hatchback");
            System.out.println("the price of the car is 5.35lakh");
            total_prize = total_prize + 535000;
             total_prize -= admin;
             System.out.println(+total_prize);
        }
         if (customer_type == 1 && model == 2) {
             total_prize = 495000;

            System.out.println(" the car selected is saloon ");
            System.out.println("the price of the car is 4.95lakh");

            total_prize = (float)  (0.9 * total_prize);
             total_prize -= admin;
             System.out.println(+total_prize);
        }
         if (customer_type == 2 && model == 2) {
            System.out.println(" the car selected is saloon ");
            System.out.println("the price of the car is 4.95lakh");
            total_prize = total_prize + 495000;
             total_prize -= admin;
             System.out.println(+total_prize);
        }


        if (customer_type == 1 && model == 3) {
            total_prize = 625000;
            System.out.println("the car selected is estate");
            System.out.println("the price of car is 6.25lakh");

            total_prize = (float) (0.9 * total_prize);
            total_prize -= admin;
            System.out.println(+total_prize);
        }
        if (customer_type == 2 && model == 3) {
            System.out.println("the car selected is estate");
            System.out.println("the price of car is 6.25lakh");
            total_prize = 625000;
            total_prize -= admin;


            System.out.println(+total_prize);
        }
        if (customer_type >= 2 && model > 3) {
            System.out.println("invalid entry \n please try again ");
            selectmodel();
        }


    }


    public static void extra() {
        int luxury_seats = 0;
        int satellite_navigation = 1;
        int parking_sensors = 2;
        int bluetooth_connectivity = 3;
        int sound_system = 4;
        int option;

        int select;
        System.out.println("select the extra luxuries options required");
        System.out.println("select\n 0 luxury seats\n1 satellite navigation\n2 parking sensors\n3 bluetooth connectivity\n4 sound system\n");
        Scanner sc = new Scanner(System.in);
        select = sc.nextInt();
        if (select == luxury_seats&& customer_type==1) {
            System.out.println("the price for this is 45000");

            total_prize = (float) (total_prize+ (0.9) * 45000);
            System.out.println("do u want to add extra luxuries?\nyes  press 1 \n if no  press 2");
            Scanner a = new Scanner(System.in);
            option = a.nextInt();

            if (select == luxury_seats && customer_type == 2)
                total_prize = total_prize + 45000;
            if (option == 1)
                extra();
            else
                return;
        }


 


        if (select == satellite_navigation&&customer_type==1) {
            System.out.println("the price for this is 5500");
            total_prize = (float) (total_prize+ (0.9) * 5500);
            System.out.println("do u want to add extra press 1 else press 2");
            Scanner a = new Scanner(System.in);
            option = a.nextInt();
            if (select == satellite_navigation && customer_type == 2)
                total_prize = total_prize + 5500;
            if (option == 1)
                extra();
            else
                return;

        }
        if (select == parking_sensors&&customer_type==1) {
            System.out.println("the price for this is 10000");
            total_prize = (float) (total_prize+ (0.9) * 10000);
            System.out.println("Do you want to add extra options \n press 1 to continue\n else press 2 to ");
            Scanner a =new Scanner(System.in);
            option=a.nextInt();
            if (select == parking_sensors && customer_type == 2)
                total_prize = total_prize + 10000;
            if(option==1)
                extra();
            else
                return;
        }
        if (select == bluetooth_connectivity&&customer_type==1)
        {
            System.out.println("the price for this is 350");
            total_prize = (float) (total_prize+ (0.9) * 350);
            System.out.println("do u want to add extra press 1 else press 2");
            Scanner a =new Scanner(System.in);
            if (select == luxury_seats && customer_type == 2)
                total_prize = total_prize + 350;
            option=a.nextInt();
            if(option==1)
                extra();
            else
                return;
        }
        if (select == sound_system&&customer_type==1) {
            System.out.println("the price for this is 1000");
            total_prize = (float) (total_prize+ (0.9) * 1000);

            System.out.println("do u want to add extra press 1 else press 2");
            Scanner a =new Scanner(System.in);
            option=a.nextInt();
            if (select == sound_system && customer_type == 2)
                total_prize = total_prize + 1000;
            if(option==1)
                extra();
            else
                return;
        }
        if (select > 3) {
            System.out.println("invalid entry \n try again");
            extra();
        }
    }






}