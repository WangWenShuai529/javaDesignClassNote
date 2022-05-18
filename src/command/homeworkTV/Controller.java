package command.homeworkTV;
//请求者
public class Controller implements AbstractCommand {
	AbstractCommand openCommand;
	AbstractCommand closeCommand;
	AbstractCommand changeCommand;

	
	public Controller(AbstractCommand openCommand, AbstractCommand closeCommand, AbstractCommand changeCommand) {
		this.openCommand = openCommand;
		this.closeCommand = closeCommand;
		this.changeCommand = changeCommand;
	}


	@Override
	public void execute(String name) throws Exception {
		System.out.println("execute");

	}

	public void open(String name) throws Exception {
		openCommand.execute(name);
	}

    public void close(String name) throws Exception {
		closeCommand.execute(name);
    }

    public void changeChannel(String name) throws Exception {
		changeCommand.execute(name);
    }
}
