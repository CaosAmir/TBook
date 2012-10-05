
package edu.chl.tbook;

import java.util.*;
import javax.persistence.*;

public class SchemaCatalogue extends AbstractDAO<TBookSchema, String> implements ISchemaCatalogue {

    private SchemaCatalogue(String puName) {
        super(TBookSchema.class, puName);
    } 
    
    public static ISchemaCatalogue newInstance(String puName){
        return new SchemaCatalogue(puName);
    }
}
