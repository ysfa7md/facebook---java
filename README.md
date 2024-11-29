# instructions
- A FB user does have an email, name, password, gender, and a birthdate, The user can write an endless number of posts.
- A post has an ID, users’ comments, tagged users and it should have two privacy options (Public or Friends only).
- A comment has an ID and users’ replies.
- And each of the posts, comments, and replies do have a number of reactors or likers.
- The user also can do more than one conversation.
- Each conversation has an ID, comprises a number of messages and has a number of participants.
- Each user can have any number of friends.
- The user friends can be a regular friend or a restricted one.

## classes
- post
- comment (inherit from post)
- conversation (abstract)
    - chat
- user
...


# contributors

## Loay morad
7. See posts of other users according to the posts’ privacy level
12. A restricted friend of the user can see his public posts only

## Hisham
3. Like/write posts
4. Tag people to posts

## yossf
5. Like/write comments on posts
6. Like/Reply to a comment

## Molly
1. Create an account
2. Log in his account if the password provided was correct

## abdelrahman
8. See the friendship between any two users by using + operator
(this should show all the common posts between them)
9. See the mutual friends between any two users by using the & operator

## michael
10. Search for/Add friends
11. Send messages

# Notes
- all contributors must add the GUI from begiing with using javafx
1. You should implement all concepts of OOP.
2. Each member MUST work on at least one of the required classes besides file processing or GUI. (Individual marks)
3. The evaluation will be mainly based on the student’s ability to use and apply OOP concepts and the explanation of the code.
4. You must deliver the Class Diagram for the project.
5. You must apply exception handling.
6. Any project must have at least 8 classes
7. Regarding files:
  - You must have only two functions for file reading and writing.
  - You should read data once at the beginning of your run then do your operations and access the code then save in files at the end of your program.
