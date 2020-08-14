package com.example.android.asmdemo.temp;

import android.util.Log;

/**
 * @author:無忌
 * @date:2020/8/14
 * @description:
 */
public class Test {
    public void testOnCreate(){
        Log.e("wuji.asm","@@>>>>>>>>>>>" + this.getClass().getSimpleName() + ":onCreate");
    }

    public void testOnDestroy(){
        Log.e("wuji.asm","@@>>>>>>>>>>>" + this.getClass().getSimpleName() + ":onDestroy");
    }
}
