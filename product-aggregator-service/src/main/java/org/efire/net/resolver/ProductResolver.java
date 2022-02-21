package org.efire.net.resolver;

import graphql.kickstart.tools.GraphQLResolver;
import org.efire.net.model.Inventory;
import org.efire.net.model.Product;
import org.efire.net.model.PurchaseOrder;
import org.efire.net.model.SalesOrder;
import org.efire.net.service.ProductService;
import org.springframework.stereotype.Component;

@Component
public class ProductResolver implements GraphQLResolver<Product> {

    private ProductService productService;

    public ProductResolver(ProductService productService) {
        this.productService = productService;
    }

    public Inventory[] stocks(Product product) {
        System.out.println("ProductResolver: Inventory!");
        return productService.getInventories(product);
    }

    public PurchaseOrder[] purchaseOrders(Product product) {
        System.out.println("ProductResolver: PurchaseOrder!");
        return productService.getPurchaseOrders(product);
    }

    public SalesOrder[] salesOrders(Product product) {
        System.out.println("ProductResolver: SalesOrder!");
        return productService.getSaleOrders(product);
    }
}
