package org.example.communityApp2023.web.superadmin;


import org.example.communityApp2023.entity.Area;
import org.example.communityApp2023.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/superadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea", method = RequestMethod.GET)
    @ResponseBody
    private Map<String, Object> listArea(){
        Map<String, Object> modelMqp = new HashMap<>();
        List<Area> list = new ArrayList<>();
        try{
            //获取区域列表
            list = areaService.getAreaList();
            modelMqp.put("rows", list);
            modelMqp.put("total", list.size());
        }catch (Exception e){
            e.printStackTrace();
            modelMqp.put("success", false);
            modelMqp.put("errMsg", e.toString());
        }

        return modelMqp;
    }

}
