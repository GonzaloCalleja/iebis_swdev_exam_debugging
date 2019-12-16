import java.util.Random;

@SuppressWarnings("ALL")
public class Main {

    public static void main(String[] args) {
        String emailAddress = "john.doe.mis2016@ie.edu";
        // Change 1 regex from "." to "\\.", as instructed by teacher, to match only the . character instead of any character
        String formattedEmailAddress = emailAddress.replaceAll("\\.", "/");

        Random random = new Random();
        // Change 2 initializing word instead of declaring it null.
        // initializing word outside the switch statement as an empty StringBuffer, and then appending the pertinent
        // character in the switch statement
        StringBuffer word = new StringBuffer();

        // Change 3 random bound from 2 to 3, since the nextInt() method returns a random int that goes from 0 to a number
        // smaller than the bound given. Therefore, bound 2 returns either 0 or 1, and bound 3 returns either 0, 1 or 2
        // which will give the equiprobability for each choice.
        switch (random.nextInt(3)) {
            case 0:
                word.append('Y');
                break;
            case 1:
                word.append('F');
                break;
            case 2:
                word.append('T');
                break;
        }
        // Change 4 adding break statements at the end of all the cases in the switch
        // this is neccessary because otherwise, when a case is detected all the following cases are also executed.
        
        word.append('o');
        word.append('u');
        word.append('r');

        System.out.println(word + " " + formattedEmailAddress);
    }
}
