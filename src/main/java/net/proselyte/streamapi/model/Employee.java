package net.proselyte.streamapi.model;

public class Employee {
    private int id;
    private String fName;
    private String lName;
    private String isManager;
    private double salary;

    public Employee(int id, String fName, String lName, String isManager, double salary) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.isManager = isManager;
        this.salary = salary;
    }

    public Employee() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getIsManager() {
        return isManager;
    }

    public void setIsManager(String isManager) {
        this.isManager = isManager;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", isManager=" + isManager +
                ", salary=" + salary +
                '}';
    }
}
