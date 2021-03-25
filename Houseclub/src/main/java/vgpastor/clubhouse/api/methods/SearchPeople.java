package vgpastor.clubhouse.api.methods;

import java.util.List;

import vgpastor.clubhouse.api.ClubhouseAPIRequest;
import vgpastor.clubhouse.api.model.FullUser;

public class SearchPeople extends ClubhouseAPIRequest<SearchPeople.Resp> {
	public SearchPeople(String query) {
		super("POST", "search_users", Resp.class);
		requestBody = new Body(query);
	}

	private static class Body {
		public String query;

		public Body(String query) {
			this.query = query;
		}
	}

	public static class Resp {
		public List<FullUser> users;
		public int count;
	}
}
