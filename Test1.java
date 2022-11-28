package Test01;

import java.io.*;
import java.util.List;


public class Test1 {

    void replace(List<String> filterType) throws Exception {

        for(String fT:filterType){
            BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(new File("LogicFilter.java").getAbsoluteFile())));
            PrintWriter ps=new PrintWriter(new FileOutputStream(new File(fT+"LogicFilter"+".java")));
        int i=-1,count=0;
        while((i=br.read())!=-1){
            if((char)i!='?')
            ps.write(i);
            else{
                if(count==0){
                    ps.write(fT.toCharArray());
                    count++;
                }
                else{
                    ps.write(fT.toUpperCase().toCharArray());
                }
            }
        }
        br.close();
        ps.close();
    }

    }

}
