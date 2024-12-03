package org.juaracoding;

/*
IntelliJ IDEA 2024.3 (Ultimate Edition)
Build #IU-243.21565.193, built on November 13, 2024
@Author Dell Erlan Prambudi
Java Developer
Created on 12/3/2024 4:48 PM
@Last Modified 12/3/2024 4:48 PM
Version 1.0
*/

public class PassingByValue {

        public static void main(String[] args) {
            int z = 15;
            ubahVariable(z);
            System.out.println(z);
        }

        public static void ubahVariable(int m){
            m = 14;
        }
}
