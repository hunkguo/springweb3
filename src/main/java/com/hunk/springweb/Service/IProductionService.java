package com.hunk.springweb.Service;


import java.util.List;  
  
import com.hunk.springweb.domain.Production;  

public interface  IProductionService {

	
    public Production getProductionByName(String pName);  
      
    public boolean saveProduction(Production production);  
      
    public boolean updateProduction(Production production);  
      
    public boolean deleteProduction(List<String> listIds);  

}
