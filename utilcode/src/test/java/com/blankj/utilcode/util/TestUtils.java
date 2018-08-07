package com.blankj.utilcode.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

/**
 * <pre>
 *     作者: robot
 *
 *     time  : 2016/08/21
 *     desc  : utils about test
 * </pre>
 */
@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class TestUtils {

    public static void init() {
        Utils.init(RuntimeEnvironment.application);
    }

    @Test
    public void test() {

    }
}