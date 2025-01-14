package vgpastor.clubhouse.api.methods;

import vgpastor.clubhouse.api.ClubhouseAPIRequest;
import vgpastor.clubhouse.api.model.User;

public class CompletePhoneNumberAuth extends ClubhouseAPIRequest<CompletePhoneNumberAuth.Response>{

	public CompletePhoneNumberAuth(String phoneNumber, String code){
		super("POST", "complete_phone_number_auth", Response.class);
		requestBody=new Body(phoneNumber, code);
	}

	public static class Response{
		public String authToken, accessToken, refreshToken;
		public boolean isWaitlisted;
		public User userProfile;
	}

	private static class Body{
		public String phoneNumber, verificationCode;

		public Body(String phoneNumber, String verificationCode){
			this.phoneNumber=phoneNumber;
			this.verificationCode=verificationCode;
		}
	}
}
