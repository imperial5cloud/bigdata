package com.censoft.project.util;

import java.util.UUID;

/**
 * @author censoft
 *本类主要用于产生随机字符串，UUID
 */
public class GUID {

    /**产生随机字符串
     * @return
     */
    public static String generate() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replaceAll("-", "");
    }

    public static void main(String[] args) {
        int num=0;
        for(int i=0;i<5;i++)
        {
            if(i%2==0)
            {
                num=num+1;
            }
        }
        System.out.println(num);
    }
}