package io.xpipe.core.process;

import java.util.List;

public interface ShellLaunchCommand {

    String inlineCdCommand(String cd);

    List<String> localCommand();

    default String loginCommand() {
        return String.join(" ", loginCommand(null));
    }

    List<String> loginCommand(OsType.Any os);

    List<String> openCommand();
}
