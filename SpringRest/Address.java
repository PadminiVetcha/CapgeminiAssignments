package org.padmini.springrest.SpringRestAssignment;

public class Address {

		private String state;
		private String city;
		private String country;
		private long zipcode;
		
		public Address(String state, String city, String country, long zipcode) {
			super();
			this.state = state;
			this.city = city;
			this.country = country;
			this.zipcode = zipcode;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public long getZipcode() {
			return zipcode;
		}
		public void setZipcode(long zipcode) {
			this.zipcode = zipcode;
		}
		
		
}
