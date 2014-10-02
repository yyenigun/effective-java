package com.bilgeadam.effective.java.lab01;

public class Person {

	private String name; // required
	private String lastName; // required
	private int age; // optional
	private String gender; // optional
	private String address; // optional
	private String gsmNo; // optional
	private String occupation; // optional

	private Person(Builder builder) {
		name = builder.name;
		lastName = builder.lastName;
		age = builder.age;
		gender = builder.gender;
		address = builder.address;
		gsmNo = builder.gsmNo;
		occupation = builder.occupation;
	}

	public static class Builder {

		private String name; // required
		private String lastName; // required
		private int age; // optional
		private String gender; // optional
		private String address; // optional
		private String gsmNo; // optional
		private String occupation; // optional

		public Builder(String name, String lastName) {
			this.name = name;
			this.lastName = lastName;
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Builder gender(String gender) {
			this.gender = gender;
			return this;
		}

		public Builder address(String address) {
			this.address = address;
			return this;
		}

		public Builder gsmNo(String gsmNo) {
			this.gsmNo = gsmNo;
			return this;
		}

		public Builder occupation(String occupation) {
			this.occupation = occupation;
			return this;
		}

		public Person build() {
			return new Person(this);
		}

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", age="
				+ age + ", gender=" + gender + ", address=" + address
				+ ", gsmNo=" + gsmNo + ", occupation=" + occupation + "]";
	}
}
