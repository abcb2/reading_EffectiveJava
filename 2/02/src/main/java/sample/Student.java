package sample;

public class Student {
	private final String name;
	private final int age;
	private final String favorite;
	private final String country;
	
	public static class Builder {
		private final String name;
		private final int age;

		private String favorite = "BLANK";
		private String country = "BLANK";
		
		public Builder(String name, int age){
			this.name = name;
			this.age = age;
		}
		public Builder favorite(String val){
			this.favorite = val;
			return this;
		}
		public Builder country(String val){
			this.country = val;
			return this;
		}
		public Student build(){
			return new Student(this);
		}
	}
	private Student(Builder builder){
		this.name = builder.name;
		this.age = builder.age;
		this.favorite = builder.favorite;
		this.country = builder.country;
	}
	public String toString(){
		return String.format("%s\t%d\t%s\t%s\n", this.name, this.age, this.favorite, this.country);
	}
}
