package duke.commands;

import duke.DukeException;
import duke.taskers.Task;
import duke.utils.Storage;
import duke.utils.TaskList;
import duke.utils.Ui;

/**
 * Delete Command.
 */
public class DeleteCommand extends Command {

    public static final String COMMAND_WORD = "delete";

    /**
     * Constructor.
     * @param targetIndex Index of the task list to be called upon.
     */
    public DeleteCommand(int targetIndex) {
        super(targetIndex);
    }

    /**
     * Executes the command.
     *
     * @param taskList Respective task list.
     * @param ui Respective Ui.
     * @param storage Respective storage.
     * @throws DukeException When something bad happens.
     */
    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) throws DukeException {
        Task t = taskList.deleteItem(super.getTargetIndex());
        ui.deleteItemResponse(t, taskList.getList());
        storage.deleteFileAndRedo(taskList.getList());
    }

    /**
     * Checks if command exits or not.
     * @return Supposed to return false.
     */
    @Override
    public boolean isExit() {
        return false;
    }
}
