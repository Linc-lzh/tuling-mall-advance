package com.tuling.tulingmall.history.service.impl;

public class OrderConstant {

    public static final String OMS_ORDER_NAME_PREFIX = "oms_order_";
    public static final String OMS_ORDER_ITEM_NAME_PREFIX = "oms_order_item_";
    public static final String MIGRATE_SUCCESS = "成功";
    public static final String MIGRATE_FAILURE = "失败";

    public static final String LEAF_ORDER_ID_KEY = "order_id";
    public static final String LEAF_ORDER_ITEM_ID_KEY = "order_item_id";

    /*订单确认*/
    public static final int CONFIRM_STATUS_NO = 0;
    public static final int CONFIRM_STATUS_YES = 1;

    /*订单删除状态*/
    public static final int DELETE_STATUS_NO = 0;
    public static final int DELETE_STATUS_YES = 1;

    /*订单来源：0->PC订单；1->app订单*/
    public static final int SOURCE_TYPE_PC = 0;
    public static final int SOURCE_TYPE_APP = 1;

    /*订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单*/
    public static final int ORDER_STATUS_UNPAY = 0;
    public static final int ORDER_STATUS_UNDELIVERY = 1;
    public static final int ORDER_STATUS_DELIVERYED = 2;
    public static final int ORDER_STATUS_COMPLETE = 3;
    public static final int ORDER_STATUS_CLOSE = 4;
    public static final int ORDER_STATUS_INVALID = 5;

    /*订单类型：0->正常订单；1->秒杀订单*/
    public static final int ORDER_TYPE_NORMAL = 0;
    public static final int ORDER_TYPE_SECKILL = 1;



}
