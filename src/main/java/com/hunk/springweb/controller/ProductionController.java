package com.hunk.springweb.controller;

import java.util.ArrayList;  
import java.util.List;  
  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
  
import com.hunk.springweb.domain.Production;  
import com.hunk.springweb.Service.IProductionService;  
  
@Controller  
@RequestMapping("/")  
public class ProductionController {  
	@Autowired
    private IProductionService productionService;  
  
    @RequestMapping(value="/production",method=RequestMethod.GET)  
    public String getProduct(Model model){  
        System.out.println("fuck all");  
        productionService.getProductionByName("aaa");  
          
        model.addAttribute("production", productionService.getProductionByName("bbb"));  
        return "production";   
    }  
      

    @RequestMapping(value="/addProduction")  
    public String addProduction(Production production){  
          
        productionService.saveProduction(production);  
        return "production";  
    }  
    @RequestMapping(value="/editProduction")  
    public String editProduction(Model model){  
        Production production =  new Production();  
        productionService.updateProduction(production);  
          
          
        return "production";  
    }  
    @RequestMapping(value="/deleteProduction")  
    public String deleteProduction(String productionid){  
        List<String> listIds = new ArrayList<String>();  
        listIds.add(productionid);  
        productionService.deleteProduction(listIds);  
          
          
        return "production";  
    }  
}  