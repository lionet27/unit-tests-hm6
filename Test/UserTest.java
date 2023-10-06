
import org.junit.jupiter.api.Test;
import seminars.third.tdd.User;
import seminars.third.tdd.UserRepository;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    /**
     * 3.6. Нужно написать класс User (пользователь) с методом аутентификации по логину и паролю,
     * (В метод передаются логин и пароль, метод возвращает true, если пароль и логин совпадают, иначе - false)
     */
    @Test
    void userCreation() {
        User user = new User("user1", "ps111", false);
        assertTrue(user.authenticate("user1", "ps111"));
    }

    @Test
    void userCreationFailed() {
        User user = new User("user1", "ps111", false);
        assertFalse(user.authenticate("user1", "psw111"));
    }

    /**
     * 3.7. Нужно добавить класс UserRepository (Хранилище для работы с пользователями)
     * (В метод передается пользователь, если он зарегистрирован в системе (authenticate возвращает true)
     * то он попадает в список пользователей системы.
     */
    @Test
    void userRepository() {
        UserRepository userRepository = new UserRepository();
        User user1 = new User("user1", "ps111", false);
        userRepository.addUser(user1);
        assertFalse(userRepository.findByName(user1.name));
    }

    @Test
    void userRepositoryNA() {
        UserRepository userRepository = new UserRepository();
        User user1 = new User("user1", "ps111", false);
        user1.authenticate("user1", "psw23");
        userRepository.addUser(user1);
        assertFalse(userRepository.findByName(user1.name));
    }

    @Test
    void adminHasAccessListUsers() {

        //  User userAdmin = new User("user_a", "psw123", true);
        UserRepository userRepository = new UserRepository();

        User userNotAdmin1 = new User("user0", "psw0", false);
        User userNotAdmin2 = new User("user1", "psw1", false);

        //   userAdmin.authenticate("user_a","psw123");
        userNotAdmin1.authenticate("user0", "psw0");
        userNotAdmin2.authenticate("user1", "psw1");

        //   userRepository.addUser(userAdmin);
        userRepository.addUser(userNotAdmin1);
        userRepository.addUser(userNotAdmin2);

        userRepository.logoutAll();

        assertFalse(userNotAdmin1.isAuthenticate);

    }
}
