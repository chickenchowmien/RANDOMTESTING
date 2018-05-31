package com.fourstay.stepdefinitions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String string ="aasdboaihewopieasflkqwwaoknvdkaaaaaaaaaadbbbbbbbbwwwwwww";
        new Test().go(string);
    }

    private void go(String string) {
        boolean  b = true;
        String two ="aec";
        StringBuilder builder = new StringBuilder(string);
        int counter = string.length();
        int letters = 0;
       for(int index =0; index<string.length();index++){

           for (int delete =index+1; delete< counter;){
               if (builder.charAt(index)==builder.charAt(delete)){
                   builder.deleteCharAt(delete);
                   counter--;
                   letters++;

               }else delete++;
           }
           System.out.println("");
       }





        System.out.println(builder);
    }
}
