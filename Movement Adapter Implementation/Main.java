import java.util.Scanner;

public class Main {
    private static final KeyboardInput keyboardInput;

    static {
        WASDInput wasdInput = new WASDInput();
        IJKLInput ijklInput = new IJKLInput();
        keyboardInput = new KeyboardAdapter(wasdInput, ijklInput);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Use WASD or IJKL keys to move (Q to quit):");

        while (true) {
            String input = scanner.nextLine().toUpperCase();
            if (input.equals("Q")) {
                break;
            }
            for (char key : input.toCharArray()) {
                keyboardInput.setKeyDown(key, true);
                update();
                //keyboardInput.setKeyDown(key, false);
            }
        }
    }

    private static void update() {
        if (keyboardInput.isKeyDown('W') || keyboardInput.isKeyDown('I')) {
            System.out.println("Moving Up");
        }
        if (keyboardInput.isKeyDown('A') || keyboardInput.isKeyDown('J')) {
            System.out.println("Moving Left");
        }
        if (keyboardInput.isKeyDown('S') || keyboardInput.isKeyDown('K')) {
            System.out.println("Moving Down");
        }
        if (keyboardInput.isKeyDown('D') || keyboardInput.isKeyDown('L')) {
            System.out.println("Moving Right");
        }
    }
}
