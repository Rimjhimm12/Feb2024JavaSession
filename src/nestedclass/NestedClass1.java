package nestedclass;


public class NestedClass1{
	
	
	public class OuterClass{
		
		public void outerMethod() {
			
			System.out.println("Inside outercalss");
		}
		
		public class InnerClass{
			
			public void innerMethod() {
				
				System.out.println("Inside innerClass");
			}	
		}
		public void nestedmethod() {
			InnerClass innerobj = new InnerClass();
			innerobj.innerMethod();
				
		}
		
		
		
	}
	
	
	
	public void nestedmethod1() {
		OuterClass outerobj = new OuterClass();
		outerobj.outerMethod();
		outerobj.nestedmethod();
		
		
	}
		
	

}
