package vgpastor.clubhouse.api.methods;

import java.util.List;

import vgpastor.clubhouse.api.ClubhouseAPIRequest;
import vgpastor.clubhouse.api.model.FullUser;

public class SearchUsers extends ClubhouseAPIRequest<SearchUsers.Resp> {

	public SearchUsers(String query) {
		super("POST", "search_users", Resp.class);
		requestBody = new Body(query);
	}

	private static class Body {
		public boolean cofollowsOnly;
		public boolean followingOnly;
		public boolean followersOnly;
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