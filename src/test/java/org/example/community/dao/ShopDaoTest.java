package org.example.community.dao;

import org.example.community.BaseTest;
import org.example.communityApp2023.dao.ShopDao;
import org.example.communityApp2023.entity.Shop;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;

public class ShopDaoTest extends BaseTest {
    @Autowired
    private ShopDao shopDao;
    @Test
    public void testUpdateShop(){
        Shop shop = new Shop();
        shop.setShopId(85L);
        shop.setShopDesc("test desc");
        int effectedNum = shopDao.updateShop(shop);
        assertEquals(1, effectedNum);
    }
}
