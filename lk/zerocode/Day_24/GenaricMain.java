package lk.zerocode.Day_24;

public class GenaricMain {
    public static void main(String[] args) {
        SaveNumber<Integer>  sn = new SaveNumber<Integer>();
        SaveNumber<Float> sn1 = new SaveNumber<Float>();
        SaveNumber<Boolean> sn2 = new SaveNumber<Boolean>();
        SaveNumber<String> sn3 = new SaveNumber<String>();

        sn.setValue(10);
        System.out.println(sn.getValue());

        sn1.setValue(10.5f);
        System.out.println(sn1.getValue());

        sn2.setValue(true);
        System.out.println(sn2.getValue());

        sn3.setValue("dil");
        System.out.println(sn3.getValue());

    }
}
