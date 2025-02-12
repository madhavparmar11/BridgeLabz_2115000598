import java.util.Scanner;

class Friend {
    int friendId;
    Friend next;

    Friend(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}

class User {
    int userId;
    char[] name;
    int age;
    Friend friendList;
    User next;

    User(int userId, char[] name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendList = null;
        this.next = null;
    }

    void addFriend(int friendId) {
        Friend newFriend = new Friend(friendId);
        newFriend.next = this.friendList;
        this.friendList = newFriend;
    }

    void removeFriend(int friendId) {
        Friend temp = this.friendList, prev = null;
        while (temp != null) {
            if (temp.friendId == friendId) {
                if (prev != null) prev.next = temp.next;
                else this.friendList = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }
}

class SocialNetwork {
    User head;

    void addUser(int userId, char[] name, int age) {
        User newUser = new User(userId, name, age);
        newUser.next = this.head;
        this.head = newUser;
    }

    User searchUserById(int userId) {
        User temp = this.head;
        while (temp != null) {
            if (temp.userId == userId) return temp;
            temp = temp.next;
        }
        return null;
    }

    void addFriendConnection(int userId1, int userId2) {
        User user1 = searchUserById(userId1);
        User user2 = searchUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.addFriend(userId2);
            user2.addFriend(userId1);
        }
    }

    void removeFriendConnection(int userId1, int userId2) {
        User user1 = searchUserById(userId1);
        User user2 = searchUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.removeFriend(userId2);
            user2.removeFriend(userId1);
        }
    }

    void displayFriends(int userId) {
        User user = searchUserById(userId);
        if (user == null) return;
        Friend temp = user.friendList;
        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class SocialMediaFriendConnections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SocialNetwork network = new SocialNetwork();

        network.addUser(1, new char[]{'A', 'l', 'i', 'c', 'e', '\0'}, 25);
        network.addUser(2, new char[]{'B', 'o', 'b', '\0'}, 30);
        network.addUser(3, new char[]{'C', 'h', 'a', 'r', 'l', 'i', 'e', '\0'}, 28);

        network.addFriendConnection(1, 2);
        network.addFriendConnection(1, 3);
        network.displayFriends(1);
        network.removeFriendConnection(1, 2);
        network.displayFriends(1);

        scanner.close();
    }
}
