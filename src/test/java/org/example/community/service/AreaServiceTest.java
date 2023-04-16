package org.example.community.service;

import org.example.community.BaseTest;
import org.example.communityApp2023.dao.AreaDao;
import org.example.communityApp2023.entity.Area;
import org.example.communityApp2023.service.AreaService;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AreaServiceTest extends BaseTest {
    @Autowired
    private AreaService areaService;

    @Test
    public void testGetAreaList(){
        List<Area> areaList = areaService.getAreaList();
        System.out.println(areaList.get(0).getAreaName());
        assertEquals("concordia", areaList.get(0).getAreaName());
    }
}
