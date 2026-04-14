package wihtout;

public class Without {
    public static void main(String[] args) {
        Light light = new Light();
        AC ac = new AC();

        Remote remote = new Remote(ac, light);
        remote.AcOff();
        remote.AcOn();

        remote.lightOn();
        remote.lightOff();

        remote.undo();
    }
}

//Problems without Command Pattern:
//OCP breaks in Remote Class, Everytime the new object is added the code has to be modified
//Tightly coupled: The Invoker (Remote) knows the operations;
//So not ot use it in production