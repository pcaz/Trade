package com.presenceweb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name = "profiles")
public class Profile implements Serializable{

	private static final long serialVersionUID = -3126982516613370987L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name="last_name")
    private String last_name;
	@Column(name="first_name")
    private String first_name;
    @Column(name="birthday")
    private Date birthday;
    @Column(name="description")
    private String description;
    @Column(name="avatar")
    private String avatar;
    @Column(name="phone")
    private String phone;
   // @OneToOne(mappedBy = "profile")
    //private User user;
    
    
    /********************************************************************/

    
    public Long getId() {
		return id;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
    
    
    
	
}
