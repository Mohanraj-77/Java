class besant 
{
   private String mentor_name;
   private String student_name;
   private int age ;
   private String course;
   private  int rollno ;
   private String class_name ;


 public String getName()
 {
    return student_name ;
    
 }

 public void setName(String student_name)
 {
    this.student_name = student_name ;
 }

 public String getmName()
 {
    return mentor_name ;
 }

 public void setmName(String mentor_name)
 {
    this.mentor_name = mentor_name ;
 }

}

class library
{
   String book_name ;
   int  book_id ;
   String Authour ;

   public String getb_name()
   {
      return book_name ;
   }

   public void setb_name(String book_name)
   {
      this.book_name = book_name ;
   }

   public int getid()
   {
      return book_id ;
   }


   public void setid(int book_id)
   {
      this.book_id = book_id ;
   }
}

public class encap
{
    public static void main(String [] args)
    {
       besant name = new besant();
       name.setName("Mohan");
       System.out.println(name.getName());

       name.setmName("Meiy") ;
       System.out.println(name.getmName()) ;

       library n = new library();
       n.setb_name("java") ;
       System.out.println(n.getb_name());

      n.setid(23);
      System.out.println(n.getid()) ;

    }
}