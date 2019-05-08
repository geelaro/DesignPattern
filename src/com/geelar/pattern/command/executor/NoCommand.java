package com.geelar.pattern.command.executor;

import com.geelar.pattern.command.Command;

/**
 * 空命令
 */
public class NoCommand implements Command {

    @Override
    public void execute() {
    }
}
