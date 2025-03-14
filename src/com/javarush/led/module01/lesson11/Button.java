package com.javarush.led.module01.lesson11;

public class Button extends Component {

    private int size;
    private String hint;

    public Button(int x, int y, String color, int size, String hint) {
        super(x, y, color);
        this.size = size;
        this.hint = hint;
    }


    @Override
    public String toString() {
        return String.format("Button x=%d, y=%d, color=%s, size=%d, hint=%s"
                , this.getX(), getY(), color, size, hint);
    }

}
