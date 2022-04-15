
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class demoGeneric {
    public static void capitalize (String input, String output,boolean caps){
        // FIXME complete this method
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get(input));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (lines == null || lines.isEmpty()) {
            try {
                Files.writeString(Paths.get(output), "");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println(lines);
            for (int l = 0; l < lines.size(); l++) {
                String line = lines.get(l);
                System.out.println(line);
                String[] words = line.split(" ");
                StringBuilder outputWords = new StringBuilder();
                if (caps) {
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].length() > 1 && words[i].charAt(words[i].length() - 1) == '!' && words[i].length() <= 20) {
                            words[i] = toUpper(words[i]);
                        }
                        if (i < words.length - 1)
                            outputWords.append(words[i]).append(" ");
                        else outputWords.append(words[i]);
                    }
                    try {
                        Files.writeString(Paths.get(output), outputWords.toString());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        Files.writeString(Paths.get(output), line);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }


    }
    private static String toUpper(String word){
        StringBuilder upper = new StringBuilder();
        for (int i = 0; i < word.length(); i++){
            char current = word.charAt(i);
            if (current>=97&&current<=122)
                current -= 32;
            upper.append((char) current);
        }
        return upper.toString();
    }

    public static void main(String[] args) {
        capitalize("D:\\1.txt","D:\\2.txt",true);
    }

    }