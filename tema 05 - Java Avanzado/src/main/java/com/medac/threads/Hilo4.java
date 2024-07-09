package com.medac.threads;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hilo4 implements  Runnable{
    static SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss S");

    public static void main(String[] args) throws Throwable{
        Thread t1 = new Thread(new Hilo4(), "t1");

        t1.start(); // Comienzo hilo1

        // Esperamos 2 segundos antes de empezar el segundo hilo
        try {
            t1.join(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         // t1.stop(); // NO usar!!
        System.out.println("Hora: "+sdf.format(new Date())+" - Mando señal a Hilo t1 para parar");
        t1.interrupt();

        System.out.println("Hora: "+sdf.format(new Date())+" - Todos los hilos han finalizados. Termina el hilo principal");
    }

    @Override
    public void run() {
        System.out.println("Hora: "+sdf.format(new Date())+" - Comienza hilo:"+Thread.currentThread().getName());

        for (int n=0;n<50;n++)  {
            try {
                Thread.sleep(1000);
            }  catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Me han interrumpido !!");
                break;
            }
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Fui interrumpido");
            }
            System.out.println("Hora: " + sdf.format(new Date()) + " - Continua hilo:" + Thread.currentThread().getName()+ "n: "+n);

        }

        System.out.println("Hora: "+sdf.format(new Date())+" - Termina hilo:"+Thread.currentThread().getName());
    }
}