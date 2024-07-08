package com.medac.threads;

public class Hilo1 implements  Runnable{
    public static void main(String[] args) throws Throwable{

        new Thread(new Hilo1()).start();
        for (int n=0;n<10;n++)
        {
            System.out.println("En hilo principal: "+Thread.currentThread().getName()+"  N: "+n);
            Thread.sleep(1000);
        }
    }

    @Override
    public void run() {

        for (int n=0;n<10;n++)
        {
            System.out.println("En hilo secundario: "+Thread.currentThread().getName()+"  N: "+n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
