package vgpastor.clubhouse.api.methods;

import java.util.HashMap;
import java.util.List;

import vgpastor.clubhouse.api.ClubhouseAPIRequest;
import vgpastor.clubhouse.api.model.FullUser;

public class GetFollowing extends ClubhouseAPIRequest<GetFollowing.Response>{
	public GetFollowing(int userID, int pageSize, int page){
		super("GET", "get_following", Response.class);
		queryParams=new HashMap<>();
		queryParams.put("user_id", userID+"");
		queryParams.put("page_size", pageSize+"");
		queryParams.put("page", page+"");
	}

	public static class Response{
		public List<FullUser> users;
		public int count;
	}
}
