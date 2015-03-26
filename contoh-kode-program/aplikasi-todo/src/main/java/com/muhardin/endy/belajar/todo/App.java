package com.muhardin.endy.belajar.todo;

import org.joda.time.DateTime;

public class App {
    public static void main( String[] xyz ) {
        System.out.println( "Hello World!" );
        DateTime sekarang = new DateTime();
        System.out.println("Tanggal hari ini : "+sekarang);

        System.out.println("10 hari kemudian : "+sekarang.plusDays(10));
    }
}
