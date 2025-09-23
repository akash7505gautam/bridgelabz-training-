public class prog1 {
    static class Animal{
        String name;
        int age;
        void makesound(){
            System.out.println("animal makes a sound.");
        }
    }
    static class Dog extends Animal{
        @Override
        void makesound(){
            System.out.println("Dog makes sound");
        }
    }
    static class Bird extends Animal{
        @Override
        void makesound(){
            System.out.println("Bird makes sound");
        }
    }
    static class Cat extends Animal{
        @Override
        void makesound(){
            System.out.println("Cat makes sound");
        }
    }
    public static void main(String[] args) {
        Animal a = new Bird();
        a.makesound();
        
    }
    
}
