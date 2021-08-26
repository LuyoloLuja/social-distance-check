package withScanner;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, SocialDistancingViolation {

        File bookingsFile = new File("/home/codex/projects/Java Projects/social-distance-check/src/bookings.txt");
        SocialDistanceChecker socialDistanceChecker = new SocialDistanceChecker(bookingsFile);

        Scanner scanner = new Scanner(bookingsFile);

        while (scanner.hasNextLine()) {
            String fileText = scanner.nextLine();

            if (args.length == 0) {
                System.out.println(socialDistanceChecker.check(fileText));
            } else {
                Scanner argScanner = new Scanner(new File(args[0]));
                String enteredString = argScanner.nextLine();

                if (!enteredString.equals("x x x x x")) {
                    throw new SocialDistancingViolation("Covid-19 is real! Please do social distance.");
                } else {
                    System.out.println("True");
                }
            }
        }
    }
}