package designpatterns.chainofresponsibility;

import java.util.HashMap;
import java.util.Map;

public abstract class StockAvaibility {
    protected static final double BASE = 300;
    protected Map<String, Integer> stock = new HashMap<String, Integer>();
    protected StockAvaibility successor;

    public boolean getAllowable(String item, Integer amout) {
        if (getStock().containsKey(item)) {
            if (getStock().get(item) >= amout) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    ;

    abstract protected String getRole();

    public void addToStock(String item, Integer amout) {
        this.stock.put(item, amout);
    }

    public Map<String, Integer> getStock() {
        return this.stock;
    }


    public StockAvaibility getSuccessor() {
        return successor;
    }

    public void setSuccessor(StockAvaibility successor) {
        this.successor = successor;
    }

    public void processRequest(ShopItemPurchaseRequest request) {
        if (this.getAllowable(request.getItem(), request.getAmount())) {
            System.out.println(this.getRole() + " posiada " + request.getAmount() + "szt " + request.getItem());
        } else if (successor != null) {
            System.out.println(this.getRole() + " nie posiada " + request.getAmount() + "szt " + request.getItem());
            System.out.println("Sprawdzam w: " + successor.getRole());
            System.out.println();
            successor.processRequest(request);
        } else {
            System.out.println(this.getRole() + " nie posiada " + request.getItem());
        }
    }
}
