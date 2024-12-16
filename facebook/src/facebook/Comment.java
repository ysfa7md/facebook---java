package com.example.postcomment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Comment implements Serializable {
    private int countReply; // Reply counter specific to this comment
    private final String userName;
    private final String commentId;
    private String content;
    private String mention ;
    private int numOfLike;
    private List<String> userNameReact;
    private List<Reply> replies;
    public Comment(String userName, String postId, String content) {
        this.userName = userName;
        this.commentId = postId ;
        this.content = content;
        this.countReply =0 ; // Initialize reply counter
        this.replies = new ArrayList<>();
        this.userNameReact = new ArrayList<>();
        this.numOfLike = 0;
    }

    public String getMention() {
        return mention;
    }

    public void setMention(String mention) {
        this.mention = mention;
    }

    public int getNumOfLike() {
        return numOfLike;
    }

    public void setNumOfLike(int numOfLike) {
        this.numOfLike = numOfLike;
    }

    public void addReply(String userName,String content) {
        String replyId = commentId + '.' + countReply;
        Reply reply = new Reply(userName, replyId, content);
        this.replies.add(reply);
        countReply++; // Increment the reply counter for this comment
    }

    public List<String> getUserNameReact() {
        return userNameReact;
    }

    public String getCommentId() {
        return commentId;
    }

    public String getUserName() {
        return userName;
    }

    public String getContent() {
        return content;
    }

    public List<Reply> getReplies() {
        return replies;
    }

    public void add_RemoveReaction(String userName) {
        if (!userNameReact.contains(userName)) {
            numOfLike++;
            setNumOfLike(numOfLike);
            userNameReact.add(userName);
            System.out.println(numOfLike);
        } else {
            numOfLike--;
            setNumOfLike(numOfLike);
            userNameReact.remove(userName);
            System.out.println(numOfLike);
        }
    }

    @Override
    public String toString() {
        return "Comment{" +
                "userName='" + userName + '\'' +
                ", commentId='" + commentId + '\'' +
                ", content='" + content + '\'' +
                ", numOfLike=" + numOfLike +
                ", userNameReact=" + userNameReact +
                ", replies=" + replies +
                '}';
    }
}
