package com.geelar.pattern.chain;

/**
 * 副总 VP
 */
public class VPHandler extends AbstractHandler {
    public VPHandler() {
        super();
    }

    public VPHandler(AbstractHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(String user, int fee) {
        if (fee <= 1200) {
            System.out.println("副总经理给" + user + "报销了" + fee + "元。");
        } else if (nextHandler != null) {
            super.nextHandler.handle(user, fee);
        }
    }
}
