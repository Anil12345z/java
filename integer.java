public class integer {
   
        public static void main(String[] args) {
            int a=0 , num= 123456;
            while(num!=0){
                num/=10;
                ++a;
            }
        
            
            System.out.println("no of digit"+ a);
        
        }  
}
