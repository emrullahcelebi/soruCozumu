package java_soruCozumu;

public class Clock {
    public static void main(String[] args) {
        //kullanicidan 2 sayi girmesibi isteyecegiz girikeb bu degerkerden biri saati digeri de dakikayi
        //temsill edecek. bize akrep ile yelkoven arasindaki kucuk aciyi hesaplayan degeri acisa olarak donduren methodu yaziniz
        //input hour 12 , minutes 30
        //output 165

        System.out.println("angleClock(12,30) = " + angleClock(12, 30));

    }
    public static double angleClock(int hour, int minute){
        double ek=(double) minute/12;
        double hourAngle=((hour%12)*30)+(ek*6);//akrebin acisi
        double newMinute=(double) minute/5;//yelkovanin acisi
        double minuteAngle=newMinute*30;
        double angle=Math.abs(hourAngle-minuteAngle);

        if (angle>180) return (360-angle);
        else return angle;

    }
}
