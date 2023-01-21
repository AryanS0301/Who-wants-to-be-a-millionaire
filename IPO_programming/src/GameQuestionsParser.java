import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GameQuestionsParser {
    private static FileReader file;
    private static BufferedReader line;
    private static String currQuestion;
    private static String[] options;
    private static int Score;

    public void QuestionParser() throws FileNotFoundException {
        file = new FileReader("gamequestions.txt");
        line = new BufferedReader(file);
    }
    public String getQuestions() throws IOException {
        currQuestion = line.readLine();
        return currQuestion;
    }
    public String[] getOptions() throws IOException {
        options = new String[5];
        options[0] = line.readLine();
        options[1] = line.readLine();
        options[2] = line.readLine();
        options[3] = line.readLine();
        options[4] = line.readLine();
        return options;

    }
}
