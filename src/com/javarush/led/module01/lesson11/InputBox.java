package com.javarush.led.module01.lesson11;

public class InputBox extends Component{

    private String text;

    public InputBox(int x, int y, String color, String text) {
        super(x, y, color);
        super.color="black";
        this.text = text;
    }

    public String getText() {
        return text;
    }


    @Override
    public String toString() {
        return "InputBox x=" + getX() + ", y=" + getY() + ", color=" + getColor();
    }

}
