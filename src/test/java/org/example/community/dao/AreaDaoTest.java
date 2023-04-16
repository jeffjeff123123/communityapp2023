package org.example.community.dao;

import org.example.community.BaseTest;
import org.example.communityApp2023.dao.AreaDao;
import org.example.communityApp2023.entity.Area;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AreaDaoTest extends BaseTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    public void testQueryArea(){
        List<Area> areaList = areaDao.queryArea();
        assertEquals(2, areaList.size());
    }
}
