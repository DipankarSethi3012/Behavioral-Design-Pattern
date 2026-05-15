package with;

public class With {
    public static void main(String[] args) {
        CollaborativeDocumentEditor doc = new CollaborativeDocumentEditor();

        // Creating users
        User alice = new User("Alice", doc);
        User bob = new User("Bob", doc);
        User charlie = new User("Charlie", doc);

        // Joining the collaborative document
        doc.add(alice);
        doc.add(bob);
        doc.add(charlie);

        // Users making changes
        alice.makeChange("Added project title");
        bob.makeChange("Corrected grammar in paragraph 2");
    }
}
