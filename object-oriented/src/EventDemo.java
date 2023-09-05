
 class OuterEventImpl implements Event{
	
	@Override
	public void dosomething() {
		System.out.println("Outer Event implementation");

}}
public class EventDemo implements Event {

	@Override
	public void dosomething() {
		System.out.println("Simple Event implementation");

	}
	
	private class InnerEventImpl implements Event{
		public void dosomething() {
			System.out.println("Inner Event implementation");

		}
		
	}
	
	public static class StaticEventImpl implements Event{
		@Override
		public void dosomething() {
			System.out.println("Static Event implementation");

		}
	}
	
	public void oneMoreEvent() {
		class NestedEventImpl implements Event{ // class can be abstract or final as it's inside method that's why it cannot be public, private or protected.

			@Override
			public void dosomething() {
                System.out.println("Nested Event implement");				
			}
			
		};// just putting there to tell the end of Nested class.
		new NestedEventImpl().dosomething();
	}
	
	public void oneLastEvent() {
		//new Event() {
        Event e = new Event () {
			@Override
			public void dosomething() {
				System.out.println("Anonymous Event implementation");
				
			}
			
		};//.dosomething();
	    e.dosomething();
	}
	
	public void pakkaLastEvent() {
		Event e = () -> System.out.println("Lambda Event implementation");
		e.dosomething();
	}
	public static void main(String[] args) {
		EventDemo ed = new EventDemo();
		ed.dosomething();
		
		OuterEventImpl oe = new OuterEventImpl();
		oe.dosomething();
		
		InnerEventImpl ee = ed.new InnerEventImpl();// here error was giving bcz we created class in class so we solve 
		ee.dosomething();
		
		EventDemo.StaticEventImpl se = new EventDemo.StaticEventImpl();
		se.dosomething();
		
		ed.oneMoreEvent();
		ed.oneLastEvent();
		ed.pakkaLastEvent();
	}

}

