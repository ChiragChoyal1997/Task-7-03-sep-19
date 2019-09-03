package com.manage.employeethreads;
/**
 *
 * @author Chirag
 */
public class ManageEmployeeRunnable {
    public static void main(String[] args) {
        EmployeeWithRunnable e1 = new EmployeeWithRunnable(1, "Chirag Choyal", 25000);
        EmployeeWithRunnable e2 = new EmployeeWithRunnable(2, "Amrendra Bagga", 25000);
        EmployeeWithRunnable e3 = new EmployeeWithRunnable(3, "Anuj Jhawar", 30000);
        EmployeeWithRunnable e4 = new EmployeeWithRunnable(4, "Anuj Pawar", 45000);
        EmployeeWithRunnable e5 = new EmployeeWithRunnable(5, "Tanish Sharma", 50000);
        
        Thread t1 = new Thread(e1);
        Thread t2 = new Thread(e2);
        Thread t3 = new Thread(e3);
        Thread t4 = new Thread(e4);
        Thread t5 = new Thread(e5);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
