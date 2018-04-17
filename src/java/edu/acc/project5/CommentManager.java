package edu.acc.project5;

import java.util.ArrayList;

/**
 * @author Ryan Sprague
 */
public class CommentManager {
    ArrayList<Comment> comments = new ArrayList<> ();
    
    public Comment[] getAllComments() {
        return (Comment[]) this.comments.toArray(new Comment[]{});
    }
    
    public void addComment(Comment newComment) {
        comments.add(newComment);
    }
}
