package vgpastor.clubhouse.api.methods;

import java.util.List;

import vgpastor.clubhouse.api.ClubhouseAPIRequest;
import vgpastor.clubhouse.api.model.Channel;

public class GetChannels extends ClubhouseAPIRequest<GetChannels.Response>{
	public GetChannels(){
		super("GET", "get_channels", Response.class);
	}

	public static class Response{
		public List<Channel> channels;
	}
}
