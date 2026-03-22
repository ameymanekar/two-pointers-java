package org.example;

import java.util.*;

// -----------------------------
// 1️⃣ DTO (Data Transfer Object)
// Used to transfer user data
// -----------------------------
class UserDTO {

    int id;
    String name;
    int age;
    boolean active;

    // Constructor
    public UserDTO(int id, String name, int age, boolean active) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.active = active;
    }

    // toString method for printing object
    public String toString() {
        return "UserDTO{id=" + id + ", name='" + name + "', age=" + age + ", active=" + active + "}";
    }
}


// -----------------------------
// 2️⃣ Main Service Class
// -----------------------------
public class BackendSimulation {

    public static void main(String[] args) {

        // -----------------------------
        // 3️⃣ List of Users (simulate DB)
        // -----------------------------
        List<UserDTO> users = new ArrayList<>();

        // add users
        users.add(new UserDTO(1, "Amey", 27, true));
        users.add(new UserDTO(2, "Rahul", 30, false));
        users.add(new UserDTO(3, "Priya", 25, true));
        users.add(new UserDTO(4, "Neha", 32, true));



        // -----------------------------
        // 4️⃣ HashMap Cache
        // userId -> UserDTO
        // -----------------------------
        HashMap<Integer, UserDTO> userCache = new HashMap<>();


        // store users in cache
        for (UserDTO user : users) {

            userCache.put(user.id, user);

        }



        // -----------------------------
        // 5️⃣ Get User from Cache
        // -----------------------------
        System.out.println("Fetching user from cache...");

        UserDTO cachedUser = userCache.get(1);

        System.out.println("User found: " + cachedUser);



        // -----------------------------
        // 6️⃣ Filtering Active Users
        // -----------------------------
        System.out.println("\nActive Users:");

        List<UserDTO> activeUsers = new ArrayList<>();

        for (UserDTO user : users) {

            if (user.active) {

                activeUsers.add(user);

            }
        }


        // print active users
        for (UserDTO user : activeUsers) {

            System.out.println(user);

        }



        // -----------------------------
        // 7️⃣ Simulated API Response
        // -----------------------------
        System.out.println("\nSimulated API Response:");

        Map<String, Object> apiResponse = new HashMap<>();

        apiResponse.put("status", "success");
        apiResponse.put("totalUsers", users.size());
        apiResponse.put("activeUsers", activeUsers);



        // print response
        for (Map.Entry<String, Object> entry : apiResponse.entrySet()) {

            System.out.println(entry.getKey() + " : " + entry.getValue());

        }



        // -----------------------------
        // 8️⃣ Removing User from Cache
        // -----------------------------
        System.out.println("\nRemoving user with ID 2 from cache");

        userCache.remove(2);



        // print remaining cache
        System.out.println("Remaining Cache:");

        for (Map.Entry<Integer, UserDTO> entry : userCache.entrySet()) {

            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }

    }
}
