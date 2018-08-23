package vn.plusplusc.shopcart.dao;

import vn.plusplusc.shopcart.entity.Product;
import vn.plusplusc.shopcart.model.PaginationResult;
import vn.plusplusc.shopcart.model.ProductInfo;

public interface ProductDAO {
 
    
    
    public Product findProduct(String code);
    
    public ProductInfo findProductInfo(String code) ;
  
    
    public PaginationResult<ProductInfo> queryProducts(int page,
                       int maxResult, int maxNavigationPage  );
    
    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
                       int maxNavigationPage, String likeName);
 
    public void save(ProductInfo productInfo);
    
}