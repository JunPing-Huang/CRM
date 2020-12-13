package com.junping.crm;

import com.junping.crm.utils.MD5Util;
import org.junit.Test;

import java.util.UUID;

public class myTest {
    @Test
    public void testUUID(){
        UUID uuid = UUID.randomUUID();
        System.out.println("uuid:"+uuid);
        System.out.println(uuid.toString().replaceAll("-",""));
    }

    @Test
    public void testGetMD5(){
        System.out.println(MD5Util.getMD5("123.8f"));
    }
}
