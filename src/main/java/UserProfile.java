import java.io.File;
import java.util.ArrayList;

import javax.xml.transform.Source;

public class UserProfile {

     private int id;
     private String name;
     private ArrayList<HealthRecord> healthRecords;
     private ArrayList<Appointments> appointments;
     private Chat chat;


     public boolean addRecord(Unit unit, float value, Source src) {
          boolean saved = false;
          return saved;
     };

     public boolean shareRecords(int dataid, int userid) {
          boolean shared =false;
          return shared;
     }

     public File exportRecords(Format format, ){}

   
}