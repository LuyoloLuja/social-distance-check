package withScanner;
import java.io.File;

public class SocialDistanceChecker {
    File bookingsFile;

    public SocialDistanceChecker(File bookingsFile) {
        this.bookingsFile = bookingsFile;
    }

    public boolean check(String textFile) throws SocialDistancingViolation {
        if (!textFile.equals("x x x x x")) {
            throw new SocialDistancingViolation("Covid-19 is real! Please do social distance.");
        } else {
            return true;
        }
    }

}
