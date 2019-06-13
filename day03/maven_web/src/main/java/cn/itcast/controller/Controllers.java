package cn.itcast.controller;

import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping()
public class Controllers {


    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/show")
    public String findById(Model model) {
        Items items = itemsService.findById(1);
        model.addAttribute("item", items);
        return "itemDetail";

    }
}
