package com.company;

import java.util.Random;

/**
 * Created by MT-2016 on 7/17/2016.
 */
public class GenreateNumbers {
    public int GenreateNumber(){
        int genreateNum;
        do {
        genreateNum = (int) (10 * Math.random());
        }
        while(genreateNum < 1 && genreateNum < 9 );
        return  genreateNum;
    }

}
