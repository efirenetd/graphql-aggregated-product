package org.efire.net.service;

import org.efire.net.model.Inventory;
import org.efire.net.model.Product;
import org.efire.net.model.PurchaseOrder;
import org.efire.net.model.SalesOrder;

public interface ProductService {

    Product getProduct(String sku);

    Inventory[] getInventories(Product product);

    PurchaseOrder[] getPurchaseOrders(Product product);

    SalesOrder[] getSaleOrders(Product product);
}
