package edu.wctc;

import java.time.*;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        LocalDate l1 = LocalDate.of(1987, 3, 9);
        LocalDate l3 = LocalDate.of(1988, 10, 10);
        LocalDate l2 = LocalDate.now();
        Period yearsApart = Period.between(l1, l2);
        Period yearsApart2 = Period.between(l1, l3);
       // l3.plus()

        Period p = Period.of(1,7,1);
        LocalDate res = l3.plus(p);

        System.out.printf("%d years, %d months, and %d days ago", yearsApart.getYears(), yearsApart.getMonths(), yearsApart.getDays());
        System.out.println();
        System.out.printf("%d years, %d months, and %d days ago", yearsApart2.getYears(), yearsApart2.getMonths(), yearsApart2.getDays());
        System.out.println();
        System.out.println(res);
    }
}
