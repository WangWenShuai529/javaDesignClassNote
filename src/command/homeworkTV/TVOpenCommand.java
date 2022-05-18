package command.homeworkTV;

public class TVOpenCommand implements AbstractCommand {
	Television peopleReceiver;
	public TVOpenCommand(Television peopleReceiver) {
		this.peopleReceiver = peopleReceiver;
	}
	@Override
	public void execute(String name) throws Exception {
		peopleReceiver.open(name);
	}
}
