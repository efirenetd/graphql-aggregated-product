package org.efire.net.web;

import org.efire.net.common.Util;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class Resources {

    @GetMapping("/inventories/{sku}")
    public ResponseEntity<List<Inventory>> getInventoryBySku(@PathVariable("sku") String sku) {
        System.out.println("Requesting inventories...");
        var nsw = new Inventory("sku001", "nsw", 74);
        var qld = new Inventory("sku001", "qld", 10);
        var vic = new Inventory("sku001", "vic", 10);
        return ResponseEntity.ok(Arrays.asList(nsw,qld,vic));
    }

    @GetMapping("/salesorders/{sku}")
    public ResponseEntity<List<SalesOrder>> getSaleOrders(@PathVariable("sku") String sku) {
        System.out.println("Requesting sales orders...");
        var sku001 = new Product("sku001", null, null, null);
        var salesOrder1 = new SalesOrder(1, 9.23232, 9.23232, sku001);
        var salesOrder2 = new SalesOrder(2, 3.0000, 6.0000, sku001);
        var salesOrders = Arrays.asList(salesOrder1, salesOrder2);
        return ResponseEntity.ok(salesOrders);
    }

    @GetMapping("/purchaseorders/{sku}")
    public ResponseEntity<List<PurchaseOrder>> getPurchaseOrders(@PathVariable("sku") String sku) {
        System.out.println("Requesting purchase orders...");
        var po1 = new PurchaseOrder("01/01/2021", "02/02/2021", 1);
        var po2 = new PurchaseOrder("03/01/2021", "04/02/2021", 2);
        var po3 = new PurchaseOrder("05/01/2021", "06/02/2021", 3);
        return ResponseEntity.ok(Arrays.asList(po1,po2,po3));
    }

    private int getSum(int x, int y) {
        return Util.sum(x, y);
    }
}
