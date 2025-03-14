package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Customer Nikoo = new Customer("Nikoo", "Nabavi", "Nikoonam123");
        Customer Søren = new Customer("Søren", "Hansen", "Hans420");
        Customer Johan = new Customer("Johan", "Jensen", "JensJ");
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(Nikoo); customers.add(Søren); customers.add(Johan);

        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers){
        for (Customer c : customers){
            System.out.println(c);
        }
    }
}