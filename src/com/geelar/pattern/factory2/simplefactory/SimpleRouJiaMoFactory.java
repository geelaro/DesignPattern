package com.geelar.pattern.factory2.simplefactory;

import com.geelar.pattern.factory2.base.LaRouJiaMo;
import com.geelar.pattern.factory2.base.RouJiaMo;
import com.geelar.pattern.factory2.base.SuanRouJiaMo;

/**
 * 简单工厂模式
 */
public class SimpleRouJiaMoFactory {


    public RouJiaMo createRouJiaMo(String type) {
        RouJiaMo rouJiaMo = null;

        if (type.equals("Suan")) {
            rouJiaMo = new SuanRouJiaMo();
        } else if (type.equals("La")) {
            rouJiaMo = new LaRouJiaMo();
        } else {
            throw new NullPointerException("无此种肉夹馍");

        }
        return rouJiaMo;
    }
}
