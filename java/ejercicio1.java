
import java.util.ArrayList;


public class ejercicio1 {
    public static void main(String[] args) {
     ArrayList<String> deporte = new ArrayList<>();
    deporte.add("Football");
    deporte.add("Tenis");
    deporte.add("Volleball");
    deporte.add("Running");
    deporte.add("Swimming");
    for (int i = 0; i < deporte.size(); i++) {
      System.out.println("Me gusta ver " + deporte.get(i) + " en tele");
    }
    
  }
}
    

