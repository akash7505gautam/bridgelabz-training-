package JAVA_PROGRAM;

public class prog8 {
    static class Palindrome {
        String text;
        // Palindrome(String text){
        //     this.text=text;
        // }
        void isPalindrome(String text){
            int i=0;
            int j=text.length()-1;
            while(i<j){
                if(text.charAt(i)!=text.charAt(j)){
                    System.out.println("it is not a palindromic string.");
                    break;
                }
                else{
                i++;
                j--;
                System.out.println("it is palindromic string");
                break;
                }
                
            }
            

        }
    
        
    }
    public static void main(String[] args) {
        Palindrome p1 = new Palindrome();
        p1.isPalindrome("bhavtosh");
    }
    
}
