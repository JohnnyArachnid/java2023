package org.studentresource.decorator;

import org.studentresource.StudentResource;

// This class should allow adding comments to the resource
public class CommentableResource extends ResourceDecorator {
    private String comment;
    public CommentableResource(StudentResource decoratedResource) {
        super(decoratedResource);
    }
    public String getComment() { return this.comment; }
    public void addComment(String comment) { this.comment = comment; }

    // Implement commenting features
}
