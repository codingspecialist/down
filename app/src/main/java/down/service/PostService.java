package down.service;

import com.google.gson.Gson;

import down.dto.PostDto;
import down.util.Fetch;

public class PostService {

    public PostDto[] findAll() {
        // 1. Fetch로 다운받기
        String path = "https://jsonplaceholder.typicode.com/posts";
        String download = Fetch.get(path);

        // 2. 파싱하기
        Gson gson = new Gson();
        PostDto[] postDtos = gson.fromJson(download, PostDto[].class);

        return postDtos;
    }
}
