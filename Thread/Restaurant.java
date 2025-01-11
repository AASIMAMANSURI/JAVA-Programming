

// Write a program for restaurant. Use Inter Thread Communication.
//  When customer places an order then and only then Manager can take the Order or
// generate a bill of an Order.
//  And display the customer order after it place the Order.
//  You have to display minimum three orders of three different customers A, B and C, in
// which customer A is the preferred customer with higher priority.

class Restaurant {
    private String order;
    private boolean hasOrder = false;

    // Method for customers to place an order
    public synchronized void placeOrder(String order, String customerName) {
        while (hasOrder) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();    
            }
        }
        this.order = order;
        hasOrder = true;
        System.out.println(customerName + " placed an order: " + order);
        notify();
    }

    // Method for the manager to take and process the order
    public synchronized void processOrder() {
        while (!hasOrder) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Manager is processing the order: " + order);
        hasOrder = false;
        notify();
    }
}

class Customer extends Thread {
    private final Restaurant restaurant;
    private final String order;
    private final String customerName;

    public Customer(Restaurant restaurant, String order, String customerName) {
        this.restaurant = restaurant;
        this.order = order;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        restaurant.placeOrder(order, customerName);
    }
}

class Manager extends Thread {
    private final Restaurant restaurant;

    public Manager(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            restaurant.processOrder();
        }
    }
}
