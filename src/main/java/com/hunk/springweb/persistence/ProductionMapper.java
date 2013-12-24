package com.hunk.springweb.persistence;

import com.hunk.springweb.domain.Production;  
   
public interface ProductionMapper {  
    /** 
     * 检索一个产品 
     * @param pName 
     */  
    public Production selectProductionByName(String pName);  
      
    /** 
     * 插入产品 
     * @param p 
     */  
    public int insertProduction(Production p);  
    /** 
     *  
     * @param p 
     * @return 
     */  
    public int updateProduction(Production p);  
    /** 
     *  
     * @param ids 
     * @return 
     */  
    public int deleteProduction(String id);  
  
}  
