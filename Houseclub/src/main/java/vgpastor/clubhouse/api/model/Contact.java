package vgpastor.clubhouse.api.model;

public class Contact {
	public String name, phone_number;
	public boolean in_app, is_invited;
	public int num_friends;

	public Contact(){
	}

	public Contact(String name, String phone_number){
		this.name=name;
		this.phone_number=phone_number;
	}

}
