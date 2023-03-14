package structural.facade.service;

import structural.facade.bo.Product;

public class OrderServiceFacadeImpl implements OrderServiceFacade {

    private final InventoryService inventoryService = new InventoryService();

    private final PaymentService paymentService = new PaymentService();

    private final ShippingService shippingService = new ShippingService();

    @Override
    public void placeOrder(String productName) {
        Product product = new Product(productName);
        inventoryService.addProduct(product);
        if (inventoryService.isProductAvailable(product)) {
            paymentService.processPayment();
            shippingService.shipProduct();
        }
    }

}
