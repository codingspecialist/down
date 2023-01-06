package down.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import down.dto.PostDto;

public class PostServiceTest {

    @Test
    public void findAll_test() {
        // given

        // when
        PostService postService = new PostService();
        PostDto[] postDtos = postService.findAll();

        // 출력하기
        for (PostDto postDto : postDtos) {
            System.out.println("post.id : " + postDto.getId());
            System.out.println("post.userId : " + postDto.getUserId());
            System.out.println("post.title : " + postDto.getTitle());
            System.out.println("post.body : " + postDto.getBody().substring(1, 30) + "...");
            System.out.println("===========================");
            System.out.println();
        }

        // verify
        assertThat(postDtos.length).isEqualTo(100);
        assertNotNull(postDtos[0].getId());
        assertNotNull(postDtos[0].getUserId());
        assertNotNull(postDtos[0].getTitle());
        assertNotNull(postDtos[0].getBody());
    }
}
