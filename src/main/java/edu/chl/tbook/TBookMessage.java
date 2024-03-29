/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.tbook;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Andreas
 */
@Entity
public class TBookMessage implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private TBookUser fromUser = null;
    private TBookUser toUser = null;
    private TBookSchema toSchema = null;
    private Long postTime;
    private String text;
    
    public TBookMessage(){
        
    }
    
    public TBookMessage(TBookUser from, TBookUser messageTo, String message){
        Calendar cal = Calendar.getInstance();
        postTime = cal.getTimeInMillis();
    }
    
    public TBookMessage(TBookUser from, TBookSchema commentTo, String message){
        Calendar cal = Calendar.getInstance();
        postTime = cal.getTimeInMillis();
    }

    public TBookUser getFromUser() {
        return fromUser;
    }

    public void setFromUser(TBookUser fromUser) {
        this.fromUser = fromUser;
    }

    public Long getPostTime() {
        return postTime;
    }

    public void setPostTime(Long postTime) {
        this.postTime = postTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    
    
}
