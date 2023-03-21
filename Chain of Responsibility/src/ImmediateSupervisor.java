public class ImmediateSupervisor extends SalaryRequestHandler {
    private final double LIMIT = 2;

    @Override
    public void processRequest(SalaryRequest request) {
        if (request.getAskedPercent() <= LIMIT)
            System.out.println("Immediate supervisor can approve " + request.getAskedPercent() + "% salary raise");
        else
            super.processRequest(request);
    }
}