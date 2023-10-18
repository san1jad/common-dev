package com.common.vo.user;

import com.common.dto.user.AddressDTO;
import com.common.dto.user.PhoneDTO;
import lombok.Data;
import java.util.List;

@Data
public class UserVO {

    private Long id;

    private String username;

    private String email;

    private String password;

    private List<AddressDTO> addressList;

    private List<PhoneDTO> phoneList;
}
