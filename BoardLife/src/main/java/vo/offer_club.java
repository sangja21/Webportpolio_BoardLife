package vo;

public class offer_club {
	
	String club_title, user_id, b_id, club_place, club_day, club_time, club_detail, start_date, finish_date, club_reps;
	
	public String getClub_title() {
		return club_title;
	}
	public void setClub_title(String club_title) {
		this.club_title = club_title;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getB_id() {
		return b_id;
	}
	public void setB_id(String b_id) {
		this.b_id = b_id;
	}
	public String getClub_place() {
		return club_place;
	}
	public void setClub_place(String club_place) {
		this.club_place = club_place;
	}
	public String getClub_day() {
		return club_day;
	}
	public void setClub_day(String club_day) {
		this.club_day = club_day;
	}
	public String getClub_time() {
		return club_time;
	}
	public void setClub_time(String club_time) {
		this.club_time = club_time;
	}
	public String getClub_detail() {
		return club_detail;
	}
	public void setClub_detail(String club_detail) {
		this.club_detail = club_detail;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getFinish_date() {
		return finish_date;
	}
	public void setFinish_date(String finish_date) {
		this.finish_date = finish_date;
	}
	public String getClub_reps() {
		return club_reps;
	}
	public void setClub_reps(String club_reps) {
		this.club_reps = club_reps;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getMembership_fee() {
		return membership_fee;
	}
	public void setMembership_fee(int membership_fee) {
		this.membership_fee = membership_fee;
	}
	int capacity, membership_fee;
}
