package co.com.screenplay.project.utils;

import java.time.Duration;

public class Time {

    private Time () {
    }
    public static void waiting(int waiting){
        try{
            Thread.sleep(waiting * 1000L);
        }catch (InterruptedException e){
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
