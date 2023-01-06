package down.util;

import org.junit.jupiter.api.Test;

public class FetchTest {

    @Test
    public void get_test() {
        // given
        String path = "https://jsonplaceholder.typicode.com/posts/1";

        // when
        String download = Fetch.get(path);

        // verify
        System.out.println(download);
    }

}
