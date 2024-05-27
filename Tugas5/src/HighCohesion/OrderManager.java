package HighCohesion;

class OrderManager {
    public void takeOrder(String order) {
        System.out.println("Order taken: " + order);
    }

    public void prepareOrder(String order) {
        System.out.println("Order prepared: " + order);
    }
}
