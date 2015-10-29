package com.sayantan.model;

import javax.persistence.*;

@Entity
@Table(name = "UID_AUTH")
public class AuthenticationModel {

    @Id @GeneratedValue
    @Column(name = "GEN_ID")
    private Long id;

    @Column(name = "UNAME")
    private String text;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "NEXT_MESSAGE_ID")
    private AuthenticationModel nextMessage;

    AuthenticationModel() {}

    public AuthenticationModel(String text) {
        this.text = text;
    }

    public Long getId() {
        return id;
    }
    private void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

     public AuthenticationModel getNextMessage() {
         return nextMessage;
     }
     public void setNextMessage(AuthenticationModel nextMessage) {
         this.nextMessage = nextMessage;
     }
}