package singletonPattern;

public class ChocolateBoiler {
    private Boolean isEmpty;
    private Boolean isBoiled;
    public static ChocolateBoiler instance ;

    public synchronized static ChocolateBoiler getInstance(){
     if(instance == null){
         instance = new ChocolateBoiler();
     }
     return instance;
    }
    public void fill() {
        if(isEmpty){
            isEmpty = false;
            isBoiled = false;
        }
    }
    public void boil() {
        if(!isEmpty){
            isBoiled = true;
        }
    }
    private ChocolateBoiler(){
        isEmpty = true;
        isBoiled = false;
    }

}
