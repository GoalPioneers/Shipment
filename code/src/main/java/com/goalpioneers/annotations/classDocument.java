	package main.java.com.goalpioneers.annotations;
	
	import java.lang.annotation.Documented;
	
	
	public @Documented @interface classDocument
	{
		public String synopsis() default "";
		
		public String issues() default "";
		public String board() default "";
		public String contact() default "";
		
		public String createdBy() default "";
		public String createdAt() default "";
		
		public String lastModifiedBy() default "";
		public String lastModifiedAt() default "";
	}
