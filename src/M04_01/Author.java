package M04_01;

class Author {
    private String author;

    public Author(String author) {
        this.author = author;
    }

    public Author() {
        this.author = "unknown author";
    }

    public void show() {
        System.out.println(author);
    }
}
