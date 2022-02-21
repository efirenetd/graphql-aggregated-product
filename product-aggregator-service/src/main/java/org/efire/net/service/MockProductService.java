package org.efire.net.service;

import org.efire.net.model.Inventory;
import org.efire.net.model.Product;
import org.efire.net.model.PurchaseOrder;
import org.efire.net.model.SalesOrder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MockProductService implements ProductService {

    private RestTemplate restTemplate;
    private String baseUrl;

    public MockProductService(RestTemplate restTemplate, @Value("${other-apis-url}") String baseUrl) {
        this.restTemplate = restTemplate;
        this.baseUrl = baseUrl;
    }

    @Override
    public Product getProduct(String sku) {
        System.out.println("Getting data from other service api...");
        return new Product(sku);
    }

    @Override
    public Inventory[] getInventories(Product product) {
        System.out.println("Calling get inventories...");
        var responseEntity = this.restTemplate
                .getForEntity(baseUrl+"/inventories/"+product.getSku(),
                        Inventory[].class);
        return responseEntity.getBody();
    }

    @Override
    public PurchaseOrder[] getPurchaseOrders(Product product) {
        System.out.println("Calling get purchase orders");
        var responseEntity = this.restTemplate
                .getForEntity(baseUrl+"/purchaseorders/"+product.getSku(),
                        PurchaseOrder[].class);
        return responseEntity.getBody();
    }

    @Override
    public SalesOrder[] getSaleOrders(Product product) {
        System.out.println("Calling get sales orders");
        var responseEntity = this.restTemplate
                .getForEntity(baseUrl+"/salesorders/"+product.getSku(),
                        SalesOrder[].class);
        return responseEntity.getBody();
    }
}
