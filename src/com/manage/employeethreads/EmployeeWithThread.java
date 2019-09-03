package com.manage.employeethreads;
public class EmployeeWithThread extends Thread{
    private  int eno;
    private String ename;
    private int salary;

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public EmployeeWithThread(int eno, String ename, int salary) {
        this.eno = eno;
        this.ename = ename;
        this.salary = salary;
    }   
    public void salaryStructure(){
        System.out.println(eno +" "+ename+" "+salary+" HRA is "+salary*0.1);
        System.out.println(eno +" "+ename+" "+salary+" DA is "+salary*0.25);
        System.out.println(eno +" "+ename+" "+salary+" CA is "+salary*0.1 );
    }
    @Override
    public void run(){
        salaryStructure();
    }
}
