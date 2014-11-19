package entity;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;


public class Sentence implements Composite<SentencePart>,
        Comparable<Sentence> {

    private List<SentencePart> sentence;

    public Sentence() {
        this.sentence = new LinkedList<SentencePart>();
    }

    @Override
    public void add(SentencePart sentencePart) {
        sentence.add(sentencePart);
    }

    @Override
    public void remove(SentencePart sentencePart) {
        sentence.remove(sentencePart);
    }

    @Override
    public SentencePart getChildElement(int index) {
        return sentence.get(index);
    }

    @Override
    public List<SentencePart> getAllElements() {
        return sentence;
    }

    public int getNumberOfWords() {
        int count = 0;
        for (SentencePart sp : sentence) {
            if (sp instanceof Word) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int compareTo(Sentence o) {
        Sentence newSentence = (Sentence) o;
        return Integer.compare(this.getNumberOfWords(), newSentence.getNumberOfWords());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.sentence);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sentence other = (Sentence) obj;
        if (!Objects.equals(this.sentence, other.sentence)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append(getClass().getSimpleName())
                .append(" sentence=")
                .append(sentence).toString();
    }

}
