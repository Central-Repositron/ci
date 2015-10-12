package com.sayantan.model;

import javax.persistence.*;

@Entity
@Table(name = "MESSAGES")
@org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.READ_WRITE)
@org.hibernate.annotations.GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
@NamedQueries({ @NamedQuery(name = "nextMessageIdList", query = "select i from MessageHibModel i ") }) //where i.description like :desc
public class MessageHibModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MESSAGE_ID")
	private Long id;

	@Column(name = "MESSAGE_TEXT")
	@GeneratedValue(generator = "hibernate-uuid")
	private String text;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "NEXT_MESSAGE_ID")
	private MessageHibModel nextMessage;

	public MessageHibModel() {
	}

	public MessageHibModel(String text) {
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

	public MessageHibModel getNextMessage() {
		return nextMessage;
	}

	public void setNextMessage(MessageHibModel nextMessage) {
		this.nextMessage = nextMessage;
	}
}