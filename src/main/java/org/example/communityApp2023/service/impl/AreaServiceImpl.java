package org.example.communityApp2023.service.impl;

import org.example.communityApp2023.dao.AreaDao;
import org.example.communityApp2023.entity.Area;
import org.example.communityApp2023.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;
    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }
}
