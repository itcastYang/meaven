package cn.itcast.controller;

import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

 @RequestMapping("/findDetail")
    public String findDetail(Model modle){
     Items byId = itemsService.findById(1);
     modle.addAttribute("item",byId);
     return "itemDetail";
 }
}
