package creational.builder;

public class Post {

    private final String title;

    private final String author;

    private final String datePosted;

    private final int numberOfWords;

    private final int numberOfCharacters;

    private Post(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.datePosted = builder.datePosted;
        this.numberOfWords = builder.numberOfWords;
        this.numberOfCharacters = builder.numberOfCharacters;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", datePosted='" + datePosted + '\'' +
                ", numberOfWords=" + numberOfWords +
                ", numberOfCharacters=" + numberOfCharacters +
                '}';
    }

    public static class Builder {

        private final String title;

        private final String author;

        private String datePosted = "";

        private int numberOfWords = 0;

        private int numberOfCharacters = 0;

        public Builder(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public Builder datePosted(String datePosed) {
            this.datePosted = datePosed;
            return this;
        }

        public Builder numberOfWords(int numberOfWords) {
            this.numberOfWords = numberOfWords;
            return this;
        }

        public Builder numberOfCharacters(int numberOfCharacters) {
            this.numberOfCharacters = numberOfCharacters;
            return this;
        }

        public Post build() {
            return new Post(this);
        }

    }

}
