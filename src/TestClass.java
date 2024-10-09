public class TestClass {
    private int isb = 100001;
    private int intCounter = 1;
    MainMenu menu = new MainMenu();
    public void run(){
        while (isb < 100101 ){
            String counter = String.valueOf(intCounter);
            addBooksToTheLibrary("Title" + counter, "Author" + counter);
            intCounter++;
        }
        for(int i = 0; i < 1000 ; i++){
            menu.mainMenu();
        }
    }
    public void addBooksToTheLibrary(String name, String author){
        String isbn = String.valueOf(isb);
        menu.library.addBookForTest(name, author, isbn);
        isb++;
    }
}
