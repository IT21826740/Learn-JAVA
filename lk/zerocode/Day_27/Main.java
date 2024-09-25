package lk.zerocode.Day_27;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        //List dataList = new ArrayList();
        List<String> dataList = new ArrayList< >();
       // List<Object> dataList = new ArrayList<Object>();
        List<String> ameList = new LinkedList<>();
        dataList.add("gihan");
        dataList.add("dilini");
        dataList.add("sohan");
        dataList.add("shehan");
        dataList.add("dil");

        System.out.println(dataList.size());

        for(String data:dataList){
            System.out.println(data);
        }

        System.out.println("----------------");

        for(int n=0; n<dataList.size(); n++){
            System.out.println(dataList.remove(n));
        }

        System.out.println(dataList.size());
        System.out.println(dataList);

        System.out.println(dataList.contains("shehan"));
        System.out.println(dataList.contains("nimantha"));

    }
}
