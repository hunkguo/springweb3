package com.hunk.springweb.domain;

import java.math.BigDecimal;  



public class Production {  
    /** 
     * ��ƷID 
     */  
    private String productionid;  
    /** 
     * ��Ʒ���� 
     */  
    private String productionname;  
    /** 
     * �۸� 
     */  
    private BigDecimal price;  
    /** 
     * ��ϸ 
     */  
    private String detail;  
    public String getProductionid() {  
        return productionid;  
    }  
    public void setProductionid(String productionid) {  
        this.productionid = productionid;  
    }  
    public String getProductionname() {  
        return productionname;  
    }  
    public void setProductionname(String productionname) {  
        this.productionname = productionname;  
    }  
    public BigDecimal getPrice() {  
        return price;  
    }  
    public void setPrice(BigDecimal price) {  
        this.price = price;  
    }  
    public String getDetail() {  
        return detail;  
    }  
    public void setDetail(String detail) {  
        this.detail = detail;  
    }  
      
}  