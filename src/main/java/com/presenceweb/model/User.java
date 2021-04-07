package com.presenceweb.model;



import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "users")
public class User implements Serializable{
	
	
	private static final long serialVersionUID = 5812808073009055306L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name="username")
    private String username;
	@Column(name="password")
    private String password;
	@Column(name="email")
    private String email;
	@Column(name="favorite_paiement")
    private String favoritePaiement;
	@Column(name="canals")
    private String canals;
	@Column(name="enabled")
	private Boolean enabled;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
            )
    private Set<Role> roles = new HashSet<>();

	/***********************************************************************/
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFavoritePaiement() {
		return favoritePaiement;
	}

	public void setFavoritePaiement(String favoritePaiement) {
		this.favoritePaiement = favoritePaiement;
	}

	public String getCanals() {
		return canals;
	}

	public void setCanals(String canals) {
		this.canals = canals;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled=enabled;
	}
	public Boolean isEnabled() {
		return enabled;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	       
	
}
