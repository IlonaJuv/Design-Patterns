public abstract class SalaryRequestHandler {

    private SalaryRequestHandler successor;

    public void setSuccessor(SalaryRequestHandler successor) {
        this.successor = successor;
    }
    public void processRequest(SalaryRequest request) {
        if (successor != null)
            successor.processRequest(request);
    }
}