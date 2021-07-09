package com.RCO_Interf;

public class TextBox extends UIComponent {
    private String text;

    public TextBox(){
        this.text = "Empty";
    }


    public TextBox(String text) {
        this.text = text;

    }

    @Override
    public void render() {
        System.out.println("Component: TextBox");
        System.out.println("Value: " + this.text);
        System.out.println();
        System.out.println();
    }

    public void setText(String text) {
        this.text = text;
    }

    public String  getText(){
        return this.text;
    }
}
