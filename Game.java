package com.company;


import java.util.Scanner;

/**
 * Created by MT-2016 on 7/17/2016.
 */

        /*     try {
           System.out.println("Pleas Enter Number : ");
           int num = getnum.nextInt();
       }
       catch (Exception e){
           System.out.println(e);
       }*/

public class Game {
    Scanner getnum = new Scanner(System.in);
    GenreateNumbers num = new GenreateNumbers();
    int GenreateNum =  num.GenreateNumber();
    public   void StartGame(){
        int retry = 0;
        String get;
        int num;
        do{
        retry++;
        System.out.println("Start Game");
        System.out.println("Pleas Enter Number 1 To 9: ");
        num = getnum.nextInt();
        if(num == GenreateNum) {
            System.out.println("YOU WIN");
        }
            else{
            System.out.println("Lost");
        }
            System.out.println("Do You To Want To More Press Y");
            get = getnum.next();
        }

        while(get.equalsIgnoreCase("y") && retry < 4);
        }

}
