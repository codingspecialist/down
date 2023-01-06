package down.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {
    private Integer id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

    @Setter
    @Getter
    public class Address {
        private String street;
        private String suite;
        private String city;
        private String zipcode;
        private Geo geo;

        @Setter
        @Getter
        public class Geo {
            private String lat;
            private String lng;
        }
    }

    @Setter
    @Getter
    public class Company {
        private String name;
        private String catchPhrase;
        private String bs;
    }
}
