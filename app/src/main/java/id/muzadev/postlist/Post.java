package id.muzadev.postlist;

public class Post {
    private String title;
    private String description;
    private String image;

    public Post() {
    }

    public Post(String title, String description, String image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }
}