package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.GoodsService;

import javax.annotation.Resource;

@Controller
public class GoodsController {

    @Resource
    GoodsService goodsService;


    @RequestMapping("/goods")
    @ResponseBody
    public Integer goods(){
        int result = goodsService.getGoodsCount();
        return result;
    }




}
