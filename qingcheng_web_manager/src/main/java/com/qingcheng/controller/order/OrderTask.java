package com.qingcheng.controller.order;



import com.alibaba.dubbo.config.annotation.Reference;
import com.qingcheng.service.order.OrderService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/*
 * @author 炼丹小童子
 * @create 2019-08-04 18:30
 * @name qingcheng_parent - com.qingcheng.controller.order    Alchemist
 */

@Component
public class OrderTask {

    @Reference
    private OrderService orderService;

    //两分钟一次检查
    @Scheduled(cron = "0 0/2 * * * ?")
    public void testTask(){
        //System.out.println("检查订单是否超时");
        orderService.orderTimeOutLogic();
    }
}
