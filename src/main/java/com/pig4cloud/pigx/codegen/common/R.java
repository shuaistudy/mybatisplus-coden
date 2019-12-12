/*
 *
 *      Copyright (c) 2018-2025, gekft All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *  Neither the name of the pig4cloud.com developer nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *  Author: gekft (wangiegie@gmail.com)
 *
 */

package com.pig4cloud.pigx.codegen.common;


import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 响应信息主体
 *
 * @param <T>
 * @author gekft
 */
@Builder
@ToString
@Accessors(chain = true)
@AllArgsConstructor
public class R<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	private int code = 200;

	@Getter
	@Setter
	private String msg = "success";


	@Getter
	@Setter
	private T data;

	public R() {
		super();
	}

	public R(T data) {
		super();
		this.data = data;
	}

	public R(T data, String msg) {
		super();
		this.data = data;
		this.msg = msg;
	}

//	public R(Throwable e) {
//		super();
//		this.msg = e.getMessage();
//		this.code = CommonConstant.FAIL;
//	}
//
//	public static R failure(BaseException base) {
//		return failure(Exceptions.parse( base.getCode()));
//	}
//
//	public static R failure(Exceptions exceptions) {
//		R result = new R();
//		result.setCode(exceptions.getCode());
//		result.setMsg(exceptions.getLabel());
//		return result;
//	}
}
