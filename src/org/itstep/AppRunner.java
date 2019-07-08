package org.itstep;


import org.itstep.model.ConnectionData;
import org.itstep.service.FileManagerService;
import org.itstep.util.Randomizer;

import java.util.Date;

public class AppRunner {
    public static void main(String[] args) {

//        Date date = new Date();  // текущие время
//        System.out.println(date);
//        System.out.println(date.getTime());
//        date = new Date(0);  //  + 2 часа
//        System.out.println(date);
//        date = new Date(Long.MAX_VALUE);
//        System.out.println(date);
       // System.out.println(new Date());

        for (int i = 0; i < 101; i++) {
            AppMultiRunner appMultiRunner = new AppMultiRunner();
            appMultiRunner.start();
        }
    }
}
