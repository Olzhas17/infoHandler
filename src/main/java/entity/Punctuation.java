
package entity;

import java.util.Objects;


public class Punctuation implements SentencePart{
    
    private String value;

    public Punctuation() {
    }

    public Punctuation(String value) {
        this.value = value;
    }
   
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.value);
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
        final Punctuation other = (Punctuation) obj;
        if (!Objects.equals(this.value, other.value)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append(" value=")
                .append(value).toString();
    }

    
    
}
