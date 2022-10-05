import jprv21artjomzaderaclasses.Author;

import jprv21artjomzaderaclasses.JPTV21Classes;

public class JPTV21OOOPProbaArtjomZadera {
    
    public static void main(String[] args){
    
        Author author1 = new Author();
        author1.setFirstname("Aleksandr");
        author1.setLastname("Pushkin");
        Book book = new Book();
        book.setCaption("Jevgeny Onegin");
        Author[] authors = new Author[1];
        author[0] = author1;
         System.out.println(book.toString());
   
         Book book2 = new Book();
         book2.setCaption("Zolotoy teljonok");
         Author author2 = new Author();
         author2.setFirstname("Jevgeny");
         author2.setLastname("Petrov");
         Author author3 = new Author();
         author3.setFirstname("Aleksandr");
         author3.setLastname("Pushkin");
         Author author2 = new Author[2];
         author[0] = author2;
         author[1] = author3;
         book2.setAuthors(authors2);
         System.out.println(book2.toString());
    }    
}
