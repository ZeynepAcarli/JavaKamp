
public class Main {

	public static void main(String[] args) {
		
		Ders ders1= new Ders(1, "Java Dersi" , "21 Nisan",  0);
		Ders ders2= new Ders(2, "C# Dersi", "9 Ocak" , 0);
		
		DersManager dersManager = new DersManager();
		dersManager.Kaydol(ders1);

		
		DersManager dersManager2 = new DersManager();
		dersManager2.Ara(ders2);
		
	
	}

	

}
