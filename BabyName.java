
import edu.duke.*;
import org.apache.commons.csv.*;

public class BabyName {
	public static void main(String[] args) {
		BabyName ob = new BabyName();
		ob.babyNames();

	}

	public void babyNames()
	{
		FileResource fr = new FileResource();
		for(CSVRecord rec : fr.getCSVParser(false))
		{
			System.out.println("name: " + rec.get(0) +" " + "Gender: " + rec.get(1) + " " + "Num Born: " + rec.get(2));

		}	
	}
}
