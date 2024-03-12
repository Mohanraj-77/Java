class psna
{
    String college_name;
    int college_id ;                  //we can call either class or class constructor
    int totalmembers ;
    int totaldepts ;



  /*psna (String college_name , int college_id , int tm,int totaldept)   //constructor
 {
    this.college_name = college_name ;        //this keyword is used when the name  is passed as parameter in the constructor
    this.college_id = college_id ;              
    totalmembers = tm ;
    totaldepts = totaldept ;
        
 }   */   

}




public class clsone
{
    public static void main(String[] args)
     {
          psna m = new psna();
          m.college_name = "Psna" ;
          m.college_id = 9213 ;
          m.totalmembers = 2000 ;
          m.totaldepts = 13 ;
              

          System.out.println(m.college_name) ;
          System.out.println(m.college_id) ;
          System.out.println(m.totalmembers) ;
          System.out.println(m.totaldepts) ;

          System.out.println("************************") ;
           /* psna clg = new psna ("ssm" , 2134 , 2000 , 7) ;  
           System.out.println(clg.college_name) ;
           System.out.println (clg.college_id) ;
           System.out.println(clg.totalmembers) ;     // to print constructor we have to call the initialization name in class (not the new name passed in the constructor)
           System.out.println(clg.totaldepts); */
    }
}