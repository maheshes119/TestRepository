package vn.plusplusc.shopcart.dao;

import java.util.List;

import vn.plusplusc.shopcart.model.CartInfo;
import vn.plusplusc.shopcart.model.OrderDetailInfo;
import vn.plusplusc.shopcart.model.OrderInfo;
import vn.plusplusc.shopcart.model.PaginationResult;


public interface OrderDAO {
 
    public void saveOrder(CartInfo cartInfo);
 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
 
}