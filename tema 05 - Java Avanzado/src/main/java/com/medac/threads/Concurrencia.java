package com.medac.threads;

public class Concurrencia {
    String texto = "";

    public static void main(String[] args) throws Throwable {
        Concurrencia concurrencia  = new Concurrencia();
        MiThread2 t1 = new MiThread2(concurrencia,100);
        MiThread2 t2 = new MiThread2(concurrencia,50);

        t1.start();
        t2.start ();
    }
}

class MiThread2 extends  Thread
{
    Concurrencia concurrencia;
    int pausa;
    public MiThread2(Concurrencia concurrencia, int pausa)
    {
        this.concurrencia =concurrencia;
        this.pausa=pausa;
    }
    @Override
    public void run() {
        for (int n=0;n<10;n++)
        {

            try {
                concurrencia.texto="Thread: "+Thread.currentThread().getName()+ " Pos: "+n+"\t-- Texto puesto a valor: "+n;
                System.out.println("PUESTO "+ concurrencia.texto);

                Thread.sleep(pausa);
                System.out.println("RECOGIDO "+"Thread: "+Thread.currentThread().getName()+ " Pos: "+n+"\t Valor de texto: "+
                        concurrencia.texto);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
