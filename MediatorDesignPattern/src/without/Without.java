package without;

public class Without {
    public static void main(String[] args) {
         User alice = new User("alice");
         User bob = new User("bob");
         User zex = new User("zex");

         alice.addCollaborator(bob);
         alice.addCollaborator(zex);

         alice.notifyChange("Added the new things");

         bob.notifyChange("Added the github repo");
    }
}
