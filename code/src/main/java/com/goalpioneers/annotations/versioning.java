	package main.java.com.goalpioneers.annotations;
	
	import java.lang.annotation.Documented;
	
	
	/**
	 *
	 */
	public @Documented @interface versioning
	{
		public String major() default "1";
		public String minor() default "0";
		public String patch() default "0";
		
		public String build() default "9sep2022";
		public String stage() default "alpha";
	}
