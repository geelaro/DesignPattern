package com.geelar.pattern.chain;

/**
 * 责任链模式
 */
public class ChainOfResponsibility {

    public static void main(String[] args) {

        AbstractHandler vpHandler = new VPHandler();
        AbstractHandler dmHandler = new DMHandler(vpHandler);
        AbstractHandler pmHandler = new PMHandler(dmHandler);
        pmHandler.handle("Alice", 900);
        pmHandler.handle("李工",600);
    }
}
