/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resourcebundle;

import java.util.ListResourceBundle;


public class Resource extends ListResourceBundle {//mn chislo

    @Override
    protected Object[][] getContents() {
        return new Object[][] {
            {ApplicationValue.SENTENCE, "([A-Za-z_0-9](|[^?!.\\(]|\\([^\\)]*\\))*[?!.]|\\w.+:)"},
            {ApplicationValue.HEADER, "1.+"},
            {ApplicationValue.OUTPUT, "(G.+) = (.+)"},
            {ApplicationValue.WORD_PUNCUATION, "([a-zA-Z0-9-])+|(['.,?!><=();:])"}
        };
    }

}
