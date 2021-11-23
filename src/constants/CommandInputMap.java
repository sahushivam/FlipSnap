package constants;

import java.util.HashMap;
import java.util.Map;

public class CommandInputMap {

    private static volatile Map<String, Integer> commandsParameterMap = new HashMap<String, Integer>();

    static
    {
        commandsParameterMap.put(CommandConstants.POST, 2);
        commandsParameterMap.put(CommandConstants.DELETE_MESSAGE, 1);
        commandsParameterMap.put(CommandConstants.SEE_FEEDS, 1);
        commandsParameterMap.put(CommandConstants.SEE_MSGS,1);
        commandsParameterMap.put(CommandConstants.EXIT_APP,0);
    }

    public static Map<String, Integer> getCommandsParameterMap()
    {
        return commandsParameterMap;
    }

    public static void addCommand(String command, int parameterCount)
    {
        commandsParameterMap.put(command, parameterCount);
    }
}
