package com.hunk.springweb.ServiceImpl;


import java.util.List;  
  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.hunk.springweb.domain.Production;  
import com.hunk.springweb.persistence.ProductionMapper;  
import com.hunk.springweb.Service.IProductionService;  


@Service("IProductionService")
public class ProductionServiceImpl implements IProductionService {  
    @Autowired  
    private ProductionMapper productionMapper;  
    /** 
     *  
     * @param pName 
     * @return 
     */  
    public Production getProductionByName(String pName){      
        Production production = productionMapper.selectProductionByName("bbb");  
        return production;  
    }  
    /** 
     * 返回整数 
     */  
    public boolean saveProduction(Production production) {  
//      productionMapper.insertProduction(production);  
//      production.setProductionid("10000001");  
//      production.setPrice(new BigDecimal(1.0));  
//      production.setProductionname("笔记本");  
//      production.setDetail("IBM Thinkpad R400");  
        int success = productionMapper.insertProduction(production);  
        return success > 0;  
    }  
    /** 
     * 更新 
     */  
    public boolean updateProduction(Production production) {  
//      production.setProductionid("10000001");  
//      production.setPrice(new BigDecimal(1.0));  
//      production.setProductionname("笔记本");  
//      production.setDetail("IBM Thinkpad R400");  
        int success = productionMapper.updateProduction(production);  
        return success > 0;  
    }  
    /** 
     * 删除 
     */  
    public boolean deleteProduction(List<String> listIds) {  
        int success = 0;  
        for(int i =0; i < listIds.size(); i++){  
            success += productionMapper.deleteProduction(listIds.get(i));  
        }  
        return success > 0;  
    }  
}  