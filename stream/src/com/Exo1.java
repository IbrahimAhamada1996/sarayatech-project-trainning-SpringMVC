package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exo1 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,6,3,9,8,6,7,4,5,2,65,98,6,99);

        integerList.stream().filter(n->n%5==0).forEach(System.out::println);

        System.out.println("***********************");

        integerList.stream().filter(a-> {
            int cpt = 2;
            for (int i = 2; i <a ; i++) {
                if (a%i==0){
                    cpt++;
                    break;
                }
            }
            return cpt==2;
        }).forEach(System.out::println);

        System.out.println("***********************");

        integerList.stream().filter(a-> {
            int somme = 0;
            for (int i = 2; i <a ; i++) {
                if (a%i==0){
                   somme +=i;
                }
            }
            return a==somme;
        }).forEach(System.out::println);


    }
}
