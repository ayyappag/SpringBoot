package com.basic.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Data
public class UserProfile {

	@Getter(AccessLevel.PUBLIC)
	@Setter(AccessLevel.PUBLIC)
	private String name;
	private String group;
	private String role;

}
