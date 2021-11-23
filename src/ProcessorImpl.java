import constants.CommandConstants;
import constants.CommandInputMap;
import constants.Commands;
import exceptions.FlipSnapException;

public class ProcessorImpl {

    FlipSnap flipSnap;

    public boolean validate(String inputString) {
        boolean valid = true;
        try
        {
            String[] inputs = inputString.split(" ");
            int params = CommandInputMap.getCommandsParameterMap().get(inputs[0]);
            switch (inputs.length)
            {
                case 1:
                    if (params != 0)
                        valid = false;
                    break;
                case 2:
                    if (params != 1)
                        valid = false;
                    break;
                case 3:
                    if (params != 2)
                        valid = false;
                    break;
                default:
                    valid = false;
            }
        }
        catch (Exception e)
        {
            valid = false;
        }
        return valid;
    }

    public void execute(String line) throws FlipSnapException {
        String[] commandLine = line.split(" ");
        String command = commandLine[0];
        if(flipSnap == null) {
            flipSnap = new FlipSnap();
        }
        switch(Commands.getCommand(command)){
            case POST : flipSnap.post(commandLine[1], commandLine[2]); break;
            case SEE_FEEDS:  flipSnap.seeFeeds(); break;
            case SEE_MSGS: flipSnap.seeMessage(commandLine[1]); break;
            case DELETE_MESSAGE: flipSnap.deleteMsg(commandLine[1], commandLine[2]);break;
            case EXIT_APP: System.exit(0);
        }
    }
}
