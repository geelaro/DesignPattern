package com.geelar.pattern.chain;

/**
 * 项目经理ProjectManager
 */
public class PMHandler extends AbstractHandler {


    public PMHandler(AbstractHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(String user, int fee) {
        if (fee <= 500) {
            System.out.println("项目经理给" + user + "报销了" + fee + "元。");
        } else {
            if (nextHandler != null) {
                nextHandler.handle(user, fee);
            }
        }
    }


}
