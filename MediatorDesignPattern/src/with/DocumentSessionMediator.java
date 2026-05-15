package with;

public interface DocumentSessionMediator {
    void add(User user);
    void broadcastChange(String change, User sender);
}
