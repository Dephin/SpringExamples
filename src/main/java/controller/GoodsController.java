package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.GoodsService;


@Controller
public class GoodsController {

    @Autowired
    GoodsService goodsService;


    @RequestMapping("/goods")
    @ResponseBody
    public Integer goods(){
        int result = goodsService.getGoodsCount();
        return result;
    }




}
