package com.zhihu.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/9/7 12:39
 */
public class Staff {
    
    private List<Command> commandList = new ArrayList<>();
    
    public void addCommand(Command command) {
        this.commandList.add(command);
    }
    
    public void executeCommands() {
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
