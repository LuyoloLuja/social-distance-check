package withInputStream;

import java.io.*;

/*
    *** TO DO ***
        * use while loop for multiple rows
        * functionality to read file from main method argument
*/

public class SocialDistanceChecker {
    File bookingsFile;

    public SocialDistanceChecker(File bookingsFile) {
        this.bookingsFile = bookingsFile;
    }

    public boolean check(InputStream inputStream) throws SocialDistancingViolation, IOException {

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {

            String enteredText = bufferedReader.readLine();

            if (!enteredText.equals("x x x x x")) {
                throw new SocialDistancingViolation("Covid-19 is real! Please do social distance.");
            } else {
                return true;
            }
        }
    }
}
