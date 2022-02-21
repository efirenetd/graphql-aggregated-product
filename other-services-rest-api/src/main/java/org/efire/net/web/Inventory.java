package org.efire.net.web;

public class Inventory {

    private String sku;
    private String location;
    private Integer qtyAvailable;

    public Inventory(String sku, String location, Integer qtyAvailable) {
        this.sku = sku;
        this.location = location;
        this.qtyAvailable = qtyAvailable;
    }

    public String getSku() {
        return sku;
    }

    public String getLocation() {
        return location;
    }

    public Integer getQtyAvailable() {
        return qtyAvailable;
    }
}
