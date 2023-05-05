

public class backtracking {
    public static void  printPermutation(String str,String perm, int idx){
        if(str.length()==0){
            System.out.println(perm);
            return;

        }
        for(int j=0; j<str.length(); j++){
char currChar =str.charAt(j);
String newStr = str.substring(0,1)+str.substring(j+1);
printPermutation(newStr,perm+currChar,idx+1);

        }
    }
  public static void main(String[] args) {
    String str="ABC";
    printPermutation(str,"",0);
  }  
}
