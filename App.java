import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> features = new ArrayList<>();
        features.add("Start up");
        features.add("Perform task");
        features.add("Shut down");

        Components components = new Components();
        components.setName("Infared Goggles");
        components.setFunctionalities("Read temperature of Object");

        Robot robot = new Robot(1, null, components);
        Robot anotherRobot = robot.clone();

        System.out.println(robot.getID());
        System.out.println(robot.getComponents());
        System.out.println(robot.getFeatures());

        System.out.println(anotherRobot.getID());
        System.out.println(anotherRobot.getComponents());
        System.out.println(anotherRobot.getFeatures());
    }
}