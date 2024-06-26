package compare;

public class Card implements Comparable<Card>{
    private final Integer num, shapeCode;
    private final String[] shape={"♠","♥","\u2666","♣"};

    public Card(Integer num, Integer shapeCode) {
        this.num = num;
        this.shapeCode = shapeCode;
    }

    public Integer getNum() {
        return num;
    }

    public Integer getShapeCode() {
        return shapeCode;
    }

    @Override
    public int compareTo(Card o) {
        if(num != o.num) {
            return num.compareTo(o.num);
        }else return shapeCode.compareTo(o.shapeCode);
    }

    @Override
    public String toString() {
        return num+"("+shape[shapeCode]+")";
    }

}
