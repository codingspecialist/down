package down.service;

import com.google.gson.Gson;

import down.dto.PostDto;
import down.dto.UserDto;
import down.util.Fetch;

public class UserService {

    public UserDto findOne() {
        // 1. Fetch로 다운받기
        String path = "https://jsonplaceholder.typicode.com/users/1";
        String download = Fetch.get(path);

        // 2. 파싱하기
        Gson gson = new Gson();
        UserDto userDto = gson.fromJson(download, UserDto.class);

        return userDto;
    }
}
