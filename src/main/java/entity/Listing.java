package entity;

import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class Listing extends Sentence {

    private String value;

    public Listing() {
    }

    public Listing(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append(getClass().getSimpleName())
                .append(" ")
                .append(value).toString();
    }

    @Override
    public SentencePart getChildElement(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(SentencePart sentencePart) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<SentencePart> getAllElements() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public int getNumberOfWords() {
        return 0;
    }

    @Override
    public void remove(SentencePart sentencePart) {
        throw new UnsupportedOperationException();

    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 43 * hash + Objects.hashCode(this.value);
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
        final Listing other = (Listing) obj;
        if (!Objects.equals(this.value, other.value)) {
            return false;
        }
        return true;
    }

}
