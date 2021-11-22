import java.text.SimpleDateFormat;
import java.util.Date;
public class Datedemo
{

	public static void main(String[] args) {
		// date with customized format
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat ("dd/M/yyyy");
		SimpleDateFormat sd=new SimpleDateFormat ("dd/M/yyyy hh/mm/ss");
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		System.out.println(d.toString());

	}

}
