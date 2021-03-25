package vgpastor.clubhouse.api.methods;

import vgpastor.clubhouse.api.ClubhouseAPIRequest;
import vgpastor.clubhouse.api.model.Channel;

public class GetChannel extends ClubhouseAPIRequest<Channel>{
	public GetChannel(String name){
		super("POST", "get_channel", Channel.class);
		requestBody=new Body(name);
	}

	private static class Body{
		public String channel;

		public Body(String channel){
			this.channel=channel;
		}
	}
}
