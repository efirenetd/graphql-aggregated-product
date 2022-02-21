package org.efire.net.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.efire.net.model.Product;
import org.efire.net.service.ProductService;
import org.springframework.stereotype.Component;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    private ProductService productService;

    public QueryResolver(ProductService productService) {
        this.productService = productService;
    }

    public Product findProduct(String sku) {
        System.out.println("Calling QueryResolver...");
        return productService.getProduct(sku);
    }

}
