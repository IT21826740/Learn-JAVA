public class RiceCooker {
    
    //method name and variable always camalcase 
    void switchOn(){
        System.out.println("RiceCooker is switched on");
        
    }

    void switchOff(){
        System.out.println("RiceCooker is switched off");
    }

    
    String cookRice(){
        switchOn();
        System.out.println("cooking rice");
        switchOff();

       return("freshly cooked rice");
        
    }

    
}
