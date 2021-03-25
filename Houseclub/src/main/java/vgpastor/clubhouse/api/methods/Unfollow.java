package vgpastor.clubhouse.api.methods;

import vgpastor.clubhouse.api.BaseResponse;
import vgpastor.clubhouse.api.ClubhouseAPIRequest;

public class Unfollow extends ClubhouseAPIRequest<BaseResponse>{
	public Unfollow(int userID){
		super("POST", "unfollow", BaseResponse.class);
		requestBody=new Body(userID);
	}

	private static class Body{
		public int userId;

		public Body(int userId){
			this.userId=userId;
		}
	}
}
