import java.util.Scanner;

public class MultiThreadExample {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java MultiThreadExample <main-sleep-time> <prime-thread-sleep-time>");
            return;
        }

        int mainSleepTime = Integer.parseInt(args[0]);
        int primeThreadSleepTime = Integer.parseInt(args[1]);
        Scanner scanner = new Scanner(System.in);

        PrimeThread primeThread = new PrimeThread(primeThreadSleepTime);
        WorkerThread t1 = new WorkerThread("T1");
        WorkerThread t2 = new WorkerThread("T2");

        primeThread.setT1(t1);

        primeThread.start();
        t1.start();
        t2.start();

        new Thread(() -> {
            try (Scanner sc = new Scanner(System.in)) {
                while (true) {
                    String input = scanner.nextLine();
                    System.out.println("Input received: " + input); // Debugging line
                    if (input.equals("1")) {
                        t1.stopThread();
                        System.out.println("T1 stopped");
                    } else if (input.equals("2")) {
                        t2.stopThread();
                        System.out.println("T2 stopped");
                    } else if (input.isEmpty()) {
                        primeThread.stopThread();
                        System.out.println("PrimeThread stopped");
                        break;
                    }
                }
            }
        }).start();
        
       
        try {
            while (primeThread.isAlive() || t1.isAlive() || t2.isAlive()) {
                Thread.sleep(mainSleepTime);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting");
    }
}

class PrimeThread extends Thread {
    private volatile boolean running = true;
    private final int sleepTime;
    private WorkerThread t1;

    public PrimeThread(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    public void setT1(WorkerThread t1) {
        this.t1 = t1;
    }

    public void stopThread() {
        running = false;
    }

    @Override
    public void run() {
        int num = 2;
        while (running) {
            if (isPrime(num)) {
                System.out.println("PrimeThread: " + num);
                if (num == 13 && t1 != null) {
                    synchronized (t1) {
                        try {
                            System.out.println("T1 is going to wait after 13");
                            t1.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } else if (num == 79 && t1 != null) {
                    synchronized (t1) {
                        t1.notify();
                        System.out.println("T1 is resumed after 79");
                    }
                }
            }
            num++;
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

class WorkerThread extends Thread {
    private volatile boolean running = true;
    private final String name;

    public WorkerThread(String name) {
        this.name = name;
    }

    public void stopThread() {
        running = false;
    }

    @Override
    public void run() {
        while (running) {
            System.out.println(name + " is working");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " has stopped");
    }
}


// output:
// PS D:\JAVA\threads>  d:; cd 'd:\JAVA\threads'; & 'C:\Program Files\Java\jdk-22\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\aasim\AppData\Roaming\Code\User\workspaceStorage\457fb3b38a766af84e194c1bb011eec5\redhat.java\jdt_ws\threads_54a569b5\bin' 'MultiThreadExample'
// Usage: java MultiThreadExample <main-sleep-time> <prime-thread-sleep-time>
// PS D:\JAVA\threads> java MultiThreadExample 100 50                                                                           
// T1 is working                                                                                                                
// T2 is working
// PrimeThread: 2
// PrimeThread: 3
// PrimeThread: 5
// PrimeThread: 7
// PrimeThread: 11
// 1PrimeThread: 13
// T1 is going to wait after 13

// T1 stopped
// T2 is working
// T1 has stopped
// PrimeThread: 17
// PrimeThread: 19
// PrimeThread: 23
// 2PrimeThread: 29
// T2 is working
// PrimeThread: 31

// T2 stopped
// PrimeThread: 37
// PrimeThread: 41
// PrimeThread: 43
// T2 has stopped
// PrimeThread: 47
// PrimeThread: 53
// 2PrimeThread: 59
// PrimeThread: 61

// T2 stopped
// PrimeThread: 67
// PrimeThread: 71
// PrimeThread: 73
// 1PrimeThread: 79
// T1 is resumed after 79

// T1 stopped
// PrimeThread: 83
// PrimeThread: 89
// 1PrimeThread: 97

// T1 stopped
// PrimeThread: 101
// PrimeThread: 103
// PrimeThread: 107
// PrimeThread: 109
// 2PrimeThread: 113

// T2 stopped
// PrimeThread: 127
// PrimeThread: 131
// PrimeThread: 137
// PrimeThread: 139
// 2PrimeThread: 149
// PrimeThread: 151

// T2 stopped
// PrimeThread: 157
// PrimeThread: 163
// 2PrimeThread: 167
// PrimeThread: 173

// T2 stopped
// PrimeThread: 179
// PrimeThread: 181
// PrimeThread: 191
// PrimeThread: 193
// PrimeThread: 197
// PrimeThread: 199
// 2PrimeThread: 211

// T2 stopped
// PrimeThread: 223
// 1PrimeThread: 227
// PrimeThread: 229
// PrimeThread: 233

// T1 stopped
// PrimeThread: 239
// PrimeThread: 241
// 2PrimeThread: 251

// T2 stopped
// PrimeThread: 257
// PrimeThread: 263
// PrimeThread: 269
// PrimeThread: 271
// PrimeThread: 277
// PrimeThread: 281
// PrimeThread: 283
// 1
// T1 stopped
// PrimeThread: 293
// PrimeThread: 307
// PrimeThread: 311
// PrimeThread: 313
// PrimeThread: 317
// PrimeThread: 331
// PrimeThread: 337
// PrimeThread: 347
// PrimeThread: 349
// PrimeThread: 353
// PrimeThread: 359
// PrimeThread: 367
// PrimeThread: 373
// PrimeThread: 379
// PrimeThread: 383
// PrimeThread: 389
// PrimeThread: 397
// PrimeThread: 401
// PrimeThread: 409
// PrimeThread: 419
// PrimeThread: 421
// PrimeThread: 431
// PrimeThread: 433

// PrimeThread stopped
// Main thread exiting
// PS D:\JAVA\threads> 