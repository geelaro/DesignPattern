package com.geelar.pattern.command.executor;

import com.geelar.pattern.command.Command;
import com.geelar.pattern.command.app.Light;

/**
 * 动作执行：打开灯光
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
