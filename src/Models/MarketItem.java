package Models;

public class MarketItem {
    private String name;
    private Double purchasePrice;
    private Double sellingPrice;
    private Integer availableAmount;

    protected MarketItem(String name, Double purchasePrice, Double sellingPrice, Integer amount) {

        this.name = name;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.availableAmount = amount;
    }

    protected String getName () {
        return this.name;
    }

    protected void updateAmount(Integer amount){
        this.availableAmount = this.availableAmount + amount;
    }

    protected void displayItem() {
        System.out.println("\t\t|\t"+ name + "\t\t\t|\t\t" + purchasePrice + "\t\t|\t\t" + sellingPrice + "\t\t|\t\t" + availableAmount);
    }
}
