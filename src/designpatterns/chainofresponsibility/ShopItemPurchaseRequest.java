package designpatterns.chainofresponsibility;

public class ShopItemPurchaseRequest {
    private Integer amount;
    private String item;

    public ShopItemPurchaseRequest(String item, Integer amount) {
        this.amount = amount;
        this.item = item;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
