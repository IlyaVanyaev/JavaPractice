package trash.p3.circle.report;

public class EmployeeList {
    private Employee[] m;

    EmployeeList (){
        m = new Employee[3];
        m[0] = new Employee("Ivanov Ivan Ivanovich");
        m[1] = new Employee("Alexei Alexeev Alexeevitch");
        m[2] = new Employee("Pavel Pavlov Pavlovich");
    }

    public int getamount(){
        return m.length;
    }

    public Employee getEmployee(int i){
        return m[i];
    }

    public int getSalary(int i){
        return m[i].setSalary();
    }


}
