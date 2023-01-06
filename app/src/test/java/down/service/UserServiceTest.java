package down.service;

import org.junit.jupiter.api.Test;

import down.dto.UserDto;

public class UserServiceTest {

    @Test
    public void findOne_test() {
        // given

        // when
        UserService userService = new UserService();
        UserDto userDto = userService.findOne();

        // verify
        System.out.println(userDto.getId());
        System.out.println(userDto.getUsername());
        System.out.println(userDto.getAddress().getCity());
        System.out.println(userDto.getAddress().getGeo().getLat());
        System.out.println(userDto.getCompany().getName());
    }
}
