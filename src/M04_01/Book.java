package M04_01;

class Book {
    private Title title;
    private Author author;
    private Content content;

    public Book(Title title, Author author, Content content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public Book() {

    }

    public void show(){
        this.title.show();
        this.author.show();
        this.content.show();
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }
}
