package Connect;

import java.sql.*;
import java.util.List;

class MysqlCon{
    public static void main(String args[]){
        String mar="";

        for (int i = 0; i < 10; i++) {
            System.out.println(mar);
        }
        List<String> marks=List.of("","","","","","","","","","");
        System.out.println(marks);
    }
}  