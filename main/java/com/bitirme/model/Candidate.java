package com.bitirme.model;

public class Candidate {
		private long id;
		private String firstName;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getEndName() {
			return endName;
		}
		public void setEndName(String endName) {
			this.endName = endName;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		private String endName;
		private String title;
		//private Date birthDate;
		public Candidate(long id, String firstName, String endName, String title) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.endName = endName;
			this.title = title;
		}
}
