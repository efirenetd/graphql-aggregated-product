package org.efire.net.web;

import java.util.List;

public class Product {
    private String sku;
    private List<Inventory> stocks;
    private List<SalesOrder> salesOrders;
    private List<PurchaseOrder> purchaseOrders;

    public Product(String sku, List<Inventory> stocks, List<SalesOrder> salesOrders, List<PurchaseOrder> purchaseOrders) {
        this.sku = sku;
        this.stocks = stocks;
        this.salesOrders = salesOrders;
        this.purchaseOrders = purchaseOrders;
    }

    public String getSku() {
        return sku;
    }

    public List<Inventory> getStocks() {
        return stocks;
    }

    public List<SalesOrder> getSalesOrders() {
        return salesOrders;
    }

    public List<PurchaseOrder> getPurchaseOrders() {
        return purchaseOrders;
    }
}
