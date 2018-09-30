package designpatterns.proxy;

public class ProxyEmlopyee implements Employee {
    private Employee employee;

    public ProxyEmlopyee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void generateTimeReport() {
        if (employee.hasPermisson()) {
            employee.generateTimeReport();
        } else {
            try {
                throw new NoPermissionException("Function: "+employee.toString()+" ACCESS DENIED");
            } catch (NoPermissionException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public boolean hasPermisson() {
        return false;
    }
}
