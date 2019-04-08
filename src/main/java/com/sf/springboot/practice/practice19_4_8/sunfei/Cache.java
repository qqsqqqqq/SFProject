package com.sf.springboot.practice.practice19_4_8.sunfei;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Cache {

	public static Map<String, Object> CACHE = new HashMap<String, Object>();
	// 读写锁
	private static ReentrantReadWriteLock REENTRANTREADWRITELOCK = new ReentrantReadWriteLock();
	// 读锁
	private static Lock r = REENTRANTREADWRITELOCK.readLock();
	// 写锁
	private static Lock w = REENTRANTREADWRITELOCK.writeLock();

	// 获取一个key对应的value
	public static final Object get(String key) {
		r.lock();
		try {
			return CACHE.get(key);
		} finally {
			r.unlock();
		}
	}

	// 设置key对应的value，并返回旧的value
	public static final Object put(String key, Object value) {
		w.lock();
		try {
			return CACHE.put(key, value);
		} finally {
			w.unlock();
		}
	}

	// 清空所有的内容
	public static final void clear() {
		w.lock();
		try {
			CACHE.clear();
		} finally {
			w.unlock();
		}
	}

}
