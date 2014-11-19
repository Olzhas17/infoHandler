
package util;

import entity.Listing;
import entity.Sentence;
import entity.SentencePart;
import entity.Text;
import entity.Word;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.Logger;


public class TextWorker {

    private static final Logger log = Logger.getLogger(TextWorker.class);

    /**
     * Method sorts the sentences in the text by the number of words
     *
     * @param text
     */
    public static void sortBySentence(Text text) {
        log.error("Subtask N2");
        Collections.sort(text.getAllElements());
    }

    /**
     * Method swaps first and last word in a sentence
     *
     * @param text
     */
    public static void swapWords(Text text) {
        log.error("Subtask N5");
        LinkedList<Sentence> allElements = (LinkedList<Sentence>) text.getAllElements();
        for (Sentence sentenceOrListing : allElements) {
            if (sentenceOrListing.getClass() != Listing.class) {
                int indexFirst = 0;
                int indexLast = 0;
                Sentence sentence = (Sentence) sentenceOrListing;
                List<SentencePart> sentenceParts = sentence.getAllElements();
                for (int i = 0; i < sentenceParts.size(); i++) {
                    SentencePart part = sentenceParts.get(i);
                    if (part instanceof Word) {
                        indexFirst = i;
                        break;
                    }
                }
                for (int i = sentenceParts.size() - 1; i >= 0; i--) {
                    SentencePart part = sentenceParts.get(i);
                    if (part instanceof Word) {
                        indexLast = i;
                        break;
                    }
                }
                Collections.swap(sentenceParts, indexFirst, indexLast);
            }
        }
    }

    
    /**
     * This method removes the words fixed length starting with consonant letter
     *
     * @param text
     * @param length word's length
     */
    public static void removeWordsStartWithConsonant(Text text, int length) {
        log.error("Subtask N12");
        for (int i = 0; i < text.getAllElements().size(); i++) {
            Sentence sentence = text.getChildElement(i);
            if (sentence.getClass() != Listing.class) {
                for (int j = 0; j < sentence.getAllElements().size(); j++) {
                    SentencePart sentencePart = sentence.getChildElement(j);
                    if (sentencePart instanceof Word) {
                        Word word = (Word) sentencePart;
                        if (word.getLength() == length && isStartsWithConsonant(word)) {
                            sentence.remove(word);
                        }
                    }

                }
            }
        }
    }

    private static boolean isStartsWithConsonant(Word word) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

        if (vowels.contains(word.getValue().toLowerCase().charAt(0))) {
            return false;
        }
        return true;

    }
}
