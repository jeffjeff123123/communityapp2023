package org.example.communityApp2023.util;

import java.util.Date;
import java.util.Random;

public class ImageUtil {
    static Random r;
    public static String getRandomFileName(){
        int i = r.nextInt(9999);
        long l = System.currentTimeMillis();
        return i + l + "";
    }
}
