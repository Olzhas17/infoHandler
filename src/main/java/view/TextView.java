
package view;

import entity.Listing;
import entity.Punctuation;
import entity.Sentence;
import entity.SentencePart;
import entity.Text;
import entity.Word;


public class TextView {

    public static String formatTextAsString(Text text) {

        StringBuilder sb = new StringBuilder();
        for (Sentence textpart : text.getAllElements()) {
            if (textpart.getClass().equals(Listing.class)) {
                Listing listing = (Listing) textpart;
                sb.append(listing.getValue());
            }
            for (SentencePart part : textpart.getAllElements()) {
                if (part instanceof Word) {
                    Word word = (Word) part;
                    sb.append(" ").append(word.getValue());
                } else {
                    Punctuation punctuation = (Punctuation) part;
                    sb.append(punctuation.getValue());
                }

            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
