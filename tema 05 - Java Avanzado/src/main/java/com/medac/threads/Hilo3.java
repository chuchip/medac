package com.medac.threads;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hilo3 implements  Runnable {
    static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss S");

    public static void main(String[] args) throws Throwable {
        Thread t1 = new Thread(new Hilo3(), "t1");
        Thread t2 = new Thread(new Hilo3(), "t2");
        Thread t3 = new Thread(new Hilo3(), "t3");
        t1.start();
        t1.setPriority(Thread.MAX_PRIORITY);

        // Esperamos 2 segundos antes de empezar el segundo hilo
        try {
            t1.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

        // Empezamos el tercer hilo solo cuando el primer hilo este terminado
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();

        // Esperamos que todos los hilos terminen antes de terminar el hilo principal
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hora: " + sdf.format(new Date()) + " - Todos los hilos han finalizados. Termina el hilo principal");
    }


    @Override
    public void run() {

        System.out.println("Hora: "+sdf.format(new Date())+" - Comienza hilo:"+Thread.currentThread().getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hora: "+sdf.format(new Date())+" - Termina hilo:"+Thread.currentThread().getName());
    }
}
