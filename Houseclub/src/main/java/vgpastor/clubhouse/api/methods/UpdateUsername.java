package vgpastor.clubhouse.api.methods;

import vgpastor.clubhouse.api.BaseResponse;
import vgpastor.clubhouse.api.ClubhouseAPIRequest;

public class UpdateUsername extends ClubhouseAPIRequest<BaseResponse>{
	public UpdateUsername(String name){
		super("POST", "update_username", BaseResponse.class);
		requestBody=new Body(name);
	}

	private static class Body{
		public String username;

		public Body(String username){
			this.username=username;
		}
	}
}
