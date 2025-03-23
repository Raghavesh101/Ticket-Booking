package service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.User;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

public class UserBookingService {
    private User user;
    private static final String USERS_PATH = "../localDB/users.json";
    private List<User> usersList;
    private ObjectMapper objectMapper = new ObjectMapper();
    public UserBookingService(User user) throws IOException {
        this.user = user;
    }
    public UserBookingService() throws IOException {
        loadUserListFromFile();
    }
    private void loadUserListFromFile() throws IOException {
        usersList = objectMapper.readValue(new File(USERS_PATH), new TypeReference<List<User>>() {});
    }
    public Boolean loginUser(){
        Optional<User> foundUser = usersList.stream().filter(user1 -> {
            return user1.getName().equals(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(), user1.getHashedPassword());
        }).findFirst();
        return foundUser.isPresent();
    }

    public Boolean signUp(User user1){
        try{
            usersList.add(user1);
            saveUserListToFile();
            return Boolean.TRUE;
        }catch (IOException ex){
            return Boolean.FALSE;
        }
    }
}
