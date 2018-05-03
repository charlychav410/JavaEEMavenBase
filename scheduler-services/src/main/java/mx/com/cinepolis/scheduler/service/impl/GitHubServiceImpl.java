package mx.com.cinepolis.scheduler.service.impl;

import mx.com.cinepolis.scheduler.service.GitHubService;

public class GitHubServiceImpl implements GitHubService{

	@Override
	public Boolean getUser(String user, String password) {
		
		if(user.equals("carlos")&&password.equals("carlos1"))
		{
			return true; 
		}
		else {
			return false;
			}
	}

}
