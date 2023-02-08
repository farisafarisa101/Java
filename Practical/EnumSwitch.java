enum Fruites{
    APPLE,
    BANANA,
    GRAPES,
    CHERRY;
}
class EnumSwitch{
    public static void main(String args[]){
        Fruites fr=Fruites.APPLE;
        switch(fr){
            case APPLE: System.out.println(" I am Apple!!!!!!!!!!!!!!!");
                break;
            case BANANA: System.out.println(" I am Banana!!!!!!!!!!!!!!!");
                break;
            case GRAPES: System.out.println(" I am Grapes!!!!!!!!!!!!!!!");
                break;
            case CHERRY: System.out.println(" I am Cherry!!!!!!!!!!!!!!!");
                break;

  
        }
    }
}