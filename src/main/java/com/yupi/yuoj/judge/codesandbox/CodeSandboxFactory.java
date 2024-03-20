package com.yupi.yuoj.judge.codesandbox;

import com.yupi.yuoj.judge.codesandbox.impl.ExampleCodeSandbox;
import com.yupi.yuoj.judge.codesandbox.impl.RemoteCodeSandbox;
import com.yupi.yuoj.judge.codesandbox.impl.ThirdPartyCodeSandbox;

/**
 * 代码沙箱工厂（根据字符串参数创建指定的代码沙箱实例）
 *
 * @author Fickler
 * @date 2024/3/20 9:56
 */
public class CodeSandboxFactory {

    public static CodeSandbox newInstance(String type) {
        switch (type) {
            case "example":
                return new ExampleCodeSandbox();
            case "remote":
                return new RemoteCodeSandbox();
            case "thirdParty":
                return new ThirdPartyCodeSandbox();
            default:
                return new ExampleCodeSandbox();
        }
    }

}
