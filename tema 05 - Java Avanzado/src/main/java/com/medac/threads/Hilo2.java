package com.medac.threads;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hilo2 {
    static SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss S");
    public static void main(String[] args) throws Throwable{
        Thread t1=new MiThread("Programar");
        t1.start();

        for (int n=0;n<10;n++)
        {
            System.out.println("Hora: "+sdf.format(new Date())+ " - En hilo principal: "+Thread.currentThread().getName()+"  N: "+n);
            Thread.sleep(500);
        }
    }
}
class MiThread extends Thread
{
    String trabajo;
    public MiThread(String trabajo)
    {
        this.trabajo=trabajo;
    }
    public void run() {
        Thread.currentThread().setName("Hilo2");
        for (int n=0;n<10;n++)
        {
            System.out.println("Hora: "+Hilo2.sdf.format(new Date())+
                    " - Realizando trabajo: "+trabajo+ "... En hilo con nombre: "+Thread.currentThread().getName()+"  N: "+n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}