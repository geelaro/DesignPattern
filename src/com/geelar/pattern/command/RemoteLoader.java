package com.geelar.pattern.command;

import com.geelar.pattern.command.app.Door;
import com.geelar.pattern.command.app.Light;
import com.geelar.pattern.command.executor.DoorCloseCommand;
import com.geelar.pattern.command.executor.DoorOpenCommand;
import com.geelar.pattern.command.executor.LightOffCommand;
import com.geelar.pattern.command.executor.LightOnCommand;

/**
 * 命令模式
 * 测试这个遥控器
 */
public class RemoteLoader {

    public static void main(String[] args){
        //
        Light light = new Light();
        Door door = new Door("厨房");
        //
        LightOnCommand lightOnCommand  = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        DoorOpenCommand doorOpenCommand = new DoorOpenCommand(door);
        DoorCloseCommand doorCloseCommand = new DoorCloseCommand(door);
        //设置按键对应动作程序
        RemoteControl control  = new RemoteControl();
        control.setCommand(1,lightOnCommand);
        control.setCommand(2,lightOffCommand);
        control.setCommand(3,doorOpenCommand);
        control.setCommand(4,doorCloseCommand);
        //按下按键
        control.buttonWasPressed(1);
        control.buttonWasPressed(2);
        control.buttonWasPressed(3);
        control.buttonWasPressed(4);
        control.buttonWasPressed(8);
    }
}
