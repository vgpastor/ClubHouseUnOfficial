package vgpastor.clubhouse.api.model;

import java.util.Date;

public class Notification {
    public long notificationId;
    public boolean inUnread;
    public User userProfile;
    public int eventId;
    public int type;
    public Date timeCreated;
    public String message;
    public String channel;
//    public Channel channel;

    public static final int NOTIFICATION_TYPE_USER=1;
    public static final int NOTIFICATION_TYPE_EVENT=16;
}
