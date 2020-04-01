package com.company;


import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        if(A.length == 0){
            return -1;
        }

        if(A.length == 1){
            return 0;
        }

        if(A.length == 2 && A[0] != A[1]){
            return -1;
        }



        SortedMap<Integer, Integer> liczbaDominujaca = new TreeMap<Integer, Integer>();
        int maxWartosc = 0;
        for(int i = 0, wartoscDoWstawienia = 0; i < A.length;++i){
            if(liczbaDominujaca.get(A[i]) == null){
                wartoscDoWstawienia = 1;
                liczbaDominujaca.put(new Integer(A[i]), new Integer(wartoscDoWstawienia);
            }
            else{
                wartoscDoWstawienia = liczbaDominujaca.get(A[i]) +1;
                liczbaDominujaca.put(A[i],wartoscDoWstawienia);
                if( maxWartosc < wartoscDoWstawienia){
                    maxWartosc = wartoscDoWstawienia;
                }

                if(wartoscDoWstawienia > A.length/2){
                    return i;
                }
            }


        if((A.length)-(i+1) + maxWartosc < A.length/2){
            return -1;
        }
        }



    return -1;
    }
}