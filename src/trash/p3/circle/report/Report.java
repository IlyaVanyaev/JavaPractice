package trash.p3.circle.report;

import java.text.DecimalFormat;
import java.util.Formatter;

public class Report {
    public static void generateReport(){
        Formatter fm = new Formatter();
        DecimalFormat df = new DecimalFormat();
        EmployeeList x = new EmployeeList();
        for (int i = 0; i < x.getamount(); i++){
            System.out.printf(
                    """
                            %s, salary: %s
                            """, x.getEmployee(i), df.format(x.getSalary(i))
            );
        }
    }

    public static void main(String[] args){
        generateReport();
    }
}
