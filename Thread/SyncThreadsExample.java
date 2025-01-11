// Implement three classes: Storage, Counter, and Printer.
//  The Storage class should store an integer.
//  The Counter class should create a thread that starts counting from 0 (0, 1, 2, 3 ...) and
// stores each value in the Storage class.
//  The Printer class should create a thread that keeps reading the value in the Storage class
// and printing it.
//  Write a program that creates an instance of the Storage class and sets up a Counter and
// a Printer object to operate on it. Ensure that each number is printed exactly once, by
// adding suitable synchronization.


class Storage {
    private int value;
    private boolean valueSet = false; // To ensure synchronization

    // Method to store a value
    public synchronized void store(int value) {
        while (valueSet) {  // Wait if the value is already set
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.value = value;
        valueSet = true;  // Mark value as set
        notify();  // Notify Printer to print the value
    }

    // Method to retrieve the stored value
    public synchronized int retrieve() {
        while (!valueSet) {  // Wait if value is not set yet
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        valueSet = false;  // Mark value as not set for next storing
        notify();  // Notify Counter to store next value
        return value;
    }
}

class Counter extends Thread {
    private Storage storage;

    public Counter(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 10) {  // Store 10 values
            storage.store(i);
            System.out.println("Stored: " + i);
            i++;
        }
    }
}

class Printer extends Thread {
    private Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        int count = 0;
        while (count < 10) {  // Print 10 values
            int value = storage.retrieve();
            System.out.println("Printed: " + value);
            count++;
        }
    }
}

public class SyncThreadsExample {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Counter counter = new Counter(storage);
        Printer printer = new Printer(storage);

        // Start both threads
        counter.start();
        printer.start();
    }
}


// output:
// PS D:\JAVA\threads>  & 'C:\Program Files\Java\jdk-22\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\aasim\AppData\Roaming\Code\User\workspaceStorage\457fb3b38a766af84e194c1bb011eec5\redhat.java\jdt_ws\threads_54a569b5\bin' 'SyncThreadsExample' 
// Printed: 0
// Stored: 0
// Stored: 1
// Stored: 2
// Printed: 1
// Printed: 2
// Printed: 3
// Stored: 3
// Stored: 4
// Printed: 4
// Stored: 5
// Printed: 5
// Stored: 6
// Stored: 7
// Printed: 6
// Printed: 7
// Stored: 8
// Stored: 9
// Printed: 8
// Printed: 9
// PS D:\JAVA\threads> 