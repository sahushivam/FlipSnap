package constants;

public enum Commands {

    POST, SEE_MSGS, SEE_FEEDS, DELETE_MESSAGE, EXIT_APP, COMMAND_NOT_FOUND;
    public static Commands getCommand(String comm) {
        if (CommandConstants.POST.equals(comm))
            return POST;
        else if (CommandConstants.SEE_FEEDS.equals(comm))
            return SEE_FEEDS;
        else if (CommandConstants.DELETE_MESSAGE.equals(comm))
            return DELETE_MESSAGE;
        if (CommandConstants.EXIT_APP.equals(comm))
            return EXIT_APP;
        else
            return COMMAND_NOT_FOUND;
    }
}
