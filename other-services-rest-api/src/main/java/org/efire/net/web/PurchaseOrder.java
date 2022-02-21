package org.efire.net.web;

public class PurchaseOrder {
    private String sku;
    private String orderDate;
    private String shipDate;
    private Integer qty;

    public PurchaseOrder(String orderDate, String shipDate, Integer qty) {
        this.orderDate = orderDate;
        this.shipDate = shipDate;
        this.qty = qty;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getShipDate() {
        return shipDate;
    }

    public Integer getQty() {
        return qty;
    }
}
