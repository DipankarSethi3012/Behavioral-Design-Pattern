package without;

import java.util.ArrayList;
import java.util.List;

//Class Representing a user in collaborative document editor
public class User {
    private String name;
    private List<User> others; //List of user that have access to  this document

    public User (String name) {
        this.name = name;
        others = new ArrayList<>();
    }
    //method to add the user to this document
    public void addCollaborator(User user) {
        others.add(user);
    }

    //Method to make a change to document and notify all the collaborators
    //Each collaborator receive a change notification
    public void notifyChange(String change) {
        System.out.println(name + " made a change: " + change);
        for(User user : others) {
            user.receiveChange(name, user);
        }
    }

    //method to receive change for the user
    public void receiveChange(String change, User user) {
        System.out.println(name + " received: /" + change + "/from" + user.name);
    }
}


//Each user is directed connected with other user, creating a tight coupling
//Modifying a list of users can easily break a system, especially in large systems where users afe dynamically managed. This increases the complexity of managing the system
//The current system doesn't good for managing the different roles (Admin, user, HR). That requires a signmificant change
//The current approach manages the user specific permissions
