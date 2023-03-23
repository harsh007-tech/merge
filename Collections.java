import java.util.*;
public class Collections 
{
    
        public static void main(String[] args) 
        {
            Collection<String> data = new HashSet<>();
            data.add("1");
            data.add("2");
            data.add("7");
            data.add("0");
            data.add("0");
            System.out.print(data);
            
            Collection<String> data1 = new TreeSet<>();
            data1.add("1");
            data1.add("2");
            data1.add("7");
            data1.add("0");
            data1.add("0");
            System.out.print(data1);
            
            Collection<String> data2 = new LinkedHashSet<>();
            data2.add("1");
            data2.add("2");
            data2.add("7");
            data2.add("0");
            data2.add("0");
            System.out.print(data2);
            
            Map<String, String> empData = new HashMap<>();
            empData.put("B","Harsh");
            empData.put("C","Ha");
            empData.put("A","Harsh");
            empData.put("A","Ha");
            System.out.print(empData);
            
                Map<String, String> empData1 = new TreeMap<>();
            empData1.put("C","Ha");
            empData1.put("B","Harsh");
            empData1.put("A","Harsh");
            empData1.put("A","Ha");
            System.out.print(empData1);
            
                Map<String, String> empData3 = new LinkedHashMap<>();
            empData3.put("C","Ha");
            empData3.put("B","Harsh");
            empData3.put("A","Harsh");
            empData3.put("A","Ha");
            System.out.print(empData3);
                System.out.print(empData3.get("A"));
            
            
        }
    
        
}
