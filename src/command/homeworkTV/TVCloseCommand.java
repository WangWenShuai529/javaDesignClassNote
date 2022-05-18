package command.homeworkTV;

public class TVCloseCommand implements AbstractCommand {
	Television peopleReceiver;
	public TVCloseCommand(Television peopleReceiver) {
		this.peopleReceiver = peopleReceiver;
	}
	@Override
	public void execute(String name) throws Exception {
		peopleReceiver.close(name);
	}
}
