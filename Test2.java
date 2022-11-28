package Test01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test2 {

    void add(List<String> list) throws Exception {

        RandomAccessFile raf=new RandomAccessFile(new File("DecisionTreeConstant.java").getAbsoluteFile(),"rw");
        try {
            long length = raf.length();
            raf.seek(length-1);
            for (String l : list) {
                String str1 = "    public static String " + l.toUpperCase() + "_DECISION = \"" + l.toLowerCase() + "\";\n";
                raf.write(str1.getBytes());
            }
            raf.writeByte('\n');
            raf.writeByte('}');
        }
        finally {
            if(raf!=null)
            raf.close();
        }
    }
}
