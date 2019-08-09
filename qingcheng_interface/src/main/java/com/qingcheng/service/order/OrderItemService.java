package com.qingcheng.service.order;
import com.qingcheng.entity.PageResult;
import com.qingcheng.pojo.order.OrderItem;
import com.qingcheng.pojo.order.Order_Itsems;

import java.util.*;

/**
 * orderItem业务逻辑层
 */
public interface OrderItemService {


    public List<OrderItem> findAll();


    public PageResult<OrderItem> findPage(int page, int size);


    public List<OrderItem> findList(Map<String,Object> searchMap);


    public PageResult<OrderItem> findPage(Map<String,Object> searchMap,int page, int size);


    public OrderItem findById(String id);

    public void add(OrderItem orderItem);


    public void update(OrderItem orderItem);


    public void delete(String id);

    /**
     * description: 查询订单列表与详情
     *
     * @param id id
     * @return com.qingcheng.pojo.order.Order_Itsems
     */
    public Order_Itsems findOrderItemsById(String id);
}
