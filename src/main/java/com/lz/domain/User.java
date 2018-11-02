package com.lz.domain;

import lombok.Builder;
import lombok.Data;

/**
 * User class
 *
 * @author wjh
 * @date 2018/11/2
 */
@Data
public class User {
	private Integer id;
	private  String username;
	private  int age;
}
