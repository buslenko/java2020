package com.company.Java_sem1.lab32;

public interface OrdersManager {
    int itemsQuantity(String itemName);

    int itemsQuantity(MenuItem item);

    Orderable[] getOrders();

    int ordersCostSummary();

    int ordersQuantity();
}
