package com.geelar.pattern.chain;

/**
 * DepartmentManager 部门经理
 */
public class DMHandler extends AbstractHandler {

    public DMHandler(AbstractHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(String user, int fee) {
        if (fee <= 800) {
            System.out.println("部门经理给" + user + "报销了" + fee + "元。");
        } else if (null != nextHandler) {
            super.nextHandler.handle(user, fee);
        }

    }
}
