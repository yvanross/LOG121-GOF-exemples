package Facade.Message;

public class MessageDemo {


  public static void main(String[] args) {
   MessageCreatorFacade messageCreator1 = new MessageCreatorFacade("yvan.ross@gmail","cc-yvan.ross@gmail.com","This is a facade pattern demo");
   messageCreator1.setHeaderField("token", "09328453ijoweldsfja09sduf9");
   messageCreator1.setMessageBody(new RichTextString("This is the body"));
   messageCreator1.setSignMessage(true);
   messageCreator1.send();


   MessageCreatorFacade messageCreator2 = new MessageCreatorFacade(
     "yvan.ross@gmail",
     "cc-yvan.ross@gmail.com",
     "This is a facade pattern demo"
     );
     RichText richText = new RichTextString("This is another body");
     messageCreator2.setMessageBody(richText);
     messageCreator2.send();

 }
  
}