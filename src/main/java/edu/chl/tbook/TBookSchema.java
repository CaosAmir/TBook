package edu.chl.tbook;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;

/**
 *
 * @author Kristofer
 */

@Entity
public class TBookSchema implements Serializable{

    
    @Id
    @OneToOne
    private TBookUser owner;
    @ManyToMany
    private List<Exercise> ex;
    private Long datum;
    private String comment;

    public TBookSchema() {
    }

    public TBookSchema(String comment, TBookUser owner, List<Exercise> ex) {
        this.datum = Calendar.getInstance().getTimeInMillis();
        this.comment = comment;
        this.owner = owner;
        this.ex = ex;
    }

    public TBookSchema(String comment, TBookUser owner) {
        this.datum = Calendar.getInstance().getTimeInMillis();
        this.comment = comment;
        this.owner = owner;
    }
    
    
    
    
    public Long getDate() {
        return datum;
    }

    public void setDate(Long datum) {
        this.datum = datum;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public TBookUser getUser() {
        return owner;
    }

    public void setUser(TBookUser owner) {
        this.owner = owner;
    }

    public List<Exercise> getEx() {
        return ex;
    }

    public void setEx(List<Exercise> ex) {
        this.ex = ex;
    }
    
    public void addEx(List<Exercise> exercise){
        ex.addAll(exercise);
    }
    
    
}
