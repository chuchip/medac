package com.medac.threads;

public class Concurrencia {
    String texto = "";

    public static void main(String[] args) throws Throwable {
        Concurrencia hilo5  = new Concurrencia();
        MiThread2 t1 = new MiThread2(hilo5,100);
        MiThread2 t2 = new MiThread2(hilo5,50);

        t1.start();
        t2.start ();
    }
}

class MiThread2 extends  Thread
{
    Concurrencia hilo5;
    int pausa;
    public MiThread2(Concurrencia hilo5, int pausa)
    {
        this.hilo5=hilo5;
        this.pausa=pausa;
    }
    @Override
    public void run() {
        for (int n=0;n<10;n++)
        {

            try {
                hilo5.texto="Thread: "+Thread.currentThread().getName()+ " Pos: "+n+"\t-- Texto puesto a valor: "+n;
                System.out.println("PUESTO "+hilo5.texto);

                Thread.sleep(pausa);
                System.out.println("RECOGIDO "+"Thread: "+Thread.currentThread().getName()+ " Pos: "+n+"\t Valor de texto: "+hilo5.texto);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
