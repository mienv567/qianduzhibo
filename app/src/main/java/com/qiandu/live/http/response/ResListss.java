package com.qiandu.live.http.response;


import com.qiandu.live.http.IDontObfuscate;

import java.util.List;

/**
 * @description: 列表返回数据
 *
 * @author: Andruby
 * @time: 2016/11/2 18:07
 */
public class ResListss<T>  extends IDontObfuscate {

	public List<T> data;

	@Override
	public String toString() {
		return "ResList{" +
				", data=" + data +
				'}';
	}
}
