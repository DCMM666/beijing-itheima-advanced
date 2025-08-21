package com.itheima.demo6_lock;

public class cook extends Thread {
    public cook() {
    }

    public cook(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.deskFlag == 0) {
                        Desk.lock.notifyAll();
                        System.out.println(getName()+"做了一碗面条!");
                        Desk.deskFlag = 1;
                    }else {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
