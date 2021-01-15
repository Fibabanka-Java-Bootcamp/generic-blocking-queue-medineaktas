package org.kodluyoruz;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BlockingQueue root = new BlockingQueue();

        Runnable insertThread1 = () -> {
            root.add(1);
        };
        Runnable insertThread2 = () -> {
            root.add(2);
        };
        Runnable insertThread3 = () -> {
            root.add(3);
        };
        Runnable insertThread4 = () -> {
            root.add(4);
        };
        Runnable insertThread5 = () -> {
            root.add(5);
        };
        Runnable insertThread6 = () -> {
            root.add("deneme1");
        };
        Runnable insertThread7 = () -> {
            root.add("deneme2");
        };
        Runnable insertThread8 = () -> {
            root.add("deneme3");
        };
        Runnable popThread1 = () -> {
            root.poll();
        };
        Runnable popThread2 = () -> {
            root.poll();
        };
        Runnable popThread3 = () -> {
            root.poll();
        };
        Runnable popThread4 = () -> {
            root.poll();
        };
        Runnable popThread5 = () -> {
            root.poll();
        };
        Runnable popThread6 = () -> {
            root.poll();
        };
        Runnable popThread7 = () -> {
            root.poll();
        };
        Runnable popThread8 = () -> {
            root.poll();
        };
        Runnable popThread9 = () -> {
            root.poll();
        };


        try {
            new Thread(insertThread1).start();
            new Thread(insertThread2).start();
            new Thread(insertThread3).start();
            new Thread(insertThread4).start();
            new Thread(insertThread5).start();
            new Thread(insertThread6).start();
            new Thread(insertThread7).start();
            new Thread(insertThread8).start();
            new Thread(popThread1).start();
            new Thread(popThread2).start();
            new Thread(popThread3).start();
            new Thread(popThread4).start();
            new Thread(popThread5).start();
            new Thread(popThread6).start();
            new Thread(popThread7).start();
            new Thread(popThread8).start();
        } catch (NullPointerException e){
            System.out.println("Error: "+e.getMessage());
        }






    }
}
