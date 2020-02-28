package flacostacos.tacocloud.model.dao;

import flacostacos.tacocloud.model.Order;

public interface OrderRepository {

    Order save(Order order);
}
