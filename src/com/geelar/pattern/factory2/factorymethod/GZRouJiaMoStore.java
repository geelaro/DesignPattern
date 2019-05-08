package com.geelar.pattern.factory2.factorymethod;

import com.geelar.pattern.factory2.base.ChaShaoRouJiaMo;
import com.geelar.pattern.factory2.base.LaRouJiaMo;
import com.geelar.pattern.factory2.base.RouJiaMo;
import com.geelar.pattern.factory2.base.SuanRouJiaMo;

/**
 * 广州肉夹馍分店
 */
public class GZRouJiaMoStore extends RouJiaMoStore {
    @Override
    public RouJiaMo createRouJiaMo(String type) {
        RouJiaMo rouJiaMo = null;
        if (type.equals("Suan")) {
            rouJiaMo = new SuanRouJiaMo();
        } else if (type.equals("La")) {
            rouJiaMo = new LaRouJiaMo();
        } else if (type.equals("Chashao")){
            rouJiaMo = new ChaShaoRouJiaMo();
        }else {
            throw new NullPointerException("无此种肉夹馍");

        }
        return rouJiaMo;
    }
}
