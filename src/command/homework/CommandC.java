package command.homework;
//block命令
public class CommandC implements Command {
	Receiver peopleReceiver;
	public CommandC(Receiver peopleReceiver) {
		this.peopleReceiver = peopleReceiver;
	}
	@Override
	public void execute(String name) throws Exception {
		peopleReceiver.fakeAttach(name);
	}
}
