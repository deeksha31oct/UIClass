package JAVATest;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
   //@Test
    public void names() {
        ArrayList<String> n = new ArrayList<String>();
        n.add("Deeksha");
        n.add("Bholu");
        n.add("Rajkumar");
        n.add("raju");
        n.add("famiily");
        int count = 0;
        for (int i = 0; i < n.size(); i++) {
            String result = n.get(i);
            if (result.startsWith("D")) {
                count++;
            }
        }
        System.out.println(count);
    }

    //@Test
    public void Stream() {
        ArrayList<String> s = new ArrayList<String>();
        s.add("Deeksha");
        s.add("Bholu");
        s.add("Rajkumar");
        s.add("Raju");
        s.add("Raj");
        int count = 0;
        //there is no life for intermediate operation if there is no terminal opeartion
        //terminal operation will execute only if inter operation (filter)return true
        //we can create stream
        //howe to use filter in stream api
  Long c = s.stream().filter(S->S.startsWith("R")).count();
        System.out.println(c);
        Long d = Stream.of("deek","raj","bholu","rashu").filter(S->
        {
            S.startsWith("R");
        return false;
        }).count();
        System.out.println(d);
        //print all the name of list
        s.stream().filter(S->S.length()>4).forEach(S->System.out.println(S));
        }
        @Test
    public void streamMap()
        {
            ArrayList<String> s = new ArrayList<String>();
            s.add("Deeksha");
            s.add("Bholu");
            s.add("Rajkumar");
            s.add("Raju");
            s.add("Ranuki");
            //print name which have last latter as "u" with uppercase
            Stream.of("deek","raju","bholu","rashu").filter(S->S.endsWith("u")).map(S->S.toUpperCase()).
                    forEach(S->System.out.println(S));

            //print name which have first letter as r with uppercase and sorted
            List<String> nm = Arrays.asList("raku", "raju","rata","don","shyam");
            nm.stream().filter(S->S.startsWith("r")).sorted().map(S->S.toUpperCase()).forEach(S->System.out.println(S));
       Stream<String> newStream =  Stream.concat(s.stream(),nm.stream());
     //  newStream.sorted().forEach(S->System.out.println(S));
        boolean b = newStream.anyMatch(S->S.equalsIgnoreCase("raju"));
           System.out.println(b);
        Assert.assertTrue(b);

        }
        @Test
    public void streamcollect()
        {
            //list
           List<String> ls=  Stream.of("deek","raju","bholu","rashu").filter(S->S.endsWith("u")).map(s->s.toUpperCase()).
                    collect(Collectors.toList());
           System.out.println(ls.get(0));


           //print unique no of array  and sort the array
            List<Integer> in = Arrays.asList(1,3,3,1,1,1,4,6,7,9,45,77,32,34);
           // in.stream().distinct().forEach(S->System.out.println(S));
          List<Integer>li=  in.stream().distinct().sorted().collect(Collectors.toList());
            System.out.println(li.get(4));

        }

    }

