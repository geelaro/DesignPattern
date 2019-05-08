package com.geelar.pattern.factory2.factorymethod;

import com.geelar.pattern.factory2.base.LaRouJiaMo;
import com.geelar.pattern.factory2.base.RouJiaMo;
import com.geelar.pattern.factory2.base.SuanRouJiaMo;
import com.geelar.pattern.factory2.base.YangRouJiaMo;

/**
 * 西安肉夹馍分店
 */
public class XianRouJiaMoStore extends RouJiaMoStore {


    @Override
    public RouJiaMo createRouJiaMo(String type) {
        RouJiaMo rouJiaMo = null;

        if (type.equals("Suan")) {
            rouJiaMo = new SuanRouJiaMo();
        } else if (type.equals("La")) {
            rouJiaMo = new LaRouJiaMo();
        } else if (type.equals("Yang")) {
            rouJiaMo = new YangRouJiaMo();
        } else {
            throw new NullPointerException("无此种肉夹馍");

        }
        return rouJiaMo;
    }
}
