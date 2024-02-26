package homework7;

import java.io.*;
import java.util.Arrays;

public class AppData {

    public String[] header;
    public int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public static AppData load(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String[] header = reader.readLine().split(";");
            int[][] data = reader.lines().map(line -> Arrays.stream(line.split(";")).mapToInt(Integer::parseInt).toArray()).toArray(int[][]::new);
            return new AppData(header, data);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void save(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(String.join(";", header));
            writer.newLine();
            for (int[] row : data) {
                writer.write(String.join(";", Arrays.stream(row).mapToObj(String::valueOf).toArray(String[]::new)));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
