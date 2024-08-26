package lk.zerocode.Day_24;

/*
public class SaveNumber {
    double number;

    public double getNumber() {
        return number;
    }
    public void setNumber(double number) {
        this.number = number;
    }

    public static void main(String[] args) {
        SaveNumber sv = new SaveNumber();
        byte n1 = 10;
        sv.setNumber(n1);
        System.out.println(sv.getNumber());
      //  byte result1 = sv.getNumber();  type safty issue
    }
}*/

public class SaveNumber<T>{
    T value;
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }


}

