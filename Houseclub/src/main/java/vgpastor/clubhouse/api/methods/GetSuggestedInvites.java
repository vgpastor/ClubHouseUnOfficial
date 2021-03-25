package vgpastor.clubhouse.api.methods;

import java.util.List;

import vgpastor.clubhouse.api.ClubhouseAPIRequest;
import vgpastor.clubhouse.api.model.Contact;

public class GetSuggestedInvites extends ClubhouseAPIRequest<GetSuggestedInvites.Response> {

    public GetSuggestedInvites(List<Contact> contacts){
        super("POST", "get_suggested_invites", Response.class);
        requestBody=new GetSuggestedInvites.Body(contacts);
    }

    private static class Body{
        public boolean upload_contacts;
        public List<Contact> contacts;

        public Body(List<Contact> contacts){
            this.upload_contacts=true;
            this.contacts=contacts;
        }
    }

    public static class Response{
        public List<Contact> suggested_invites;
        public int num_invites;
    }

}
