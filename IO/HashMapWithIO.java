package IO;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class HashMapWithIO {
    public static void main(String[] args) {
        HashMap<String,Long> hashMap=new HashMap<>();
        hashMap.put("Xusniddin",998978117074L);
        hashMap.put("Alisher",99897998879L);
        hashMap.put("Xumoyun",998971151989L);
        hashMap.put("Javlonbek",998955496365L);
        hashMap.put("Lochinbek",9989146654656L);

        write(hashMap);
        read();
    }
    public static void write(HashMap<String,Long> Contact){

        try(FileWriter fileWriter = new FileWriter("C:\\UniquePojectFolder\\UniqueProject\\src\\IO\\files\\1_file.txt")) {
            for (String key:Contact.keySet()) {
                System.err.println(key+" : "+Contact.get(key).toString());
                fileWriter.write(key+" : "+Contact.get(key).toString()+"\n");
            }
        } catch (IOException e) {
            throw new RuntimeException("Xato Sodir Boldi"+e);
        }

    }

    public static void read(){
        try(FileReader fileReader=new FileReader("C:\\UniquePojectFolder\\UniqueProject\\src\\IO\\files\\1_file.txt")) {
            int i;
            while ((i=fileReader.read())!=-1){
                System.out.print((char) i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
