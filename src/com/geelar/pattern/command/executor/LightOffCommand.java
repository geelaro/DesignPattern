package com.geelar.pattern.command.executor;

import com.geelar.pattern.command.Command;
import com.geelar.pattern.command.app.Light;

/**
 * 动作：关闭灯光
 */
public class LightOffCommand implements Command {
    public Light light;
    public LightOffCommand(Light light){
        this.light  = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}
