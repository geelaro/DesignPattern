package com.geelar.pattern.factory2.base;

/**
 * 广州店特产：叉烧肉夹馍
 */
public class ChaShaoRouJiaMo extends RouJiaMo {
    private String csName = RouJiaMoType.CHASHAO_ROUJIAMO.name;

    public ChaShaoRouJiaMo() {
        this.name = csName;
    }
}
