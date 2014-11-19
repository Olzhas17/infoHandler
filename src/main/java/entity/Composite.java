
package entity;

import java.util.List;

public interface Composite<T> {

    
    public void add(T value);
    public T getChildElement(int index);
    public List getAllElements();
    public void remove(T value);

}
