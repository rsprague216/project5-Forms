package edu.acc.project5;

/**
 * @author Ryan Sprague
 */
public class Comment {
    String name;
    String comment;
    
    public Comment() {
        this.name = "John Doe";
        this.comment = "This is a default comment";
    }
    
    public Comment(String name, String comment) {
        this.name = name;
        this.comment = comment;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getComment() {
        return this.comment;
    }
}
