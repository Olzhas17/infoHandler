
package main;

import entity.Sentence;
import entity.Text;
import util.TextParser;
import util.TextWorker;
import view.TextView;
import org.apache.log4j.Logger;


public class InfoHandler {

    private static final Logger log = Logger.getLogger(InfoHandler.class);

    public static void main(String[] args) {

        TextParser tp = new TextParser();
        Text text = tp.parse("text.txt");
        log.error("Plain text");
        System.out.println(TextView.formatTextAsString(text));
         //12 subtask
         TextWorker.removeWordsStartWithConsonant(text, 4);
         System.out.println(TextView.formatTextAsString(text));
         //2 subtask
         TextWorker.sortBySentence(text);
         System.out.println(TextView.formatTextAsString(text));
         //5 subtask
         TextWorker.swapWords(text);
         System.out.println(TextView.formatTextAsString(text));
         
    }

}
