package vgpastor.clubhouse.api.methods;

import vgpastor.clubhouse.api.BaseResponse;
import vgpastor.clubhouse.api.ClubhouseAPIRequest;

public class Follow extends ClubhouseAPIRequest<BaseResponse>{
	public Follow(int userID){
		super("POST", "follow", BaseResponse.class);
		requestBody=new Body(userID);
	}

	private static class Body{
		public int userId, source=4;

		public Body(int userId){
			this.userId=userId;
		}
	}
}
