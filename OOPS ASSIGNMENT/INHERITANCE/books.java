

public class prog3 {
    static class Book{
        String title;
        int pubyear;
        Book(String title,int pubyear){
            this.title=title;
            this.pubyear=pubyear;
        }

    }
    static class Author extends Book{
        String name;
        String bio;
        Author(String title,int pubyear,String name,String bio){
            super(title,pubyear);
            this.name=name;
            this.bio=bio;
        }
        void displayinfo(){
            System.out.println("title is "+title+"pub year is "+pubyear+"and name of author is "+name+" bio is "+bio);
        }

    }
    public static void main(String[] args) {

        Author a = new Author("the gold",2000,"hemant","null");
        a.displayinfo();
    }
    
}
