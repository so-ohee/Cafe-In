package com.kql.caffein.service;

import com.kql.caffein.dto.User.UserDetailDto;
import com.kql.caffein.dto.User.UserDto;
import com.kql.caffein.entity.User.User;
import com.kql.caffein.entity.User.UserDetail;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public void register(UserDto userDto, UserDetailDto userDetailDto, MultipartFile multipartFile) throws Exception;
    public void register(UserDto userDto, UserDetailDto userDetailDto) throws Exception;
    public Optional<User> findByEmail(String email) throws Exception;
    public void updateUser(UserDetailDto userDetailDto) throws Exception;
    public void updateUser(UserDetailDto userDetailDto, MultipartFile multipartFile) throws Exception;
    public void deleteByUserNo(String userNo);
    public UserDetail findByUserNo(String userNo);
    public Optional<UserDetail> findByUserId(String userId);
    public List<UserDetail> findAll();
    public String getUserNo() throws Exception;
    public String uploadPicture(MultipartFile multipartFile) throws Exception;
}