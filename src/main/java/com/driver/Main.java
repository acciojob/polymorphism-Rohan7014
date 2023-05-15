package com.driver;
public class Main {
    public static void main(String args[]) {
        Product p = new Product();
        p.product(10, 20);
        p.product(10, 20, 30);
        p.product(10, 40);
    }
}
class Product{
    public int product(int x, int y) {
        int i= x+y;
        return i;
    }
    public int product(int x, int y, int z) {
        int i=x+y+z;
        return i;
    }
    public double product(double x, double y) {
        Double d = x + y;
        return d;
    }
}