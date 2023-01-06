package down.temp;

import org.junit.jupiter.api.Test;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
class Dog {
    private Integer id;
    private String name;

    public Dog() {
    }

    public Dog(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Dog(DogDto dogDto) {
        this.id = dogDto.getId();
        this.name = dogDto.getName();
    }

}

@Getter
@Setter
class DogDto {
    private Integer id;
    private String name;

    public DogDto() {
    }

    public DogDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

}

public class CopyTest {

    @Test
    public void copyBasic_test() {
        // given
        DogDto dogDto = new DogDto(); // id, name, getId(), getName(), setId(), setName()
        dogDto.setId(1);
        dogDto.setName("토토");

        Integer id = dogDto.getId();
        String name = dogDto.getName();
        // System.out.println(id);
        // System.out.println(name);

        // when
        Dog dog = new Dog();
        dog.setId(id);
        dog.setName(name);

        // verify
        System.out.println(dog.getId());
        System.out.println(dog.getName());
    }

    @Test
    public void copyHigh_test() {
        DogDto dogDto = new DogDto(1, "토토");

        Dog dog = new Dog(
                dogDto.getId(),
                dogDto.getName());

        Dog dog2 = new Dog(
                dogDto.getId(),
                dogDto.getName());

        Dog dog3 = new Dog(dogDto);
        System.out.println(dog3.getId());
        System.out.println(dog3.getName());
    }
}
