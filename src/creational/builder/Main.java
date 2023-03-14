package creational.builder;

public class Main {

    public static void main(String[] args) {
        Post post = new Post.Builder("blog-post", "javadevcentral")
                .datePosted("23/02")
                .numberOfWords(1000)
                .numberOfCharacters(5000)
                .build();
        System.out.println(post);
    }

}
