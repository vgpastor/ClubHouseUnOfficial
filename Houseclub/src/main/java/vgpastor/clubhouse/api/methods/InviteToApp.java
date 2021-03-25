package vgpastor.clubhouse.api.methods;

import vgpastor.clubhouse.api.BaseResponse;
import vgpastor.clubhouse.api.ClubhouseAPIRequest;

public class InviteToApp extends ClubhouseAPIRequest<BaseResponse> {

    public InviteToApp(String name, String phone_number, String message) {
        super("POST", "invite_to_app", BaseResponse.class);
        requestBody = new InviteToApp.Body(name, phone_number, message);
    }

    private static class Body {
        public String name;
        public String phone_number;
        public String message;

        public Body(String name, String phone_number, String message) {
            this.name = name;
            this.phone_number = phone_number;
            this.message = message;
        }
    }

}