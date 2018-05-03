package mx.com.cinepolis.scheduler.commons.to;

import java.io.Serializable;

public class CatalogsTO implements Serializable{
	
	private int id;
	
	private String name;
	
	private String names;
	
	private String login;
		
	private int followers;
	
	private int followings;
	
	
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public int getFollowers() {
		return followers;
	}
	
	public void setFollowers(int followers) {
		this.followers = followers;
	}
	
	public int getFollowings() {
		return followings;
	}
	
	public void setFollowings(int followings) {
		this.followings = followings;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
