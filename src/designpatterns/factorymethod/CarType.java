package designpatterns.factorymethod;

public enum CarType {
    HATCKBACK("hatchback"),
    SEDAN("sedan"),
    KOMBI("kombi"),
    PICKUP("pickup"),
    VAN("van");

    private String carType;

    CarType(String carType){
        this.carType = carType;
    }

}
