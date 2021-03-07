package seedu.hdbuy.command;

import seedu.hdbuy.data.QueryKey;
import seedu.hdbuy.ui.TextUi;

import java.util.HashMap;

public class DefaultCommand extends Command {
    protected String input;

    public DefaultCommand(String input) {
        this.input = input;
    }
    @Override
    public void execute(HashMap<QueryKey, String> inputs, TextUi ui) {
        ui.showInvalidInput(input);
    }
}
