package M04_01;

class Title {
    private String title;

    public Title(String title) {
        this.title = title;
    }

    public Title() {
        this.title = "unknown title";
    }

    public void show() {
        System.out.println(title);
    }
}
