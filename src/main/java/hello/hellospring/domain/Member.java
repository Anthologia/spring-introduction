package hello.hellospring.domain;

import javax.persistence.*;

@Entity
public class Member {

//    @Id는 PK 값을 나타낸다
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//  우리는 DB attribute도 name이기에 괜찮지만, 만약 다른 경우라면 @Column(name = "username") 와 같이 작성해서 매핑시켜야 한다
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
