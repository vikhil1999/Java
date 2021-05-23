class searching {
      
    public void linearserach(Filedata[] f,String item){
    try{
    for(int i = 0; i<19923; i++)  
    {  
        if(f[i].pid.equals(item))  
        {  
            
            System.out.println("Item found ,details are : ");
        System.out.println(i+" "+f[i].pid+", "+f[i].product_name +", "+f[i].brand+", "+f[i].product_url +", "+f[i].retail_price+", "+f[i].discounted_price+", "+f[i].product_rating);
            break;  
        }  
    }  
}catch(Exception e){}
      
        
    
}
}
