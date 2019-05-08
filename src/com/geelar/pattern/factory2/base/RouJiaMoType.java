package com.geelar.pattern.factory2.base;

public enum RouJiaMoType {
    SUAN_ROUJIAMO("酸味肉夹馍"),
    LA_ROUJIAMO("辣味肉夹馍"),
    YANG_ROUJIAMO("羊肉肉夹馍"),
    CHASHAO_ROUJIAMO("叉烧肉夹馍");

    String name;

    RouJiaMoType(String name){
        this.name = name;
    }

}
