import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        ImmediateSupervisor immediateSupervisor = new ImmediateSupervisor();
        DepartmentHead depHead = new DepartmentHead();
        CEO ceo = new CEO();

        immediateSupervisor.setSuccessor(depHead);
        depHead.setSuccessor(ceo);

        try {
            while (true) {
                System.out.println("Enter the percent to check who should approve your salaryrequest (letter will finish the program");
                System.out.println(">");
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                immediateSupervisor.processRequest(new SalaryRequest(d));
            }
        } catch (Exception e) {
            System.exit(1);
        }
    }
}
