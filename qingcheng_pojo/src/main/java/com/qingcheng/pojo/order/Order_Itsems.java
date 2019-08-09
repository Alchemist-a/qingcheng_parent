package com.qingcheng.pojo.order;

import java.io.Serializable;
import java.util.List;

/**
 * @author 炼丹小童子
 * @create 2019-08-03 15:20
 * @name qingcheng_parent - com.qingcheng.pojo.order    Alchemist
 */
public class Order_Itsems implements Serializable {

    private Order order;

    private List<OrderItem> orderItemList;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
}
