package vgpastor.clubhouse.api.methods;

import java.util.HashMap;

import vgpastor.clubhouse.api.BaseResponse;
import vgpastor.clubhouse.api.ClubhouseAPIRequest;

public class CheckForUpdate extends ClubhouseAPIRequest<BaseResponse>{
	public CheckForUpdate(){
		super("GET", "check_for_update", BaseResponse.class);
		queryParams=new HashMap<>();
		queryParams.put("is_testflight", "0");
	}
}
