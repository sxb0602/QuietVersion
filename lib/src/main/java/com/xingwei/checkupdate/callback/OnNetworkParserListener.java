package com.xingwei.checkupdate.callback;

import com.xingwei.checkupdate.entry.ApkSource;

/**
 * 自定义解析器
 * @author huangxingwei(xwdz9989@gmail.com)
 * @since v0.0.1
 */
public interface OnNetworkParserListener {

    ApkSource parser(String response);
}
