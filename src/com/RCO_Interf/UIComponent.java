package com.RCO_Interf;

public class UIComponent {
    private boolean isEnabled;


    public UIComponent (){
        this.isEnabled = true;
    }
    public UIComponent(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public static void initC(UIComponent com){
        DropBox db1;
        if (com instanceof DropBox){
            db1 = (DropBox)com;
            db1.setOptionSelected(1);
        }
    }

    public void render(){}

    public boolean isEnabled() {
        return isEnabled;
    }

    public void enable(){
        this.isEnabled = true;
    }

    public void disable(){
        this.isEnabled = false;
    }

}
