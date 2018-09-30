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
            System.out.println("Funkcja: "+employee.toString()+"\t BRAK DOSTĘPU");
        }
    }

    @Override
    public boolean hasPermisson() {
        return false;
    }
}
