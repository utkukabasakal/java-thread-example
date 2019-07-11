package com.company;

public class KronometreThread implements Runnable{
    private Thread thread;
    private String threadName;
    //
    public KronometreThread(String threadName){
        this.setThreadName(threadName);
        System.out.println("Olusturuluyor : " +threadName);
    }
    @Override
    public void run() {
        System.out.println("Calıstırılıyor : " + getThreadName());

        for(int i=1; i<=10; i++){
            System.out.println(getThreadName() + " : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread bitti : "+ getThreadName());
    }
    //
    public void start(){
        System.out.println("Thread nesnesi olusuyor");
        if(getThread() ==null){
            setThread(new Thread(this, getThreadName()));
            getThread().start();
        }
    }
    //
    public Thread getThread() {
        return thread;
    }
    //
    public void setThread(Thread thread) {
        this.thread = thread;
    }
    //
    public String getThreadName() {
        return threadName;
    }
    //
    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }
}
