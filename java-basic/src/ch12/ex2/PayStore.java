package ch12.ex2;

public abstract class PayStore {
    public static Pay findPay(String option) {
        if(option.equals("kakao")){
            return new KakaoPay();
        }else if(option.equals("naver")){
            return new KakaoPay();
        }else{
            return new DefaultPay();
        }
    }
}
