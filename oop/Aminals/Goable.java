package oop.Aminals;

public interface Goable {
    public static final String type = "Goable"; 
        public void run();
        default double getRunSpeed() {
            return 5.5;
        }   
    }
