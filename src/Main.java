import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

            public String truncar(double numero) {
                DecimalFormat df = new DecimalFormat("#.0");
                return df.format(numero);
            }
        }

