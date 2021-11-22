
public class Static_this {

	
		// static and this (constructor and keyword)
		String name;
		String City;
		String State;
		Static_this (String name, String City, String State) {
		
		this.name=name;
		this.City=City;
		this.State=State;
		}
		public void getdata() {
		}
		
		public static void main(String[] args) 
		{
			Static_this st=new Static_this("shivali", "ujjain", "MP");
			st.getdata();
		}


}
