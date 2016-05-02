/**
 * Created by apple on 03-May-16.
 */
import com.sun.org.apache.xpath.internal.SourceTree;

import java.sql.SQLOutput;
import java.util.*;
public class game {
    public static void main(String [] args)
    {
        final int num = 6;
        int getnum,i=0;
        String name,game;
        char getchar='y';
        game = "\n \n \t \t \t Number  GAME!!!";
        Scanner getval = new Scanner(System.in);
        System.out.println(game);
        System.out.print("Enter Gamer Name : ");
        name  = getval.nextLine();
        System.out.println("Now Game Start...");
        System.out.println("\n\t\tEnter Number Between \'0\' To \'9\'");
        getnum = getval.nextInt();
        do {
            switch (getnum) {
                case num:
                    System.out.println("\t\tYou Win Hurry!!!");
                    break;
                case 2:
                    System.out.println("\t\tYou lose Opps...");
                    break;
                default:
                    System.out.println("Not Recoginnzed ");
            }

            System.out.println("Do You Want To more press Y");
            //getchar = getval.nextline();
            i++;
        }
        while((getchar == 'y'||getchar == 'Y')&& i<4);


        }

}
