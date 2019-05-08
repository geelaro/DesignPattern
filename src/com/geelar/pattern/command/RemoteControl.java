package com.geelar.pattern.command;

import com.geelar.pattern.command.executor.NoCommand;

import java.security.Signature;

/**
 * 控制器
 */
public class RemoteControl {

    private static final int SIZE = 8;
    private Command[] commands;

    public RemoteControl() {

        commands = new Command[SIZE];
        Command noCommand = new NoCommand();

        for (int i = 1; i < SIZE; i++) {
            commands[i] = noCommand;
        }
    }

    public void setCommand(int key, Command command) {

        commands[key-1] = command;
    }


    public void buttonWasPressed(int key) {
        if (key>8){
            throw new ArrayIndexOutOfBoundsException("输入数字有误");
        }
        commands[key-1].execute();
    }


}
