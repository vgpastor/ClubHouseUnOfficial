package vgpastor.clubhouse.api.methods;

import java.util.List;

import vgpastor.clubhouse.api.ClubhouseAPIRequest;
import vgpastor.clubhouse.api.model.Club;

public class SearchClubs extends ClubhouseAPIRequest<SearchClubs.Response> {
	public SearchClubs(String query) {
		super("POST", "search_clubs", Response.class);
		requestBody = new Body(query);
	}

	private static class Body {
		public String query;

		public Body(String query) {
			this.query = query;
		}
	}

	public static class Response{
		public List<Club> clubs;
	}
}
