package Test01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Test1 {


    void replace(List<String> filterType) throws Exception {
        BufferedReader br=null;
        PrintWriter ps=null;


        try
        {
            for (String fT : filterType)
            {
                br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("LogicFilter.java").getAbsoluteFile())));
                ps = new PrintWriter(new FileOutputStream(new File(fT + "LogicFilter" + ".java")));
                int i = -1, count = 0;
                while ((i = br.read()) != -1)
                {
                    if ((char) i != '?')
                        ps.write(i);
                    else
                    {
                        if (count == 0)
                        {
                            System.out.println("1");
                            ps.write(fT.toCharArray());
                            count++;
                        } else
                        {
                            ps.write(fT.toUpperCase().toCharArray());
                        }
                    }
                }
                if (ps != null) ps.close();
            }
        } finally {
            if (br != null) br.close();
        }

    }

}
