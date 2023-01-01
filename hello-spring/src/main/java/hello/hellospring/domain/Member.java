package hello.hellospring.domain;

public class Member {

    private Long id; // 시스템에 저장할때 사용될 ID. 1, 2, 3, .. (시스템이 정해주는 값)
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
