//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}
//observer design pattern is used when there is one subject and multiple observers.
//if there's is chnage in state of the objects the observers are notified.
//Ex: Yt Channel(Subject) -> Video Upload (State Change) -> Email to the users (Observers)
//notifying via email or any oterh method.

//Failes at scale. at scale use Apache Kafka, Rabbit MQ, PUB/SUb.
//Adapter pattern usues push model (It pushes all the users). as redis pub/sub.
//Kafka and rabbitMQ uses the pull model.