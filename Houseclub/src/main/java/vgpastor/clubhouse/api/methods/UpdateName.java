package vgpastor.clubhouse.api.methods;

import vgpastor.clubhouse.api.BaseResponse;
import vgpastor.clubhouse.api.ClubhouseAPIRequest;

public class UpdateName extends ClubhouseAPIRequest<BaseResponse>{
	public UpdateName(String name){
		super("POST", "update_name", BaseResponse.class);
		requestBody=new Body(name);
	}

	private static class Body{
		public String name;

		public Body(String name){
			this.name=name;
		}
	}
}
