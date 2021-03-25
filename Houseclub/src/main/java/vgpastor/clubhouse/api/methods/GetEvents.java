package vgpastor.clubhouse.api.methods;

import java.util.List;

import vgpastor.clubhouse.api.ClubhouseAPIRequest;
import vgpastor.clubhouse.api.model.Event;

public class GetEvents extends ClubhouseAPIRequest<GetEvents.Response> {
	public GetEvents(){
		super("GET", "get_events", Response.class);
	}

	public static class Response{
		public List<Event> events;
	}
}
