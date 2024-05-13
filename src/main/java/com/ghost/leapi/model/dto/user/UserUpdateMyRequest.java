package com.ghost.leapi.model.dto.user;

import java.io.Serializable;
import lombok.Data;

/**
 * 用户更新个人信息请求
 */
@Data
public class UserUpdateMyRequest implements Serializable {

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户头像
     */
    private String userAvatar;


    /**
     * ak
     */
    private String accessKey;

    /**
     * sk
     */
    private String secretKey;

    private static final long serialVersionUID = 1L;
}