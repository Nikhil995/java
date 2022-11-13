class FactorialExample{  
    public static void main(String[] args){  
     int i,fact=1;  
      int n=Integer.parseInt(args[0]);
     for(i=1;i<=n;i++){    
         fact=fact*i;    
     }    
     System.out.println(fact);    
    }  
   }  