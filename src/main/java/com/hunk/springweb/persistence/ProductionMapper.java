package com.hunk.springweb.persistence;

import com.hunk.springweb.domain.Production;  
   
public interface ProductionMapper {  
    /** 
     * ����һ����Ʒ 
     * @param pName 
     */  
    public Production selectProductionByName(String pName);  
      
    /** 
     * �����Ʒ 
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
