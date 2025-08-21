package com.itheima.demo6_lock;

public class Consumer extends Thread {
    public Consumer() {
    }

    public Consumer(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    System.out.println(getName()+"吃饱了");
                    break;
                } else {
                    if (Desk.deskFlag == 0) {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        Desk.count--;
                        System.out.println(getName() + "吃了一碗面条,还可以吃" + Desk.count + "碗面条");
                        Desk.lock.notifyAll();
                        Desk.deskFlag = 0;
                    }
                }

            }
        }
    }
}
