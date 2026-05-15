package with;

public class User {
    protected String name;
    protected DocumentSessionMediator documentSessionMediator;

    User(String name, DocumentSessionMediator documentSessionMediator) {
        this.name = name;
        this.documentSessionMediator = documentSessionMediator;
    }

    // Method for users to make a change
    public void makeChange(String change) {
        System.out.println(name + " edited the document: " + change);
        documentSessionMediator.broadcastChange(change, this);
    }

    // Method to receive a change from another user
    public void receiveChange(String change, User sender) {
        System.out.println(name + " saw change from " + sender.name + ": \"" + change + "\"");
    }
}
