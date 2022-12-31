package trash.p3.circle.report;

public class Employee {
    private String fullname;
    private int salary = 70000;

    Employee (String fullname){
        this.fullname = fullname;
    }

    public String getFullname() {
        return fullname;
    }

    public int setSalary() {
        return salary = (int) (Math.random() * (salary - 30000)) + 30000;
    }

    public String toString(){
        return "employee " + fullname;
    }
}
