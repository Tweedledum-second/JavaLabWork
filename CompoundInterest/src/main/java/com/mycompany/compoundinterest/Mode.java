package com.mycompany.compoundinterest;

public enum Mode {
    PERCENT,
    CYCLE;
    
    private String mode;
    
    Mode(){
        this.mode = this.name().toLowerCase();
    }
    
    public String getMode() {
        return mode;
    }
}
