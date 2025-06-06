package com.javaweb.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Getter
@Setter
public class UserDTO extends AbstractDTO {
    private String userName;
    private String fullName;
    private String password;
    private String retypePassword;
    private Integer status;
    private Long roleId;
    private List<RoleDTO> roles = new ArrayList<>();
    private String roleName;
    private String roleCode;
    private Map<String,String> roleDTOs = new HashMap<>();
}
