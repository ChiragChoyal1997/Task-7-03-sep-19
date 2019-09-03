package com.manage.employeethreads;

public class ManageEmpSalaryThreads {
    public static void main(String[] args) {
        EmployeeWithThread e1 = new EmployeeWithThread(1, "Chirag Choyal", 25000);
        EmployeeWithThread e2 = new EmployeeWithThread(2, "Amrendra Bagga", 25000);
        EmployeeWithThread e3 = new EmployeeWithThread(3, "Anuj Jhawar", 30000);
        EmployeeWithThread e4 = new EmployeeWithThread(4, "Anuj Pawar", 45000);
        EmployeeWithThread e5 = new EmployeeWithThread(5, "Tanish Sharma", 50000);
        
        e1.start();
        e2.start();
        e3.start();
        e4.start();
        e5.start();
        
    }
    
}
