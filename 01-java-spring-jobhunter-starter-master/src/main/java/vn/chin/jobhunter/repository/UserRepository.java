package vn.chin.jobhunter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.chin.jobhunter.domain.User;

public interface UserRepository  extends JpaRepository<User, Long> {
    

}
