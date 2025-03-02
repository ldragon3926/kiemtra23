package com.example.kt23.service;

public class LietKe {
    public String printTu1Den100(){
        String so ="";
     for(int i = 0 ; i <= 100 ; i++){
         if (i % 5 != 0 ){
            String in = i + " ";
            so = so + in;
         }
     }
     return so;
    }
}
