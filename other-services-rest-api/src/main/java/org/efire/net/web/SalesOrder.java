package org.efire.net.web;

public class SalesOrder {
    private Integer qty;
    private Double unitPrice;
    private Double totalAmount;
    private Product item;

    public SalesOrder(Integer qty, Double unitPrice, Double totalAmount, Product item) {
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.totalAmount = totalAmount;
        this.item = item;
    }

    public Integer getQty() {
        return qty;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public Product getItem() {
        return item;
    }
}
