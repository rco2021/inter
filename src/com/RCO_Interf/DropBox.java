package com.RCO_Interf;

public class DropBox extends UIComponent {
    private String optionSelected;
    private String [] options;

    public DropBox(String [] opt) {
        this.options = new String[opt.length];
        this.options = opt;
        this.optionSelected = "None";
    }

    @Override
    public void render() {
        System.out.println("Component: DropBox");
        System.out.println("Option Selected: " + this.optionSelected);
        System.out.println("Options available:");
        for (String s : this.options) {
            System.out.print("     ");
            System.out.println(s);
        }

        System.out.println();
        System.out.println();
    }

    public String getOptionSelected() {
        return optionSelected;
    }

    public void setOptionSelected(int index) {
        if (index - 1 <= options.length && index >= 0) {
            this.optionSelected = options[index];
        }
    } // THIS IS MY COMMENT
}
