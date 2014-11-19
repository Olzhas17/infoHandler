
package entity;

import java.util.Objects;


public class Word implements SentencePart{
    private String value;
    
    public Word() {
    }

    public Word(String value) {
        this.value = value;
    }
   
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
   
    public int getLength() {
        return value.length();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Word word = (Word) obj;
        if ((value == null) ? (word.value != null) : !value.equals(word.value)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.value);
        return hash;
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append(getClass().getSimpleName())
                .append(" value=")
                .append(value).toString();
    }
    
    
    
}
