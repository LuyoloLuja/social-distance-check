package withInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException, SocialDistancingViolation {
        File file = new File("/home/codex/projects/Java Projects/social-distance-check/src/bookings.txt");
        SocialDistanceChecker socialDistanceChecker = new SocialDistanceChecker(file);

        InputStream inputStream = new FileInputStream(file);
        System.out.println(socialDistanceChecker.check(inputStream));

    }
}
