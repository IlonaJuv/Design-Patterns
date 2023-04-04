public class DepartmentHead extends SalaryRequestHandler{

    private final double LIMIT = 5;

    @Override
    public void processRequest(SalaryRequest request) {
        if (request.getAskedPercent() < LIMIT)
            System.out.println("Department head can approve " + request.getAskedPercent() + "% salary raise");
        else
        super.processRequest(request);
    }
}
