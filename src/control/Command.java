package control;

public interface Command {
    
    public static final Command Null = new Command() {
        @Override
        public void execute() {
        }
    };
    void execute();
}
