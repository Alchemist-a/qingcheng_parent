package com.qingcheng.service.order;
import com.qingcheng.entity.PageResult;
import com.qingcheng.pojo.order.Order;
import com.qingcheng.pojo.order.Order_Itsems;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.*;

/**
 * order业务逻辑层
 * @author Alchemist
 */
public interface OrderService {



    public List<Order> findAll();


    public PageResult<Order> findPage(int page, int size);


    public List<Order> findList(Map<String,Object> searchMap);


    public PageResult<Order> findPage(Map<String,Object> searchMap,int page, int size);


    public Order findById(String id);

    public void add(Order order);


    public void update(Order order);


    public void delete(String id);

    /**
     * description: 根据 id 数组查询 查询
     *
     * @param ids ids
     * @return java.util.List<com.qingcheng.pojo.order.Order>
     */
    public List<Order> findByIds(List<String> ids);

    /**
     * description: 批量发货
     * @param orders 订单集合
     * @return void
     */
    public void batchSend(List<Order> orders);

    /**
     * description: 订单超时处理逻辑
     *
     * @param
     * @return void
     */
    public void orderTimeOutLogic();

}
