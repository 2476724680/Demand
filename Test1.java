package Test01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Test1 {

    void replace(List<String> filterType) throws Exception {

        for(String fT:filterType){
            BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(new File("LogicFilter.java").getAbsoluteFile())));
            PrintStream ps=new PrintStream(new FileOutputStream(new File(fT+"LogicFilter"+".java")));
        int i=-1,count=0;
        while((i=br.read())!=-1){
            if((char)i!='?')
            ps.write((char)i);
            else{
                if(count==0){
                    ps.write(fT.getBytes());
                    count++;
                }
                else{
                    ps.write(fT.toUpperCase().getBytes());
                }
            }
        }
    }

    }

}
