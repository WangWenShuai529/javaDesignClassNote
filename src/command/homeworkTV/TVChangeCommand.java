package command.homeworkTV;

public class TVChangeCommand implements AbstractCommand {
	Television peopleReceiver;
	public TVChangeCommand(Television peopleReceiver) {
		this.peopleReceiver = peopleReceiver;
	}
	@Override
	public void execute(String name) throws Exception {
		peopleReceiver.changeChannel(name);
	}
}
