public enum Product {
    APPLE ("Яблоко"), WATTER ("Вода"), POTATO ("Картошка"), JUICE ("Сок"), MEAT ("Мясо");

    private String title;

    Product(String string) {
        this.title = string;
    }

    public String getTitle() {
        return title;
    }
}
