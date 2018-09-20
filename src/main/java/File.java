import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class File {
    public void readFiles(String filename, Inexcome inexcome) {
        Scanner in;
        try {
            in = new Scanner(new FileReader(filename));
        } catch (FileNotFoundException e1) {
            System.out.println("Error opening accounts file.");
            return;
        }

        while (in.hasNext())
        {
            String type = in.next();
            String date = in.next();
            String des = in.next();
            Double money = in.nextDouble();
            if (type.equals("income")){
                inexcome.add(money,date,type,des);
            }else {
                inexcome.add(money,date,type,des);
            }

        }
        in.close();
    }

}
