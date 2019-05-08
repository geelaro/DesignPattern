package com.geelar.pattern.command.executor;

import com.geelar.pattern.command.Command;
import com.geelar.pattern.command.app.Door;

/**
 * 执行关门动作
 */
public class DoorCloseCommand implements Command {
    private Door door;

    public DoorCloseCommand(Door door){
        this.door = door;
    }
    @Override
    public void execute() {
        door.close();
    }
}
