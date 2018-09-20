import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Inexcome {
    private double sum;
    ArrayList<Double> amountList = new ArrayList<>();
    ArrayList<String> dateList = new ArrayList<>();
    ArrayList<String> catagoryList = new ArrayList<>();
    ArrayList<String> descriptionList = new ArrayList<>();

    public void add(double amount, String date, String catagory, String description) {
        amountList.add(amountList.size(), amount);
        dateList.add(dateList.size(), date);
        catagoryList.add(catagoryList.size(), catagory);
        descriptionList.add(descriptionList.size(), description);
    }

    public ArrayList<Double> getAmountList() {
        return amountList;
    }

    public void edit(int i, int j, String input) {
        if (j == 1) {
            amountList.set(i, Double.parseDouble(input));
        } else if (j == 2) {
            dateList.set(i, input);
        } else if (j == 3) {
            catagoryList.set(i, input);
        } else if (j == 4) {
            descriptionList.set(i, input);
        }
    }

    public Double sum() {
        for (int i = 0; i < amountList.size(); i++) {
            sum += amountList.get(i);
        }
        return sum;
    }

    public void saveFiles(String filename) {
        File file = new File(filename);
        FileWriter writer;
        try {
            writer = new FileWriter(file, true);
            for (int i = 0; i < amountList.size(); i++) {
                writer.write(amountList.get(i) + " ");
                writer.write(dateList.get(i) + " ");
                writer.write(catagoryList.get(i) + " ");
                writer.write(descriptionList.get(i) + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
