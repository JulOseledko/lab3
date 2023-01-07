package Dop;

public enum Body{
    EYES("из глаз"), HEAD1("с головы"), HEAD2("по головке"), FACE("лицом"), HAIR("волосы"), HAND("из рук"), BREAST("на колени"), LAP("грудь");
    private String value;
    Body(String s){
        this.value = s;
    }

    @Override
    public String toString(){
        return value;
    }
}
